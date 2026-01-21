package PageObjectModel;

import Utils.SeleniumCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends SeleniumCommands
{
    String loginButton = "//a[text()='Log in']";
    String Email = "//input[@id='Email']";
    String Password = "//input[@id='Password']";
    String LoginButtonEnd = "//input[@value='Log in']";
    String Logout = "//a[text()='Log out']";



     public  void ClickInitialLoginButton()
     {
         WebElement Login = driver.findElement(By.xpath(loginButton));
         RClick(Login);
     }
     public void EnterUserName(String Username)
     {
         WebElement email = driver.findElement(By.xpath(Email));
         TypeInto(email,Username);
     }
     public void EnterPassword(String Passwordin)
     {
         WebElement password = driver.findElement(By.xpath(Password));
         TypeInto(password,Passwordin);
     }
     public void ClickLoginEnd()
     {
         WebElement endLogin = driver.findElement(By.xpath(LoginButtonEnd));
         RClick(endLogin);
     }
     public void VerifyLogoutButton()
     {
         WebElement logoutbutton = driver.findElement(By.xpath(Logout));
         if(logoutbutton.isDisplayed())
         {
             System.out.println("Logout BUtton is displayed nd user is succesfull logged in ");
         }
         else
         {
             System.out.println("User has not logged in or alredy loggedin ");
         }
     }

}

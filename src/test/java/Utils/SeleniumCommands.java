package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class SeleniumCommands
{
    public static WebDriver driver;
    public void OpenUrl()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }
    public void RClick(WebElement ele)
    {
        ele.click();
    }
    public void TypeInto(WebElement ele , String s)
    {
        ele.sendKeys(s);
    }
    public void CloseBrowser()
    {
        driver.close();
    }
}

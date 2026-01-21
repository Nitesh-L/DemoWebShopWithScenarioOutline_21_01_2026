package StepDefinations;

import PageObjectModel.LoginPage;
import Utils.SeleniumCommands;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends SeleniumCommands
{
    LoginPage l = new LoginPage();
    @Given("User needs to enter the URL")
    public void user_needs_to_enter_the_url()
    {
        OpenUrl();
    }
    @When("User needs to enter te login Cred {string} and {string}")
    public void user_needs_to_enter_te_login_cred_and(String UserName, String Password)
    {
        l.ClickInitialLoginButton();
        l.EnterUserName(UserName);
        l.EnterPassword(Password);
        l.ClickLoginEnd();
    }
    @Then("User needs to verify login")
    public void user_needs_to_verify_login()
    {
        l.VerifyLogoutButton();
    }

}

package StepDefinition;

import com.qa.pages.ConduitLoginObjectMap;
import com.qa.util.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ConduitLogin extends Baseclass{

    ConduitLoginObjectMap page = new ConduitLoginObjectMap();

    @Given("^User is already on Home Page$")
    public void user_is_already_on_Home_Page() throws Throwable {
        ConduitLoginObjectMap.initialization();
        String title = page.getPageTite();
        System.out.println(title);
        Assert.assertEquals("Conduit",title);

    }

    @When("^User clicks on \"([^\"]*)\" link$")
    public void user_clicks_on_link(String arg1) throws Throwable {
        page.clickSignIn();
    }

    @When("^User enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        page.emailInputBox.sendKeys(prop.getProperty("username"));
        page.passwordInputBox.sendKeys(prop.getProperty("password"));
    }

    @When("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {
        page.signInBtn.click();
    }

    @Then("^User is on Home page$")
    public void user_is_on_Home_page() throws Throwable {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Conduit",title);

    }
}

package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.actions.AddItemPageActions;
import pages.actions.HomePageActions;
import pages.actions.LoginPageActions;

/**
 * Created by student09 on 16.12.15.
 */
public class AddItemSteps {

    private HomePageActions homePageActions = new HomePageActions();
    private LoginPageActions loginPageActions = new LoginPageActions();
    private AddItemPageActions addItemPageActions = new AddItemPageActions();


    @Given("^I am logged into the system as user and add item$")
    public void iAmLoggedIntoTheSystemAsUserAndAddItem() throws Throwable {

        homePageActions.openHomePage();
        homePageActions.goToLoginPage();
        loginPageActions.signInUser("artur", "123456");
    }

    @When("^I added item$")
    public void iAddedItem() throws Throwable {
        homePageActions.goToAddItemPage();
        addItemPageActions.AddItem();
    }

    @Then("^add item$")
    public void addItem() throws Throwable {
        Assert.assertFalse(addItemPageActions.isItemAdded());

    }
}

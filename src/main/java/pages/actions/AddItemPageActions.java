package pages.actions;

import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.openqa.selenium.support.PageFactory;
import pages.locators.AddItemLocators;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

/**
 * Created by student09 on 16.12.15.
 */
public class AddItemPageActions {
    private AddItemLocators locators;


    public AddItemPageActions() {
        this.locators = new AddItemLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }


    public void AddItem() {

        locators.ItemTypeInput.sendKeys("50");
        locators.ItemAmmountInput.clear();
        locators.ItemAmmountInput.sendKeys("2");
        locators.AddItemButton.click();
    }

    public boolean isItemAdded() {
        return SeleniumHelper.isElementPresent(locators.AddItemLink);
    }

}




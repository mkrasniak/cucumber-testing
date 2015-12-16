package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student09 on 16.12.15.
 */
public class AddItemLocators {


    @FindBy(how = How.XPATH, using = "html/body/nav/ul/li[5]/a")
    public WebElement AddItemLink;

    @FindBy(how = How.XPATH, using = ".//*[@id='itemType']")
    public WebElement ItemTypeInput;

    @FindBy(how = How.XPATH, using = ".//*[@id='amount']")
    public WebElement ItemAmmountInput;

    @FindBy(how = How.XPATH, using = "html/body/form/table/tbody/tr[3]/td/button")
    public WebElement AddItemButton;
}

package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountInformationPage extends BasePage{

    @FindBy(css = "#form-customer > fieldset > div:nth-child(2) > div > #input-firstname")
    private WebElement displayedFirstName;

    @FindBy (css ="#form-customer > fieldset > div:nth-child(3) > div > #input-lastname")
    private WebElement displayedLastName;

    @FindBy (css = "#form-customer > fieldset > div:nth-child(4) > div > #input-email")
    private WebElement displayedEmail;

    public EditAccountInformationPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstName(){
        return displayedFirstName.getAttribute("value");
    }
    public String getLastName(){
        return displayedLastName.getAttribute("value");
    }
    public String getEmailAddress(){
        return displayedEmail.getAttribute("value");
    }

}

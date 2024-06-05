package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends BasePage {
    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-password")
    private WebElement inputPassword;

    @FindBy(css = "#form-login > div.text-end > button")
    private WebElement clickLoginButton;


    public AccountLoginPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void setEmailInput(){
        inputEmail.sendKeys("m5@gmail.com");
    }

    public void setPasswordInput(){
        inputPassword.sendKeys("Kanker1125#");
    }

    public void clickLoginButton(){
        clickLoginButton.click();
    }

}
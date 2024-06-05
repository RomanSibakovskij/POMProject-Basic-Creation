package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccountPage extends BasePage{

    @FindBy(css = "#column-right > div > a:nth-child(1)")
    private WebElement myAccount;
    @FindBy(css = "#column-right > div > a:nth-child(2)")
    private WebElement editAccount;

    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccountLink(){
        myAccount.click();
        if(myAccount.isSelected()){
            System.out.println("The tab was selected");
        }else{
            System.out.println("The tab wasn't selected");
        }
    }
    public void clickEditAccountLink(){
        editAccount.click();
    }

}

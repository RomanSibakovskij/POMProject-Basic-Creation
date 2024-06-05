package lt.techin.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    @FindBy (css = "#top > div > div.nav.float-end > ul > li:nth-child(2) > div > a")
    private WebElement dropmenuClick;
    @FindBy(css = "#top > .container > div.nav.float-end > ul > li:nth-child(2) > div > ul > li:nth-child(2) > a")
   private WebElement loginClick;

    @FindBy(css = "#content > div.row.row-cols-1.row-cols-sm-2.row-cols-md-3.row-cols-xl-4 > div:nth-child(1) > div > div.content > form > div > button:nth-child(1)")
    private WebElement productForShoppingCartSelect;

    @FindBy(css = "#header-cart > div > button")
    private WebElement shoppingCartButton;

    @FindBy(css = "#header-cart > div > ul > li > div > p > a:nth-child(1)")
    private WebElement viewCartLinkSelection;

    @FindBy(css = "#header-cart > div > ul > li > div > p > a:nth-child(2)")
    private WebElement checkoutLinkSelection;



    public HomePage(WebDriver driver) {
        super(driver);
    }



        public void DropMenuClick(){
        dropmenuClick.click();

        }

        public void clickLogin() {
        loginClick.click();

        }

        public void productSelect(){
        productForShoppingCartSelect.click();
        }

        public void shoppingCartButtonSelection(){
        shoppingCartButton.click();
        }

        public void viewCartLink(){
        viewCartLinkSelection.click();
        }

        public void checkoutLink(){
        checkoutLinkSelection.click();
        }


}

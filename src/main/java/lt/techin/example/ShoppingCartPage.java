package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(css = "#shopping-cart > div > table > tbody > tr > td.text-center > a > .img-thumbnail")
    private WebElement productImage;
    @FindBy(css = "#shopping-cart > div > table > tbody > tr > td.text-start.text-wrap > a")
    private WebElement productLink;

    @FindBy(css = "#shopping-cart > div > table > tbody > tr > td:nth-child(4) > form > div > input.form-control")
    private WebElement productQuantity;

    @FindBy(css = "#checkout-total > tr:nth-child(1) > td:nth-child(2)")
    private WebElement productPriceBeforeTaxes;

    @FindBy(css = "#checkout-total > tr:nth-child(4) > td:nth-child(2)")
    private WebElement productPriceAfterTaxes;

    @FindBy(css = "#content > div.row > div:nth-child(1) > a")
    private WebElement continueShoppingButton;
    @FindBy(css = "#content > div.row > div.col.text-end > a")
    private WebElement checkoutButton;

    @FindBy(css = "#content > div.row > div.col.text-end > a")
    private WebElement isCheckoutButtonClickable;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isImageDisplayed(){
        if(productImage.isDisplayed()){
            return true;
        }
        return false;
    }

    public boolean isLinkPresent(){
        if(productLink.isDisplayed()){
            return true;
        }
        return false;
    }

    public int getProductQuantity(){
        if(productQuantity != null){
            return Integer.parseInt(productQuantity.getAttribute("value"));
        }
        return 0;
    }

    public double getProductPriceBeforeTaxes(){
        if (productPriceBeforeTaxes != null) {
            String value = productPriceBeforeTaxes.getAttribute("value");
            System.out.println(value);
            if (value != null) {
                return Double.parseDouble(value);
            }
        }
        return 0.0;
    }

    public double getProductPriceAfterTaxes(){
        if (productPriceAfterTaxes != null) {
            String value = productPriceAfterTaxes.getAttribute("value");
            System.out.println(value);
            if (value != null) {
                return Double.parseDouble(value);
            }
        }
        return 0.0;
    }

    public boolean isContinueShoppingButtonPresent(){
        if(continueShoppingButton.isDisplayed()){
            return true;
        }
        return false;
    }

    public boolean isCheckoutButtonPresent(){
        if(checkoutButton.isDisplayed()){
            return true;
        }
        return false;
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }
}

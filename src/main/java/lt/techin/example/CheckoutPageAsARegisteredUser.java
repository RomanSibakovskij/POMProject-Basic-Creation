package lt.techin.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageAsARegisteredUser extends BasePage{

    @FindBy(xpath = "//input[@id='input-guest']")
    private WebElement guestCheckoutSelector;

    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='input-shipping-address-1']")
    private WebElement inputAddress1;

    @FindBy(xpath = "//input[@id='input-shipping-city']")
    private WebElement inputCity;

    @FindBy(xpath = "//input[@id='input-shipping-postcode']")
    private WebElement inputPostCode;

    @FindBy(css = "#input-shipping-country")
    private WebElement clickCountryDropDownMenu;
    @FindBy(xpath = "//Select/option[240]")
    private WebElement countrySelect;

    @FindBy(css = "#input-shipping-zone")
    private WebElement regionStateSelectDropdownMenu;

    @FindBy(css = "#input-shipping-zone > option:nth-child(63)")
    private WebElement selectedRegionStateFromList;

    @FindBy(css = "#checkout-payment > div > button")
    private WebElement confirmCheckoutButton; //the button doesn't work

    public CheckoutPageAsARegisteredUser(WebDriver driver) {
        super(driver);
    }

    //
    public void isSelectGuestCheckoutPresentAndEnabled(){
        if(guestCheckoutSelector.isEnabled() && guestCheckoutSelector.isDisplayed()) {
            guestCheckoutSelector.click();
        }else if(!guestCheckoutSelector.isEnabled()){
            System.out.println("The guest selector isn't enabled");
        }else{
            System.out.println("The guest selector isn't present");
        }
    }
    public void isFirstNameInputFieldPresent(){
        if(inputFirstName.isDisplayed()) {
            inputFirstName.sendKeys("John");
        }else{
            System.out.println("The first name input field isn't present");
        }
    }
    public void islastNameInputFieldPresent(){
        if(inputLastName.isDisplayed()) {
            inputLastName.sendKeys("Donovan");
        }else{
            System.out.println("The last name input field isn't present");
        }
    }
    public void isEmailInputFieldPresent(){
        if(inputEmail.isDisplayed()) {
            inputEmail.sendKeys("m5@gmail.com");
        }else{
            System.out.println("The email input field isn't present");
        }
    }
    public void isAddress1InputFieldPresent(){
        if(inputAddress1.isDisplayed()) {
            inputAddress1.sendKeys("14th and Arlington");
        }else{
            System.out.println("The Address1 input field isn't present");
        }
    }
    public void isCityInputFieldPresent(){
        if(inputCity.isDisplayed()) {
            inputCity.sendKeys("Washington D.C");
        }else{
            System.out.println("The city input field isn't present");
        }
    }
    public void isPostCodeInputFieldPresent(){
        if(inputPostCode.isDisplayed()) {
            inputPostCode.sendKeys("72220");
        }else{
            System.out.println("The post code input field isn't present");
        }
    }
    public void isCountryDropDownMenuEnabledAndPresent(){
        if(clickCountryDropDownMenu.isEnabled() && clickCountryDropDownMenu.isDisplayed()) {
            clickCountryDropDownMenu.click();
        }else if(!clickCountryDropDownMenu.isEnabled()){
            System.out.println("The dropdown menu isn't enabled");
        }else{
            System.out.println("The dropdown menu isn't present");
        }
    }
    public void isSelectCountryFromListEnabledAndPresent(){
        if(countrySelect.isEnabled() && countrySelect.isDisplayed()) {
            countrySelect.click();
        }
    }

    public void isRegionStateDropdownMenuEnabledAndPresent(){
        if(regionStateSelectDropdownMenu.isEnabled() && regionStateSelectDropdownMenu.isDisplayed()){
            regionStateSelectDropdownMenu.click();
        }else if(!regionStateSelectDropdownMenu.isEnabled()){
            System.out.println("The dropdown menu isn't enabled");
        }else{
            System.out.println("The dropdown menu isn't present");
        }
    }

    public void isSelectedRegionStateFromListEnabledAndPresent(){
        if (selectedRegionStateFromList.isEnabled() && selectedRegionStateFromList.isDisplayed()){
            selectedRegionStateFromList.click();
        }
    }

    public void confirmcheckoutByClickingConfirmCheckoutButton(){
        confirmCheckoutButton.click();
    }

}

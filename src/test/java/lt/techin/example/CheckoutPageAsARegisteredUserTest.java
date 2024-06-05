package lt.techin.example;

import org.junit.jupiter.api.Test;

public class CheckoutPageAsARegisteredUserTest extends BaseTest{

    @Test
    void checkoutAsARegisteredUserTest() {
        HomePage homePage = new HomePage(driver);
        homePage.productSelect();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.shoppingCartButtonSelection();
        homePage.checkoutLink();

        CheckoutPageAsARegisteredUser checkoutPageAsARegisteredUser = new CheckoutPageAsARegisteredUser(driver);

        checkoutPageAsARegisteredUser.isSelectGuestCheckoutPresentAndEnabled();
        checkoutPageAsARegisteredUser.isFirstNameInputFieldPresent();
        checkoutPageAsARegisteredUser.islastNameInputFieldPresent();
        checkoutPageAsARegisteredUser.isEmailInputFieldPresent();
        checkoutPageAsARegisteredUser.isAddress1InputFieldPresent();
        checkoutPageAsARegisteredUser.isCityInputFieldPresent();
        checkoutPageAsARegisteredUser.isPostCodeInputFieldPresent();
        checkoutPageAsARegisteredUser.isCountryDropDownMenuEnabledAndPresent();
        checkoutPageAsARegisteredUser.isSelectCountryFromListEnabledAndPresent();

        checkoutPageAsARegisteredUser.isRegionStateDropdownMenuEnabledAndPresent();
        checkoutPageAsARegisteredUser.isSelectedRegionStateFromListEnabledAndPresent();

        //checkoutPageAsARegisteredUser.confirmcheckoutByClickingConfirmCheckoutButton();

    }
}

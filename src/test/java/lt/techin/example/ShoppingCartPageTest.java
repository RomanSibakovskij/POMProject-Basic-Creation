package lt.techin.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartPageTest extends BaseTest{

    @Test
    void shoppingCartPage() {
        HomePage homePage = new HomePage(driver);
        homePage.productSelect();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.shoppingCartButtonSelection();
        homePage.viewCartLink();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        boolean b = shoppingCartPage.isImageDisplayed();
        System.out.println(b);
        assertTrue(b, "The image is displayed");

        boolean result = shoppingCartPage.isLinkPresent();
        System.out.println(result);
        assertTrue(result, "The link is present");

        int qty = shoppingCartPage.getProductQuantity();
        System.out.println(qty);
        assertTrue(qty > 0, "The product quantity must be greater than 0");

        double nt = shoppingCartPage.getProductPriceBeforeTaxes();
        System.out.println(nt);

        double at = shoppingCartPage.getProductPriceAfterTaxes();
        System.out.println(at);

        boolean bt = shoppingCartPage.isContinueShoppingButtonPresent();
        System.out.println(bt);

        boolean ck = shoppingCartPage.isCheckoutButtonPresent();
        System.out.println(ck);

        //shoppingCartPage.clickCheckoutButton();
    }
}

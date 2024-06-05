package lt.techin.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest{

    @Test
    void fromHomePageOtherPagesPathTest() {
        HomePage homePage = new HomePage(driver);
        homePage.productSelect();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        homePage.shoppingCartButtonSelection();
        homePage.viewCartLink();


    }






}

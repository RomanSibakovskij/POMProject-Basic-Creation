package lt.techin.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTest extends BaseTest{


    @Test
    void loginClickTest(){
        HomePage homePage = new HomePage(driver);
        homePage.DropMenuClick();
        homePage.clickLogin();

        AccountLoginPage accountLoginPage = new AccountLoginPage(driver);
        accountLoginPage.setEmailInput();
        accountLoginPage.setPasswordInput();
        accountLoginPage.clickLoginButton();
        assertEquals("Account Login", accountLoginPage.getTitle());

        UserAccountPage userAccountPage = new UserAccountPage(driver);
        userAccountPage.clickMyAccountLink();
        userAccountPage.clickEditAccountLink();


        EditAccountInformationPage editAccountInformationPage = new EditAccountInformationPage(driver);
        assertEquals("John", editAccountInformationPage.getFirstName());
        assertEquals("Donovan", editAccountInformationPage.getLastName());
        assertEquals("m5@gmail.com", editAccountInformationPage.getEmailAddress());




    }




}

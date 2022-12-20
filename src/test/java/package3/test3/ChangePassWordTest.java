package package3.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import package2.tutorialsninja.ui.pages.ChangePasswordPage;
import package2.tutorialsninja.ui.pages.LoginPage;

public class ChangePassWordTest extends BaseTest{

    String ConfirmPass = "Van@12399922";

    @Test
    public void changePass() throws InterruptedException {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPage
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("vantest05@gmail.com","Van@12399");

        //Khai bao 1 Object ChangePasswordPage
        ChangePasswordPage changePasswordPage = new ChangePasswordPage(webDriver);
        changePasswordPage.changePassword(ConfirmPass);


    }
}

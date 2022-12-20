package package3.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import package2.tutorialsninja.ui.pages.LoginPage;
import package2.tutorialsninja.ui.pages.MyAccountInformationPage;

public class MyAccountInformationTests extends BaseTest {
    @Test
    public void VerifyMyAccountInformation() throws InterruptedException {


        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPase
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("vantest14@gmail.com", "Van@12399");

        //Khai bao 1 Object MyAccountInformationPage
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(webDriver);
        myAccountInformationPage.viewAccountInformation();

        //dùng lại Object đã khai báo bên trên để chạy hàm Verify
        myAccountInformationPage.verifyAccountInformation();


        //dùng lại Object đã khai báo bên trên để chạy hàm Edit
        myAccountInformationPage.editMyAccountInformation();



    }
}

package package3.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import package2.tutorialsninja.ui.pages.AccountPage;
import package2.tutorialsninja.ui.pages.LoginPage;
import package2.tutorialsninja.ui.pages.MyAccountInformationPage;

public class MyAccountInformationTests extends BaseTest {
    @Test
    public void VerifyMyAccountInformation() throws InterruptedException {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPase
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("vantest14@gmail.com", "Van@12399");

        //Khai bao 1 Object AccountPage
        AccountPage accountPage = new AccountPage(webDriver);
        accountPage.openYourAccount();

        //Khai bao 1 Object MyAccountInformationPage
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(webDriver);

        Assert.assertEquals(myAccountInformationPage.getFirstName(), "Mafoi");
        Assert.assertEquals(myAccountInformationPage.getFirstName(), "Potter2");
        Assert.assertEquals(myAccountInformationPage.getFirstName(), "vantest16@gmail.com");
        Assert.assertEquals(myAccountInformationPage.getFirstName(), "0969205888");

    }
    @Test
    public void editMyAccountInformation(){
        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPase
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("vantest16@gmail.com", "Van@12399");

        //Khai bao 1 Object AccountPage
        AccountPage accountPage = new AccountPage(webDriver);
        accountPage.openYourAccount();

        //Khai bao 1 Object MyAccountInformationPage
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(webDriver);

        Assert.assertEquals(myAccountInformationPage.getFirstName(), "Mafoi");
        Assert.assertEquals(myAccountInformationPage.getLastName(), "Potter2");
        Assert.assertEquals(myAccountInformationPage.getEmail(), "vantest16@gmail.com");
        Assert.assertEquals(myAccountInformationPage.getTelephone(), "0969205888");

        //edit MyAccount Information
        myAccountInformationPage.setTxtFirstName1("TOM");
        myAccountInformationPage.setTxtLastName1("Tran");
        myAccountInformationPage.setTxtTelephone1("096920599");

        myAccountInformationPage.clickContinue();

        //verify new information updated in the system




    }
}

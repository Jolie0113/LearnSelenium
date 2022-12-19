package package3.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import package2.tutorialsninja.ui.pages.LoginPage;

public class MyAccountInformationTests extends BaseTest {
    @Test
    public void VerifyMyAccountInformation() throws InterruptedException {


        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPase
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("vantest04@gmail.com", "Van@1239999");


        WebElement editYourAccount =  webDriver.findElement(By.linkText("Edit your account information"));
        Thread.sleep(5000);
        editYourAccount.click();

        WebElement txtFirstName1 = webDriver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement txtLastName1 = webDriver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement txtEmail1 =  webDriver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement txtTelephone1 =  webDriver.findElement(By.xpath("//input[@id='input-telephone']"));

        String fN = txtFirstName1.getAttribute("value"); // lấy thông tin của thuộc tính dùng Atribute
        String lN = txtLastName1.getAttribute("value");
        String tE = txtEmail1.getAttribute("value");
        String tT = txtTelephone1.getAttribute("value");

        Assert.assertEquals(fN, "Harry");
        Assert.assertEquals(lN, "Potter");
        Assert.assertEquals(tE, "vantest04@gmail.com");
        Assert.assertEquals(tT, "0969205777");

        Thread.sleep(5000);







    }
}

package package3.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import package2.tutorialsninja.ui.pages.LoginPage;

public class ChangePassWordTest extends BaseTest{
    @Test
    public void changePass() throws InterruptedException {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPage
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login("vantest04@gmail.com", "Van@1239999");

        WebElement ChangeYourPassword = webDriver.findElement(By.linkText("Change your password"));
        ChangeYourPassword.click();


        WebElement txtPass2 =  webDriver.findElement(By.xpath("//input[@id = 'input-password']"));
        txtPass2.sendKeys("Van@1239999");


        WebElement txtConfirmPass =  webDriver.findElement(By.xpath("//input[@id = 'input-confirm']"));
        txtConfirmPass.sendKeys("Van@1239999");

        WebElement btnLoginsuc2 =  webDriver.findElement(By.xpath("//input[@type = 'submit' and @class= 'btn btn-primary']"));
        btnLoginsuc2.click();

        Thread.sleep(5000);



    }
}

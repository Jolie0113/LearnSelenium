package package3.test3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import package2.tutorialsninja.ui.pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest{
    private String em = "vantest16@gmail.com";
    private String pass = "Van@12399";

    @Test
    public void loginTest2(){

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPage
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.login(em, pass);
    }
    @Test
    public void loginTest3(){

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        //Khai bao 1 Object LoginPage
        LoginPage loginPage = new LoginPage(webDriver);

        loginPage.loginBy(em, pass);
    }


    @Test
    public void loginTest1(){

        webDriver.get("http://tutorialsninja.com/demo/");

        webDriver.manage().window().maximize();

        WebElement btnMyAccount =  webDriver.findElement(By.xpath("//span[text()='My Account']"));
        btnMyAccount.click();

        WebElement btnLogin =  webDriver.findElement(By.linkText("Login"));
        btnLogin.click();

        WebElement txtEmail =  webDriver.findElement(By.xpath("//input[@id = 'input-email']"));
        txtEmail.sendKeys("vantest04@gmail.com");

        WebElement txtPass =  webDriver.findElement(By.xpath("//input[@id = 'input-password']"));
        txtPass.sendKeys("Van@12399");

        WebElement btnLoginsuc =  webDriver.findElement(By.xpath("//input[@type = 'submit' and @class= 'btn btn-primary']"));
        btnLoginsuc.click();

    }


}

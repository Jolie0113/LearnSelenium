package package3.test3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;
    private final int timeout = 10;

    @BeforeTest
    public void beforeTest(){
//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        webDriver = new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));


        webDriver = WebDriverManager.getInstance("Chrome").create();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));

        webDriver.manage().window().maximize();
    }

//    public void login(){
//        webDriver.get("http://tutorialsninja.com/demo/");
//
//
//        WebElement btnMyAccount =  webDriver.findElement(By.xpath("//span[text()='My Account']"));
//        btnMyAccount.click();
//
//        WebElement btnLogin =  webDriver.findElement(By.linkText("Login"));
//        btnLogin.click();
//
//        WebElement txtEmail =  webDriver.findElement(By.xpath("//input[@id = 'input-email']"));
//        txtEmail.sendKeys("vantest04@gmail.com");
//
//        WebElement txtPass =  webDriver.findElement(By.xpath("//input[@id = 'input-password']"));
//        txtPass.sendKeys("Van@12399");
//
//        WebElement btnLoginsuc =  webDriver.findElement(By.xpath("//input[@type = 'submit' and @class= 'btn btn-primary']"));
//        btnLoginsuc.click();
//
//    }


}

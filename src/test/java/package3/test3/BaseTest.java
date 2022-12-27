package package3.test3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {
    protected WebDriver webDriver;
    private final int timeout = 10;

    private static final int pageloadTimeout = 60; // đây là giá trị Maximum time, scrip sẽ chờ trước khi thực thi các câu lệnh khác     ->
    // ý nghĩa: scrip sẽ chờ Max là 60s cho pageLoad load lên,
    // Nếu mà pageLoad mất 70s để load xong thì scrip sẽ fail.
    // Nếu mà pageLoad mất 1s,.. để load xong thì scrip sẽ chạy luôn mà k cần chờ hết 60s

    @BeforeTest
    public void beforeTest(){
//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        webDriver = new ChromeDriver();

//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));


        webDriver = WebDriverManager.getInstance("Chrome").create();

        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageloadTimeout));

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));


        webDriver.manage().window().maximize();
    }
    @AfterTest
    public void Thread() throws InterruptedException {
        Thread.sleep(5000);
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

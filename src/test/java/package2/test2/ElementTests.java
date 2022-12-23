package package2.test2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

public class ElementTests {
    protected WebDriver webDriver;
//    private final int implixitlyWaittimeout = 30;
    private final int exlixitlyWaittimeout = 30;


    private static final int pageloadTimeout = 60;

    @BeforeTest
    public void beforeTest() {

        webDriver = WebDriverManager.getInstance("Chrome").create();

        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageloadTimeout));

//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implixitlyWaittimeout));

        webDriver.manage().window().maximize();
    }
    @Test
    public void ThreadSleepTests() throws InterruptedException {
        webDriver.get("https://demoqa.com/dynamic-properties");

        WebElement elVisibleAfter = webDriver.findElement(By.xpath("//button[@id ='visibleAfter']"));
        Thread.sleep(6000);

        elVisibleAfter.click();
    }
    @Test
    public void ImplicitlyTimeout2(){
        webDriver.get("https://demoqa.com/dynamic-properties");

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("window.scrollTo(0,500)"); //Để cuộn trang theo chiều dọc 500px
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //  Để cuộn trang theo chiều dọc cho đến hết (cuối trang)


        WebElement elVisibleAfter = webDriver.findElement(By.xpath("//button[@id ='visibleAfter']"));

        js.executeScript("arguments[0].scrollIntoView(true);", elVisibleAfter); //Để cuộn tới 1 phần tử trong trang (này dùng nhiều)


        elVisibleAfter.click();
    }

    @Test
    public void ExplicitlyTimeout(){
        webDriver.get("https://demoqa.com/dynamic-properties");

        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(exlixitlyWaittimeout));
        WebElement elVisibleAfter = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[@id ='visibleAfter']")));


        js.executeScript("arguments[0].scrollIntoView(true);", elVisibleAfter);


        elVisibleAfter.click();
    }
    @Test
    public void ExplicitlyTimeout2(){
        webDriver.get("https://demoqa.com/dynamic-properties");

        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(exlixitlyWaittimeout));

        WebElement elEnableAfter = webDriverWait.
                 until(ExpectedConditions.visibilityOfElementLocated(By.id("enableAfter")));


        elEnableAfter.click();


    }
    @Test
    public void ExplicitlyTimeout3(){
        webDriver.get("https://demoqa.com/dynamic-properties");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;



        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(exlixitlyWaittimeout));

        WebElement colorChange = webDriverWait.
                until(ExpectedConditions.visibilityOfElementLocated(By.id("colorChange")));


        js.executeScript("arguments[0].scrollIntoView(true);", colorChange);

        colorChange.click();

    }
    @Test
    public void ExplicitlyTimeout4(){
        webDriver.get("https://demoqa.com/dynamic-properties");
        JavascriptExecutor js = (JavascriptExecutor) webDriver;



        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(exlixitlyWaittimeout));
        WebElement colorChange = webDriver.findElement(By.id("colorChange"));

        colorChange = webDriverWait.
                until(ExpectedConditions.elementToBeClickable(colorChange));


        js.executeScript("arguments[0].scrollIntoView(true);", colorChange);

        colorChange.click();

    }







    @AfterTest
    public void AfterTest() throws InterruptedException {
        Thread.sleep(5000);

    }
}

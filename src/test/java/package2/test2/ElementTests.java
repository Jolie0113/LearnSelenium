package package2.test2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.ArrayList;

public class ElementTests {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    protected JavascriptExecutor javascriptExecutor;
    protected Actions actions;



//    private final int implixitlyWaittimeout = 30;
    private final int exlixitlyWaittimeout = 30;
    private static final int pageloadTimeout = 60;


    @BeforeTest
    public void beforeTest() {

        webDriver = WebDriverManager.getInstance("Chrome").create();

        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageloadTimeout));

//        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implixitlyWaittimeout));

        webDriver.manage().window().maximize();

        webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(exlixitlyWaittimeout));

        javascriptExecutor = (JavascriptExecutor) webDriver ;

        actions = new Actions(webDriver);


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
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //  Để cuộn trang theo chiều dọc cho đến hết (cuối trang)


        WebElement elVisibleAfter = webDriver.findElement(By.xpath("//button[@id ='visibleAfter']"));

//        js.executeScript("arguments[0].scrollIntoView(true);", elVisibleAfter); //Để cuộn tới 1 phần tử trong trang (này dùng nhiều)


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

    @Test
    public void textBoxTest(){
        webDriver.get("https://demoqa.com/text-box");
        By byFullName = By.id("userName");

        By byCurrentAddress = By.id("currentAddress");

        By byPermanentAddress = By.id("permanentAddress");


        WebElement eFullName = webDriverWait.until(ExpectedConditions.elementToBeClickable(byFullName));
        eFullName.sendKeys("ITMS Coaching");

        //cách1

        WebElement eCurrentAddess = webDriverWait.until(ExpectedConditions.elementToBeClickable(byCurrentAddress));
        eCurrentAddess.sendKeys("ITMS Coaching 3");

        WebElement ePermanentAddress = webDriverWait.until(ExpectedConditions.elementToBeClickable(byPermanentAddress));
        ePermanentAddress.sendKeys("ITMS Coaching 4");


//        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("arguments[0].scrollIntoView(true);", byCurrentAddress); //Để cuộn tới 1 phần tử trong trang (này dùng nhiều)

//
//        //cách2
//        WebElement eCurrentAddess = webDriverWait.until(ExpectedConditions.elementToBeClickable(byCurrentAddress));
//
//        javascriptExecutor.executeScript("argument[0].innerHTML = argument[1];",eCurrentAddess,"text 123 Van xinh gai");

    }
    @Test
    public void checkBoxTest(){
        webDriver.get("https://demoqa.com/checkbox");
        By byText = By.xpath("//span[text()='Notes']");
        By byExpandHome = By.xpath("//span[text()='Home']/../../button"); //cách 2: //label[.='Home']/../button
        By byExpanDesktop = By.xpath("//span[text()='Desktop']/../../button"); // casch2: //label[.='Desktop']/../button

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byExpandHome)).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(byExpanDesktop)).click();

        webDriverWait.until(ExpectedConditions.elementToBeClickable(byText)).click();

    }
    @Test
    public void radioTest(){
        webDriver.get("https://demoqa.com/radio-button");
//        By byRadio = By.xpath("//label[text()='Yes']/../input");

//        By byRadio2 = By.id("yesRadio");

        By byRadio3 = By.xpath("//label[text()='Yes']");


        webDriverWait.until(ExpectedConditions.elementToBeClickable(byRadio3)).click();
    }
    @Test
    public void doubleClickTest(){
        webDriver.get("https://demoqa.com/buttons");


        By bydoubleClick = By.id("doubleClickBtn");


        WebElement eDoubleClick = webDriverWait.until(ExpectedConditions.elementToBeClickable(bydoubleClick));

        actions
                .doubleClick(eDoubleClick) // doubleClick
                .perform();
    }
    @Test
    public void rightClickTest(){
        webDriver.get("https://demoqa.com/buttons");


        By byRightClick = By.id("rightClickBtn");


        WebElement eRightClick = webDriverWait.until(ExpectedConditions.elementToBeClickable(byRightClick));

        actions
                .contextClick(eRightClick) //rightClick
                .perform();
    }

    @Test
    public void dropdowListTest(){
        webDriver.get("https://www.facebook.com/");


        By byCreateNewAccount = By.linkText("Create New Account");


        WebElement eRightClick = webDriverWait
                .until(ExpectedConditions.elementToBeClickable(byCreateNewAccount));

        eRightClick.click();

        By byDay = By.id("day");
        By byMonth = By.id("month");
        By byYear = By.id("year");

        WebElement eDay = webDriverWait.until(ExpectedConditions.elementToBeClickable(byDay));
        WebElement eMonth = webDriverWait.until(ExpectedConditions.elementToBeClickable(byMonth));
        WebElement eYear = webDriverWait.until(ExpectedConditions.elementToBeClickable(byYear));

        Select selectDay = new Select(eDay);
        selectDay.selectByValue("18");  //cach1

        Select selectMonth = new Select(eMonth);
        selectMonth.selectByVisibleText("Jan"); //cach2


        Select selectYear = new Select(eYear);
        selectYear.selectByIndex(3); //cach3
    }
    @Test
    public void iframeTest(){
        webDriver.get("https://demoqa.com/frames");


        //================================================
        //Muon tuong tác với element trong iframe -> dùng câu lệnh: webDriver.switchTo().frame(id/...);
        webDriver.switchTo().frame("frame1");

        By byHeading = By.id("sampleHeading");

        String Heading = webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(byHeading))
                .getText();

        Assert.assertEquals(Heading,"This is a sample page");

        //=============================================
        //câu lênh thoát ra ngoài frame để tương tác với element bên ngoài frame đó : webDriver.switchTo().defaultContent();

        webDriver.switchTo().defaultContent();
        By byMainHeader = By.className("main-header");

        String mainHear = webDriverWait
                .until(ExpectedConditions.visibilityOfElementLocated(byMainHeader))
                .getText();

        Assert.assertEquals(mainHear,"Frames");
    }
    @Test
    public void alertTest(){
        webDriver.get("https://demoqa.com/alerts");
        //=========
        //
        By byClick = By.id("alertButton");

        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(byClick))
                .click();
// cach 1
//        webDriver.switchTo().alert().accept();
//cach 2
        Alert alert = webDriver.switchTo().alert();
        alert.accept();
//        alert.dismiss();
//        alert.sendKeys("Van xinh gai");
    }
    @Test
    public void alertTest2(){
        webDriver.get("https://demoqa.com/alerts");
        //=========
        //
        By byClick = By.id("timerAlertButton");
//        //cach1:
//        webDriver.findElement(byClick).click();
        //cach2:

        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(byClick))
                .click();
        webDriverWait
                .until(ExpectedConditions.alertIsPresent());

        Alert alert = webDriver.switchTo().alert();
        alert.accept();

    }
    @Test
    public void alertTest3(){
        webDriver.get("https://demoqa.com/alerts");
        //=========
        //
        By byClick = By.id("promtButton");



        JavascriptExecutor js = (JavascriptExecutor) webDriver;
//        js.executeScript("arguments[0].scrollIntoView(true);", byClick);
        js.executeScript("window.scrollTo(0,200)"); //Để cuộn trang theo chiều dọc 500px

//        //cach1:
//        webDriver.findElement(byClick).click();

        //cach2:
        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(byClick))
                .click();


        webDriverWait
                .until(ExpectedConditions.alertIsPresent()); // tương tác với Alert, chờ Alert xuất hiện

        Alert alert = webDriver.switchTo().alert();
        alert.sendKeys("Van xinh gai 3");
        alert.accept();


        By byResult = By.id("promptResult");
        WebElement eResult = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byResult));
        String result = eResult.getText();

        Assert.assertTrue(result.contains("Van xinh gai 3"));
    }
    @Test
    public void tabTest(){
        webDriver.get("https://demoqa.com/browser-windows");
        By byTab = By.id("tabButton");
        WebElement eTab = webDriverWait.until(ExpectedConditions.elementToBeClickable(byTab));
        eTab.click();

        // Câu lệnh tương tác với tab mới
        ArrayList<String> newTab = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(newTab.get(1));

        By byHeading = By.id("sampleHeading");
        WebElement eHeading = webDriverWait.until(ExpectedConditions.elementToBeClickable(byHeading));
        String heading = eHeading.getText();

        Assert.assertEquals(heading,"This is a sample page");

        //quay tro ve tab trước
        webDriver.switchTo().window(newTab.get(0));


    }




    @AfterTest
    public void AfterTest() throws InterruptedException {
        Thread.sleep(5000);

    }
}

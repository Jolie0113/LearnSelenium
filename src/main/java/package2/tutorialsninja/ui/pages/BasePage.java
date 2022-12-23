package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver webDriver;
    private WebDriverWait webDriverWait;

    private static final int timeout =60;
//    protected javascriptExucutor  javascriptExucutor;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait= new WebDriverWait(webDriver, Duration.ofSeconds(60));

//        javascriptExucutor = (JavascriptExecutor)webDriver;

        PageFactory.initElements(webDriver,this);  // dùng để lược bỏ hết các findElement By.
    }

    protected void inputText(WebElement webElement, String text){
        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(webElement))
                .click();


        webElement.clear();
        webElement.sendKeys(text);

    }
    protected void inputText(By by, String text){

        WebElement webElement = webDriverWait
                .until(ExpectedConditions.elementToBeClickable(by));

        webElement.clear();
        webElement.sendKeys(text);
    }

//    protected void setText(WebElement webElement, String text) {
//        webDriverWait
//                .until(ExpectedConditions.elementToBeClickable(webElement));
//
//        javascriptExucutor.("argument[0].setA")
//    }

    protected void click(WebElement webElement){
        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(webElement))
                .click();
    }
    protected void click(By by){
        webDriverWait
                .until(ExpectedConditions.elementToBeClickable(by))
                .click();
    }


}

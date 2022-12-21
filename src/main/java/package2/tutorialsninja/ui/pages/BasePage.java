package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);  // dùng để lược bỏ hết các findElement By.
    }

    public void setText(WebElement webElement, String text){
        webElement.clear();
        webElement.sendKeys(text);

    }


}

package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

}

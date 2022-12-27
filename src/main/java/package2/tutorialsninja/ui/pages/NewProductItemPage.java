package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewProductItemPage extends BasePage{
    private String prodcutName;
    private WebElement elContainer;
    public NewProductItemPage(WebDriver webDriver, String productName) {
        super(webDriver);
        this.prodcutName= productName;

        By byContainer = By.xpath(String.format("//div[contains(@class,'product-layout')][.//a[text()='%s']]",this.prodcutName));
        elContainer = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byContainer));

    }
    public String getDescription(){
        By by = By.xpath(".//p[1]");
        WebElement elDescription = elContainer.findElement(by);

        return getText(elDescription);

    }
    public String getNewPrice(){
        By by = By.xpath(".//span[@class='price-new']");
        return getText(elContainer.findElement(by));
    }
    public String getOldPrice(){
        By by = By.xpath(".//span[@class='price-old']");
        return getText(elContainer.findElement(by));
    }
    public String getTax(){
        By by = By.xpath(".//span[@class='price-tax']");
        return getText(elContainer.findElement(by));
    }


}

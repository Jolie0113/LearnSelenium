package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductItemPage extends BasePage{
    private String prodcutName;
    public ProductItemPage(WebDriver webDriver, String productName) {
        super(webDriver);
        this.prodcutName= productName;

    }
    public String getDescription(){
        By by = By.xpath(
                String.format("//div[contains(@class,'product-layout')][.//a[text()='%s']]//p[1]", this.prodcutName));
        return getText(by);

    }
    public String getNewPrice(){
        By by = By.xpath(
                String.format("//div[contains(@class,'product-layout')][.//a[text()='%s']]//span[@class='price-new']", this.prodcutName));
        return getText(by);
    }
    public String getOldPrice(){
        By by = By.xpath(
                String.format("//div[contains(@class,'product-layout')][.//a[text()='%s']]//span[@class='price-old']", this.prodcutName));
        return getText(by);
    }
    public String getTax(){
        By by = By.xpath(
                String.format("//div[contains(@class,'product-layout')][.//a[text()='%s']]//span[@class='price-tax']", this.prodcutName));
        return getText(by);
    }


}

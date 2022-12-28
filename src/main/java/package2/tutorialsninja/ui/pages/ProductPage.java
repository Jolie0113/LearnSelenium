package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{
    private String product;

    //casch1
    By byProductList = By.xpath("//div[contains(@class,'product-layout')]");

//    //casch2
//    @FindBy(xpath ="//div[contains(@class,'product-layout')]" )
//    private List<WebElement> elProductContainers;

    public ProductPage(WebDriver webDriver, String product) {
        super(webDriver);
        this.product = product;
    }

    public List<WebElement> getAllProductContainer(){
        return webDriver.findElements(byProductList);
    }
}

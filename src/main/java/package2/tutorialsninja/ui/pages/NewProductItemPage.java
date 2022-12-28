package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import package2.tutorialsninja.dto.ProductItem;

import java.util.List;

public class NewProductItemPage extends BasePage{
    private String prodcutName;
    private WebElement elContainer;
    public NewProductItemPage(WebDriver webDriver, String productName) {
        super(webDriver);
        this.prodcutName= productName;

        By byContainer = By.xpath(String.format("//div[contains(@class,'product-layout')][.//a[text()='%s']]",this.prodcutName));
        elContainer = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(byContainer));

    }
    public NewProductItemPage(WebDriver webDriver, WebElement elContainer){
        super(webDriver);
        this.elContainer = elContainer;

    }
    public String getDescription(){
        By by = By.xpath(".//p[1]");
        WebElement elDescription = elContainer.findElement(by);

        return getText(elDescription);

    }
    public String getNewPrice(){
        By byPricenew = By.xpath(".//span[@class='price-new']");
        List<WebElement> elPriceNew = elContainer.findElements(byPricenew);

        if (elPriceNew.size() == 0){
                By byPrice = By.xpath(".//p[@class ='price']");

            String priceTax = getText(elContainer.findElement(byPrice));
            String tax = getTax();

            String price = priceTax.replace(tax,"").trim();

            return price;
        }

        return getText(elContainer.findElement(byPricenew));
    }
    public String getPrice(){
        By byPricenew = By.xpath(".//span[@class='price-new']");
        List<WebElement> elPriceNew = elContainer.findElements(byPricenew);

        if (elPriceNew.size() == 0){
            return null;
        }

        By byPrice = By.xpath(".//p[@class ='price']");

        String priceTax = getText(elContainer.findElement(byPrice));
        String tax = getTax();

        return priceTax.replace(tax,"").trim();


    }




    public String getOldPrice(){
        By byPriceOld = By.xpath(".//span[@class='price-old']");
        List<WebElement> elPriceOld = elContainer.findElements(byPriceOld);

        if (elPriceOld.size() == 0){
            return null;
        }

        return getText(elContainer.findElement(byPriceOld));
    }
    public String getTax(){
        By by = By.xpath(".//span[@class='price-tax']");
        return getText(elContainer.findElement(by));
    }
    public String getProdcutName(){
        By by = By.xpath(".//h4//a");
        return getText(elContainer.findElement(by));
    }


    public ProductItem getproductItem(){

        ProductItem productItem = new ProductItem();

        productItem.setName(getProdcutName());
        productItem.setDescription(getDescription());
        productItem.setPrice(getPrice());
        productItem.setNewPrice(getNewPrice());
        productItem.setOldPrice(getOldPrice());
        productItem.setTax(getTax());

        return productItem;

    }


}

package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourStorePage extends BasePage{

    @FindBy(linkText = "Desktops")
    private WebElement lkDesktops;

    @FindBy(linkText = "Show All Desktops")
    private WebElement lkShowAllDesktops;



    public YourStorePage(WebDriver webDriver) {

        super(webDriver);

    }
    public void openShowAllDesktop(){
        click(lkDesktops);
        click(lkShowAllDesktops);

    }
    public void openMenu(String mainItem, String subItem){
        clickMainItem(mainItem);
        clickSubItem(subItem);

    }
    public void openMenu(String mainItem){
        clickMainItem(mainItem);

    }

    public void clickMainItem(String item){
        By byLink = By.linkText(item);
        click(byLink);
    }
    public void clickSubItem(String item){
        By bylink = By.partialLinkText(item);
        click(bylink);
    }


}

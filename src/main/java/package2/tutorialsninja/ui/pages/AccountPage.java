package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{


    @FindBy(linkText = "Edit your account information")
    private WebElement editYourAccount;
    public AccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openYourAccount(){
        editYourAccount.click();
    }


}

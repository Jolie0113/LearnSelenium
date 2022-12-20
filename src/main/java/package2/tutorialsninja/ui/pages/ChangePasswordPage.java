package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage extends BasePage{
    private WebElement txtPass2;

    private WebElement txtConfirmPass;

    private WebElement btnLoginsuc2;

    public ChangePasswordPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void changePassword(String ConfirmPass){

        WebElement ChangeYourPassword = webDriver.findElement(By.linkText("Change your password"));
        ChangeYourPassword.click();

        txtPass2 =  webDriver.findElement(By.xpath("//input[@id = 'input-password']"));
        txtConfirmPass =  webDriver.findElement(By.xpath("//input[@id = 'input-confirm']"));
        btnLoginsuc2 =  webDriver.findElement(By.xpath("//input[@type = 'submit' and @class= 'btn btn-primary']"));


        txtPass2.sendKeys(ConfirmPass);
        txtConfirmPass.sendKeys(ConfirmPass);
        btnLoginsuc2.click();

    }
}

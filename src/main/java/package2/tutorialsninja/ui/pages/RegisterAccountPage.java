package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAccountPage extends BasePage{

    private WebElement txtFirstName;
    private WebElement txtLastName;
    private WebElement txtEmail;
    private WebElement txtTelephone;
    private WebElement txtPassword;
    private WebElement txtConfirm;
    private WebElement btnCheckbox;
    private WebElement btnContinue;

    public void registerAccount(String firstName, String lastName, String email, String telephone, String Password, String confirmPassword)
            throws InterruptedException {

        txtFirstName= webDriver.findElement(By.xpath("//input[@id='input-firstname']"));
        txtLastName= webDriver.findElement(By.xpath("//input[@id='input-lastname']"));
        txtEmail =  webDriver.findElement(By.xpath("//input[@id='input-email']"));
        txtTelephone =  webDriver.findElement(By.xpath("//input[@id='input-telephone']"));
        txtPassword =  webDriver.findElement(By.xpath("//input[@id='input-password']"));
        txtConfirm =  webDriver.findElement(By.xpath("//input[@id='input-confirm']"));

        btnCheckbox =  webDriver.findElement(By.xpath("//input[@name = 'agree']"));
        btnContinue =  webDriver.findElement(By.xpath("//input[@class= 'btn btn-primary']"));

        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtEmail.sendKeys(email);
        txtTelephone.sendKeys(telephone);
        txtPassword.sendKeys(Password);
        txtConfirm.sendKeys(confirmPassword);
        btnCheckbox.click();
        btnContinue.click();

        Thread.sleep(3000);


    }
    public RegisterAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

}

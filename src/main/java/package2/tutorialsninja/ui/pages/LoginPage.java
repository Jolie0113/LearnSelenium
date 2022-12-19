package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends  BasePage{

    private WebElement txtEmail;
    private  WebElement txtPass;

    private WebElement btnLogin;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void login(String email, String password){


//        WebElement btnMyAccount =  webDriver.findElement(By.xpath("//span[text()='My Account']"));
//        btnMyAccount.click();
//
//        WebElement btnLogin =  webDriver.findElement(By.linkText("Login"));
//        btnLogin.click();

        txtEmail =  webDriver.findElement(By.xpath("//input[@id = 'input-email']"));
        txtPass =  webDriver.findElement(By.xpath("//input[@id = 'input-password']"));
        btnLogin =  webDriver.findElement(By.xpath("//input[@type = 'submit' and @class= 'btn btn-primary']"));

        txtEmail.sendKeys(email);
        txtPass.sendKeys(password);
        btnLogin.click();
    }

}

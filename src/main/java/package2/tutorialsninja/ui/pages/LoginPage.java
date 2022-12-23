package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage{

    @FindBy(xpath = "//input[@id = 'input-email']")
    private WebElement txtEmail;
    @FindBy(xpath = "//input[@id = 'input-password']")
    private  WebElement txtPass;
    @FindBy(xpath = "//input[@type = 'submit' and @class= 'btn btn-primary']")
    private WebElement btnLogin;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void login(String email, String password){
//        WebElement btnMyAccount =  webDriver.findElement(By.xpath("//span[text()='My Account']"));
//        btnMyAccount.click();
//        WebElement btnLogin =  webDriver.findElement(By.linkText("Login"));
//        btnLogin.click();

//        txtEmail =  webDriver.findElement(By.xpath("//input[@id = 'input-email']"));
//        txtPass =  webDriver.findElement(By.xpath("//input[@id = 'input-password']"));
//        btnLogin =  webDriver.findElement(    By.xpath("//input[@type = 'submit' and @class= 'btn btn-primary']"));

        inputText(txtEmail,email);
        inputText(txtPass,password);

        click(btnLogin);
    }
    public void loginBy(String email, String password){

        By bytxtEmail = By.xpath("//input[@id = 'input-email']");
        By bytxtPass = By.xpath("//input[@id = 'input-password']");
        By bybtnLogin = By.xpath("//input[@type = 'submit' and @class= 'btn btn-primary']");

        inputText(bytxtEmail, email);
        inputText(bytxtPass,password);
        click(bybtnLogin);
    }


}

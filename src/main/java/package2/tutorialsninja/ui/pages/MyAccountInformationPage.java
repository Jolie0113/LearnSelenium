package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;

public class MyAccountInformationPage extends BasePage{
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement txtFirstName1;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement txtLastName1;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement txtEmail1;

    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement txtTelephone1;

    @FindBy(xpath = "//input[@value= 'Continue']")
    private WebElement btnContinue;

    public MyAccountInformationPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void viewAccountInformation(){
        WebElement editYourAccount =  webDriver.findElement(By.linkText("Edit your account information"));
        editYourAccount.click();

    }
    public String getFirstName(){
        return txtFirstName1.getAttribute("value");
    }
    public String getLastName(){
        return txtLastName1.getAttribute("value");
    }
    public String getEmail(){
        return txtEmail1.getAttribute("value");
    }
    public String getTelephone(){
        return  txtTelephone1.getAttribute("value");
    }

    //set

    public void setTxtFirstName1(String firstName1){
//        txtFirstName1.clear();
//        txtFirstName1.sendKeys(firstName1);
        setText(txtFirstName1, firstName1);
    }
    public void setTxtLastName1(String lastName1){
        setText(txtLastName1,lastName1);
    }
    public void setTxtTelephone1(String telephone1){
        setText(txtTelephone1,telephone1);
    }

    public void clickContinue(){
        btnContinue.click();
    }
}

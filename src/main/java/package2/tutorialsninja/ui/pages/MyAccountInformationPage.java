package package2.tutorialsninja.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyAccountInformationPage extends BasePage{

    public MyAccountInformationPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void viewAccountInformation(){
        WebElement editYourAccount =  webDriver.findElement(By.linkText("Edit your account information"));
        editYourAccount.click();

    }
    public void verifyAccountInformation(){

        WebElement txtFirstName1 = webDriver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement txtLastName1 = webDriver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement txtEmail1 =  webDriver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement txtTelephone1 =  webDriver.findElement(By.xpath("//input[@id='input-telephone']"));

        String fN = txtFirstName1.getAttribute("value"); // lấy thông tin của thuộc tính dùng Atribute
        String lN = txtLastName1.getAttribute("value");
        String tE = txtEmail1.getAttribute("value");
        String tT = txtTelephone1.getAttribute("value");

        Assert.assertEquals(fN, "Mafoi");
        Assert.assertEquals(lN, "Potter2");
        Assert.assertEquals(tE, "vantest14@gmail.com");
        Assert.assertEquals(tT, "0969205888");
    }
    public void editMyAccountInformation(){
        WebElement txtFirstName1 = webDriver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement txtLastName1 = webDriver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement txtEmail1 =  webDriver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement txtTelephone1 =  webDriver.findElement(By.xpath("//input[@id='input-telephone']"));

        txtFirstName1.clear();
        txtFirstName1.sendKeys("Hermione");

        txtLastName1.clear();
        txtLastName1.sendKeys("Alber");

    }
}

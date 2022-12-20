package package3.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import package2.tutorialsninja.ui.pages.RegisterAccountPage;

public class RegisterTest extends BaseTest{
    String fName = "Mafoi";
    String lName = "Potter2";
    String email = "vantest14@gmail.com";
    String telephone= "0969205888";
    String password = "Van@12399";
    String confirmPassword = "Van@12399";


    @Test
    public void seleniumTest2() throws InterruptedException {

        webDriver.get("http://tutorialsninja.com/demo/index.php?route=account/register");

        RegisterAccountPage registerAccountPage = new RegisterAccountPage(webDriver);
        registerAccountPage.registerAccount(fName,lName ,email ,telephone,
                password ,confirmPassword );

    }


}

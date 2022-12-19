package package2.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumTests {
    @Test
    public void seleniumTest1() throws InterruptedException {
        //Setting
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

         //Init a new Chorme Driver Object
        WebDriver webDriver = new ChromeDriver();

        //Lauching aURL
        webDriver.get("https://www.google.com/");

        // Maximize the browser
        webDriver.manage().window().maximize();

        Thread.sleep(1000);

//        cach 1:
//        webDriver.findElement(By.name("q")).sendKeys("avater2");

//        WebElement searchBtn = webDriver.findElement(By.name("btnK"));
//        searchBtn.click();

        //cach2
//        webDriver.findElement(By.name("q")).sendKeys("avater2");

//        Actions action = new Actions(webDriver);
//        action.sendKeys(Keys.RETURN);
//        action.perform();

        //cách3
        WebElement searchElement = webDriver.findElement(By.name("q"));
        searchElement.sendKeys("avater2", Keys.RETURN);


        // Close the Browser.
//        webDriver.close();

    }
    @Test
    public void seleniumTest2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://tutorialsninja.com/demo/");
        webDriver.manage().window().maximize();

        WebElement btnMyAccount =  webDriver.findElement(By.xpath("//span[text()='My Account']"));
        btnMyAccount.click();

        WebElement btnRegister =  webDriver.findElement(By.xpath("//a[text()='Register']"));
        btnRegister.click();

        WebElement txtFirstName= webDriver.findElement(By.xpath("//input[@id='input-firstname']"));
        txtFirstName.sendKeys("Harry");

        WebElement txtLastName= webDriver.findElement(By.xpath("//input[@id='input-lastname']"));
        txtLastName.sendKeys("Potter");

        WebElement txtEmail =  webDriver.findElement(By.xpath("//input[@id='input-email']"));
        txtEmail.sendKeys("vantest06@gmail.com");

        WebElement txtTelephone =  webDriver.findElement(By.xpath("//input[@id='input-telephone']"));
        txtTelephone.sendKeys("0969205777");


        WebElement txtPassword =  webDriver.findElement(By.xpath("//input[@id='input-password']"));
        txtPassword.sendKeys("Van@12399");

        WebElement txtConfirm =  webDriver.findElement(By.xpath("//input[@id='input-confirm']"));
        txtConfirm.sendKeys("Van@12399");


        WebElement btnCheckbox =  webDriver.findElement(By.xpath("//input[@name = 'agree']"));
        btnCheckbox.click();


        WebElement btnContinue =  webDriver.findElement(By.xpath("//input[@class= 'btn btn-primary']"));
        btnContinue.click();

        Thread.sleep(3000);

        WebElement btnContinue2 =  webDriver.findElement(By.xpath("//*[text()= 'Continue']"));
        btnContinue2.click();

    }
    @Test
    public void seleniumTest3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://tutorialsninja.com/demo/");
        webDriver.manage().window().maximize();

        WebElement btnMyAccount = webDriver.findElement(By.xpath("//span[text()='My Account']"));
        btnMyAccount.click();

        WebElement btnRegister =  webDriver.findElement(By.xpath("//a[text()='Register']"));
        btnRegister.click();

        WebElement btnLoginpage =  webDriver.findElement(By.linkText("login page"));
        Thread.sleep(3000);
        btnLoginpage.click();

        // Close the Browser.
        webDriver.close();

    }
    @Test
    public void seleniumTest4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://tutorialsninja.com/demo/");
        webDriver.manage().window().maximize();

        WebElement btnMyAccount = webDriver.findElement(By.xpath("//span[text()='My Account']"));
        btnMyAccount.click();

        WebElement btnRegister =  webDriver.findElement(By.xpath("//a[text()='Register']"));
        btnRegister.click();

        WebElement txtFirstName= webDriver.findElement(By.cssSelector("input#input-firstname")); Thread.sleep(3000);
//        WebElement txtFirstName= webDriver.findElement(By.cssSelector("*#input-firstname"));
//        WebElement txtFirstName= webDriver.findElement(By.cssSelector("#input-firstname"));

        txtFirstName.sendKeys("Harry");

        // Close the Browser.
//        webDriver.close();

    }

    @Test
    public void seleniumTest5() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://tutorialsninja.com/demo/");
        webDriver.manage().window().maximize();

        WebElement btnMyAccount =  webDriver.findElement(By.xpath("//span[text()='My Account']"));
        WebElement btnRegister =  webDriver.findElement(By.xpath("//a[text()='Register']"));

        WebElement txtFirstName= webDriver.findElement(By.xpath("//input[@id='input-firstname']"));
        WebElement txtLastName= webDriver.findElement(By.xpath("//input[@id='input-lastname']"));
        WebElement txtEmail =  webDriver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement txtTelephone =  webDriver.findElement(By.xpath("//input[@id='input-telephone']"));
        WebElement txtPassword =  webDriver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement txtConfirm =  webDriver.findElement(By.xpath("//input[@id='input-confirm']"));
        WebElement btnCheckbox =  webDriver.findElement(By.xpath("//input[@name = 'agree']"));
        WebElement btnContinue =  webDriver.findElement(By.xpath("//input[@class= 'btn btn-primary']"));
        WebElement btnContinue2 =  webDriver.findElement(By.xpath("//*[text()= 'Continue']"));


        btnMyAccount.click();
        btnRegister.click();

        txtFirstName.sendKeys("Harry");
        txtLastName.sendKeys("Potter");
        txtEmail.sendKeys("vantest06@gmail.com");
        txtTelephone.sendKeys("0969205777");
        txtPassword.sendKeys("Van@12399");
        txtConfirm.sendKeys("Van@12399");
        btnCheckbox.click();
        btnContinue.click();
        Thread.sleep(3000);
        btnContinue2.click();
    }






}

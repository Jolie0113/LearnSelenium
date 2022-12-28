package package3.test3;

import org.testng.Assert;
import org.testng.annotations.Test;
import package2.tutorialsninja.dto.ProductItem;
import package2.tutorialsninja.ui.pages.NewProductItemPage;
import package2.tutorialsninja.ui.pages.ProductItemPage;
import package2.tutorialsninja.ui.pages.ProductPage;
import package2.tutorialsninja.ui.pages.YourStorePage;

public class ShowAllDesktopsTest extends BaseTest{
//    @Test
//    public void verifyAllDesktopsTest(){
//        webDriver.get("http://tutorialsninja.com/demo/");
//
//        YourStorePage yourStorePage = new YourStorePage(webDriver);
//        yourStorePage.openShowAllDesktop();
//
//    }
    @Test
    public void verifyAllDesktopsTest1(){
        webDriver.get("http://tutorialsninja.com/demo/");

        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openMenu("Desktops", "Show All Desktops");

        ProductPage desktopsProductPage = new ProductPage(webDriver, "Desktops");

        Assert.assertEquals(desktopsProductPage.getPageTitle(),"Desktops");
//
////====================================================================================================
//        ProductItemPage productItemPage = new ProductItemPage(webDriver, "Canon EOS 5D");
//        System.out.println(productItemPage.getDescription());
//        System.out.println(productItemPage.getNewPrice());
//        System.out.println(productItemPage.getOldPrice());
//        System.out.println(productItemPage.getTax());
////=============================
//        ProductItemPage productItemPage2 = new ProductItemPage(webDriver, "Apple Cinema 30\"");
//        System.out.println(productItemPage2.getDescription());
//        System.out.println(productItemPage2.getNewPrice());
//        System.out.println(productItemPage2.getOldPrice());
//        System.out.println(productItemPage2.getTax());
//
//====================================================================================================
        NewProductItemPage newProductItemPage  = new NewProductItemPage(webDriver, "Canon EOS 5D");
        System.out.println(newProductItemPage.getDescription());
        System.out.println(newProductItemPage.getNewPrice());
        System.out.println(newProductItemPage.getOldPrice());
        System.out.println(newProductItemPage.getPrice());
        System.out.println(newProductItemPage.getTax());
//=============================
        System.out.println("//===================================");
        NewProductItemPage  newproductItemPage2 = new NewProductItemPage(webDriver, "HP LP3065");
        System.out.println(newproductItemPage2.getDescription());
        System.out.println(newproductItemPage2.getNewPrice());
        System.out.println(newproductItemPage2.getOldPrice());
        System.out.println(newProductItemPage.getPrice());
        System.out.println(newproductItemPage2.getTax());


    }
    @Test
    public void verifyAllDesktopsTest2(){
        webDriver.get("http://tutorialsninja.com/demo/");

        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openMenu("Laptops & Notebooks", "Show All Laptops & Notebooks");


    }
    @Test
    public void verifyAllDesktopsTest3(){
        webDriver.get("http://tutorialsninja.com/demo/");

        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openMenu("Components", "Monitors");


    }
    @Test
    public void verifyAllDesktopsTest4(){
        webDriver.get("http://tutorialsninja.com/demo/");

        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openMenu("Tablets");


    }

    @Test
    public void verify(){
        webDriver.get("http://tutorialsninja.com/demo/");

        YourStorePage yourStorePage = new YourStorePage(webDriver);
        yourStorePage.openMenu("Desktops", "Show All Desktops");

        ProductPage desktopsProductPage = new ProductPage(webDriver, "Desktops");

        Assert.assertEquals(desktopsProductPage.getPageTitle(),"Desktops");


        NewProductItemPage newProductItemPage = new NewProductItemPage(webDriver, "Canon EOS 5D");
        ProductItem productItem1 = newProductItemPage.getproductItem();
        System.out.println(productItem1.toString());

        NewProductItemPage newProductItemPage2 = new NewProductItemPage(webDriver, "HP LP3065");
        ProductItem productItem2 = newProductItemPage2.getproductItem();
        System.out.println(productItem2.toString());


    }


}

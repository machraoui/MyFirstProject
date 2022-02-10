import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver ;
    @BeforeMethod
    public void setup(){
        driver =new FirefoxDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }
    /* @AfterMethod
    public void teardown (){
        driver.quit(); */

    // }
    @Test
    public void ConexionOkTest (){
        String validLogin ="poeigrp2@yopmail.com";
        String validPwd = "Poeigrp2.";


        HomePage homePage = new HomePage(driver);
        homePage.loginPagevalid().LoginOk(validLogin,validPwd);



    }
    @Test
    public void ConexionFailedTest (){
        String validLogin ="poeigrp2@yopmail.com";
        String validPwd = "Poei";
        String expectedHello= "Hello";

        HomePage homePage = new HomePage(driver);
        homePage.loginPagevalid().LoginOk(validLogin,validPwd);
        String Verif = homePage.loginPagevalid().conxOK();

        Assert.assertTrue(Verif.contains(expectedHello),"Hello poeigrp2");


    }
    @Test
    public void ConexionFailedTest2 (){
        String validLogin ="poeigrp2@yopmail.com";
        String validPwd = " ";
        String expectedHello= "Hello";

        HomePage homePage = new HomePage(driver);
        homePage.loginPagevalid().LoginOk(validLogin,validPwd);
        String Verif = homePage.loginPagevalid().conxOK();

        Assert.assertTrue(Verif.contains(expectedHello),"Hello poeigrp2");


    }
    @Test
    public void ConexionFailedTest3 (){
        String validLogin ="poeigrp2";
        String validPwd = "Poeigrp2.";
        String expectedHello= "Hello";

        HomePage homePage = new HomePage(driver);
        homePage.loginPagevalid().LoginOk(validLogin,validPwd);
        String Verif = homePage.loginPagevalid().conxOK();

        Assert.assertTrue(Verif.contains(expectedHello),"Hello poeigrp2");


    }




















}

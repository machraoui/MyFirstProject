import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest {

    WebDriver driver ;

    @BeforeTest
    public void setup(){
        driver =new FirefoxDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }
     @AfterTest
    public void teardown (){
        driver.quit();

     }

    @Test
    public void ConexionOkTest (){
        String validLogin ="poeigrp2@yopmail.com";
        String validPwd = "Poeigrp2.";
        HomePage homePage = new HomePage(driver);
        //homePage.loginPagevalid().LoginOk(validLogin,validPwd);
        homePage.loginPagevalid().LoginOk(validLogin,validPwd);




    }

    @Test
    public void ConexionFailedTest (){
        String validLogin ="poeigrp2@yopmail.com";
        String validPwd = "Poei";
        String expectedHello= "The password you entered for the username poeigrp2@yopmail.com is incorrect.";

        HomePage homePage = new HomePage(driver);
       // homePage.loginPageinvalid().Login_Failed(validLogin,validPwd);
        String Verif = homePage.loginPageinvalid().Login_Failed(validLogin,validPwd).conxNOK();

        Assert.assertTrue(Verif.contains(expectedHello),"ERROR");


    }

    @Test
    public void ConexionFailedTest2 (){
        String validLogin ="poeigrp2@yopmail.com";
        String validPwd = " ";
        String expectedHello= "Error: Password is required";

        HomePage homePage = new HomePage(driver);
        homePage.loginPageinvalid().Login_Failed(validLogin,validPwd).conxNOK();
       // String Verif2 = homePage.loginPageinvalid().Login_Failed(validLogin,validPwd).conxNOK();

        //Assert.assertTrue(Verif2.contains(expectedHello),"Hello poeigrp2");


}

    @Test
    public void ConexionFailedTest3 (){
        String validLogin1 ="poeigp2";
        String validPwd1 = "Poeigrp2.";
        String expectedHello= "Hello";

        HomePage homePage = new HomePage(driver);
       homePage.loginPageinvalid().Login_Failed(validLogin1,validPwd1).conxNOK();
       // Assert.assertTrue(Verif.contains(expectedHello),"Hello poeigrp2");


    }
}

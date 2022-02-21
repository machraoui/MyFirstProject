import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountPageTest {
    WebDriver driver ;
    @BeforeMethod
    public void setup(){
        driver =new FirefoxDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }
    @Test
    public void PresencedesLiens (){
        String validLogin ="poeigrp2@yopmail.com";
        String validPwd = "Poeigrp2.";

        String dasboard = "Dashboard" ;
        String Orders =   "Orders" ;
        String Downloads= "Downloads" ;
        String adresses = "Addresses" ;
        String logout =  "Logout"  ;

        HomePage homePage = new HomePage(driver);
        MyAccountPage myAccountPage = homePage.loginPagevalid().Login_AccountPage(validLogin,validPwd);
        String download = myAccountPage.downloadLinkSelector();
        String logoutlink = myAccountPage.logOutSelector();
       // System.out.println(download);
        Assert.assertTrue(download.contains(Downloads),"the link must be present");
        Assert.assertTrue(logoutlink.contains(logout),"the link must be present");


    }
    @Test
    public void Logout_Test_And_ConexionWithemptymail (){
        String validLogin =" ";
        String validPwd = "Poeigrp2.";
        String reconexion = "Login";
        String testwithemptymail ="Error: Username is required.";
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.loginPagevalid().Login_AccountPage(validLogin,validPwd).Logout_Valid();
        System.out.println(loginPage.Logout_succesful());
       // System.out.println(bac);
        Assert.assertTrue(loginPage.Logout_succesful().contains(testwithemptymail),"Reconect is impossible with empty username");








    }




}

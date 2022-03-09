import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageTest {

    WebDriver driver ;
    @BeforeMethod
    public void setup(){
        driver =new FirefoxDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void teardown (){
        driver.quit();

    }

    @Test

    public void ArticlCategoriesRight (){
        HomePage homePage = new HomePage(driver);
       // homePage.shopPage().articles_par_theme();
        ProductPage productPage= homePage.shopPage().articles_par_themeAndroid();
        System.out.println(productPage.Theme1());
       // System.out.println(productPage.theme2());

    }
    @Test
    public void CategoriesTest (){
        HomePage homePage = new HomePage(driver);
        homePage.shopPage().articles_par_themeAndroid();
    }

    @Test
    public void CategoriesHtml () {
     HomePage homePage = new HomePage(driver);
     // homePage.shopPage().articles_par_theme();
     ProductPage productPage= homePage.shopPage().articles_par_themehtml();
    // System.out.println(productPage.Theme1());
     System.out.println(productPage.theme2());

 }
 @Test
    public void picclicableAndDescripionPresent (){
        String Price = " ₹450.00";

        HomePage homePage = new HomePage(driver);
        Productguide productguide = homePage.shopPage().articles_par_themeAndroid().ProductCaracteristique();
        System.out.println(productguide.PriceExsist());
        System.out.println(productguide.StockExsist());
        System.out.println(productguide.DescriptionExsist());
        String Pricefound =productguide.PriceExsist();
     // Assert.assertTrue(productguide.PriceExsist().contains(Price),"Price is correct");
     Assert.assertTrue(productguide.StockExsist().contains("7081"),"Stock Exisite");

 }





}

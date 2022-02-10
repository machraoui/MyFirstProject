import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
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
    public void ShopPageTest (){
        HomePage homePage = new HomePage(driver);
        ShopPage shopPage = homePage.shopPage();


    }


}

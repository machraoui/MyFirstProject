import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
    WebDriver driver ;
    Logger log = LogManager.getLogger(HomePageTest.class);
    @BeforeMethod
    public void setup(){
        driver =new FirefoxDriver();
        log.info("FireFox has started");
        driver.get("http://practice.automationtesting.in/");
        log.info("Practice is open");
        driver.manage().window().maximize();
    }
     @AfterMethod
    public void teardown (){
        driver.quit();

   }
    @Test
    public void ShopPageTest (){
        HomePage homePage = new HomePage(driver);
        ShopPage shopPage = homePage.shopPage();


    }


}

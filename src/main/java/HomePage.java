import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class HomePage {
    WebDriver driver;
    By Accountselector = By.cssSelector("#menu-item-50 > a");
    By Shoppageselector = By.cssSelector("#menu-item-40 > a");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



public ShopPage shopPage () {
    driver.findElement(Shoppageselector).click();
    //timing
    //Log
    ShopPage shopPage = new ShopPage();
    return shopPage;

}
public LoginPage loginPagevalid (){
        driver.findElement(Accountselector).click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;

}

}


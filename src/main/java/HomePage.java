import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class HomePage {
    WebDriver driver;
    By Accountselector = By.cssSelector("#menu-item-50 > a");
    By Shoppageselector = By.cssSelector("#menu-item-40 > a");
    By shoptPageSelector = By.cssSelector("li[id='menu-item-40'] a");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public ShopPage shopPage() {
        driver.findElement(Shoppageselector).click();
        ShopPage shopPage = new ShopPage(driver);
        return shopPage;

    }

    public LoginPage loginPagevalid() {
        driver.findElement(Accountselector).click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;

    }

    public LoginPage loginPageinvalid() {
        driver.findElement(Accountselector).click();
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;

    }

    public BasketPage openMy_Bascket_Page() {
        driver.findElement(shoptPageSelector).click();
        BasketPage basketPage = new BasketPage(driver);
        return basketPage;
    }
}


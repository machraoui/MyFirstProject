import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {
    WebDriver driver ;
    By Dashboardselector = By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(1) > a:nth-child(1)");
    By orderLinkSelector = By.cssSelector("li[class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders'] a");
    By downloadLinkSelector = By.cssSelector("li[class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads'] a");
    By adressesLinkSelector = By.cssSelector("a[href='http://practice.automationtesting.in/my-account/edit-address/']");
    By accountdetailsSelector = By.cssSelector("a[href='http://practice.automationtesting.in/my-account/edit-account/']");
    By logOutSelector = By.cssSelector("li.woocommerce-MyAccount-navigation-link:nth-child(6) > a:nth-child(1)");

    long timeout =10 ;


    public MyAccountPage (WebDriver driver){
        this.driver=driver;
    }

    public String getDashbord (){
        return driver.findElement(Dashboardselector).getText();

    }
    public String logOutSelector (){

        return driver.findElement(logOutSelector).getText();

    }
    public String adressesLinkSelector (){

        return driver.findElement(adressesLinkSelector).getText();

    }
    public String downloadLinkSelector (){

        return driver.findElement(downloadLinkSelector).getText();

    }
    public String orderLinkSelector (){

        return driver.findElement(orderLinkSelector).getText();

    }

public LoginPage Logout_Valid (){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    wait.until(ExpectedConditions.elementToBeClickable(logOutSelector));

    driver.findElement(logOutSelector).click();

    LoginPage loginPage = new LoginPage(driver);
    return loginPage ;

}






}

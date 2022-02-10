import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    By usernameselector = By.cssSelector("#username");
    By password = By.cssSelector("#password");
    By ButtonLoginselector =By.cssSelector("[name=login]");
    By cnxok = By.cssSelector(".woocommerce-MyAccount-content > p:nth-child(1)");
    By reconectbutton = By.cssSelector("p.form-row:nth-child(3) > input:nth-child(3)");
    By conneexionwithemptyMail = By.cssSelector(".woocommerce-error > li:nth-child(1)");
    long timeout = 10 ;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage LoginOk (String login , String Password) {

        driver.findElement(usernameselector).sendKeys(login);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(ButtonLoginselector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cnxok));

        return this ;
    }
    public String conxOK () {
       return driver.findElement((cnxok)).getText() ;
    }


    public MyAccountPage Login_AccountPage (String login , String Password) {

        driver.findElement(usernameselector).sendKeys(login);
        driver.findElement(password).sendKeys(Password);
        driver.findElement(ButtonLoginselector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cnxok));

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        return myAccountPage ;
    }
    public String Logout_succesful (){

        driver.findElement(reconectbutton).click();
       return  driver.findElement(conneexionwithemptyMail).getText();



    }


    }






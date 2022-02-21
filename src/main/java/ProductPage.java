import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage {

        WebDriver driver ;
       // By Articlesselector = By.cssSelector("#content");
          By themeandroid = By.cssSelector(".woocommerce-LoopProduct-link > h3:nth-child(3)");
          By themeHtml = By.cssSelector(".products");
          By Piclien = By.cssSelector(".post-169 > a:nth-child(1) > img:nth-child(2)");
          long timout = 10;
        public ProductPage(WebDriver driver){
            this.driver=driver;
        }

        public String Theme1 () {

            return driver.findElement(themeandroid).getText();
        }
       public String theme2 (){
           return driver.findElement(themeHtml).getText();
       }
       public Productguide ProductCaracteristique (){

            driver.findElement(Piclien).click();
            Productguide productguide =new Productguide(driver);
            return productguide ;

       }

}

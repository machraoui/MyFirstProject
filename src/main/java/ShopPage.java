import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ShopPage {
    WebDriver driver ;
    By Articlesselector = By.cssSelector(".products");
    By addartictToBasketButton = By.cssSelector(".post-169 > a:nth-child(2)");
    By CheckBasketButton = By.cssSelector(".added_to_cart");
    By ArticlsFilter = By.cssSelector(".ui-slider-range ");
    By themeAndroid = By.cssSelector("li.cat-item:nth-child(1) > a:nth-child(1)");
    By Categories = By.cssSelector("#woocommerce_product_categories-2");
    By themehtml = By.cssSelector("li.cat-item:nth-child(2) > a:nth-child(1)");
    By themeHtml = By.cssSelector(".products");
    long timeout = 10 ;
    public ShopPage(WebDriver driver){
        this.driver=driver;
    }
//To Do 10/12/2022
    public String ArticlesPresnts (){
        return driver.findElement(Articlesselector).getText();

       /* List<WebElement> listOfResults = driver.findElements(Articlesselector);
        listOfResults.get(index).click(); */
      /* ProductPage productPage = new ProductPage(driver);
       return productPage ;*/    //Verif avec Salim
    }
    public BasketPage AddToBasket (){
        String ExistAdd= driver.findElement(addartictToBasketButton).getText();
        driver.findElement(addartictToBasketButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(CheckBasketButton));

        driver.findElement(CheckBasketButton).click();

        BasketPage basketPage=new BasketPage(driver);
        return basketPage;

    }

    public String AritclesParOrder (){
        driver.findElement(ArticlsFilter).click();
        new Actions(driver).moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/aside/div[2]/form/div/div[1]/div"))).click().perform();
        driver.findElement(By.cssSelector("button.button")).click();
       return driver.findElement(By.cssSelector(".price_label")).getText();

    }
    public void CheckProductOrders (){
     //TODO 15/02




    }
   public  ProductPage articles_par_themeAndroid (){
       List<WebElement> listOfResults = driver.findElements(Categories);
      // return listOfResults.get(index);
           for (WebElement element :listOfResults) {
               System.out.println(element.getText());
           }
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
       wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.cat-item:nth-child(1) > a:nth-child(1)")));
           driver.findElement(themeAndroid).click();
          // driver.getTitle(By.ByCssSelector(".woocommerce-LoopProduct-link > h3:nth-child(3)"));

           ProductPage productPage = new ProductPage(driver);
           return productPage;


   }
    public  ProductPage articles_par_themehtml () {
        List<WebElement> listOfResults = driver.findElements(Categories);
        // return listOfResults.get(index);
        for (WebElement element : listOfResults) {
            System.out.println(element.getText());
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.cat-item:nth-child(1) > a:nth-child(1)")));
        driver.findElement(themehtml).click();
        // driver.getTitle(By.ByCssSelector(".woocommerce-LoopProduct-link > h3:nth-child(3)"));

        ProductPage productPage = new ProductPage(driver);
        return productPage;


    }




}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productguide {
    WebDriver driver ;
    public Productguide (WebDriver driver){
        this.driver=driver;
    }
    public String ADDtoBasketExsist (){
      return   driver.findElement(By.cssSelector(".single_add_to_cart_button")).getText();
    }

    public String DescriptionExsist (){
        return   driver.findElement(By.cssSelector("#tab-description")).getText();
    }
    public String PriceExsist (){
        return   driver.findElement(By.cssSelector(".price > ins:nth-child(2) > span:nth-child(1)")).getText();
    }
    public String StockExsist (){
        return   driver.findElement(By.cssSelector(".stock")).getText();
    }















}
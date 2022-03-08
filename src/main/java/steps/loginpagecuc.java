package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginpagecuc {
    WebDriver driver ;
    @Given("I lanch firefox browser")
    public void i_lanch_firefox_browser() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        driver =new FirefoxDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();
    }

    @When("i open my login  page")
    public void i_open_my_login_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("i use my right login and password")
    public void i_use_my_right_login_and_password() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();

    }

    @Then("i m in my dashbord page")
    public void i_m_in_my_dashbord_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

}

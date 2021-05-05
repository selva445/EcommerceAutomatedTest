package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class AllSteps extends BaseClass{
    public static WebDriver driver;

    @Given("the User Navigates to the E-commerceWebsite")
    public void theUserNavigatesToTheECommerceWebsite() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://selvaaccenturetest.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @When("I choose the FilterSearch as {string}")
    public void iChooseTheFilterSearchAs(String arg0) {

        Select drpCountry = new Select(driver.findElement(By.name("category")));
        drpCountry.selectByVisibleText(arg0);
    }


    @Then("I should be able to view the results")
    public void iShouldBeAbleToViewTheResults() {
        Assert.assertTrue( driver.getTitle().contains("Ecommerce"));
    }

    @Then("I Close The Browser")
    public void iCloseTheBrowser() {
        driver.close();
    }

    @When("I Click on {string} for any product")
    public void iClickOnForAnyProduct(String arg0) throws InterruptedException {

        driver.findElement(By.xpath("//a[2]/p")).click();

    }
}

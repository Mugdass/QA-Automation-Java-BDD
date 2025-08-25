package com.example.stepdefinitions;

import com.example.pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("user enters valid username and password")
    public void user_enters_valid_credentials() {
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password123");
    }

    @And("clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to the homepage")
    public void user_redirected_to_homepage() {
        assertEquals(driver.getTitle(), "Home Page");
        driver.quit();
    }
}

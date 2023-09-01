package com.tietoevry.seleniumtests;

import com.tietoevry.pages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

// Define a base test class for test setup and teardown
public class BaseTest {

    // WebDriver instance and base URL
    private WebDriver driver;
    private final String baseUrl = "";

    // LandingPage instance for test setup
    protected LandingPage landingPage;

    // Setup WebDriverManager for ChromeDriver
    @BeforeClass
    public void init(){
        WebDriverManager.chromedriver().setup();
    }

    // Setup method for each test
    @BeforeMethod
    public void setup(){
        // Initialize a new ChromeDriver instance
        driver = new ChromeDriver();
        // Navigate to the base URL
        driver.get(baseUrl);
        // Create a LandingPage instance
        landingPage = new LandingPage();
        // Set the WebDriver instance for the LandingPage
        landingPage.setDriver(driver);
    }

    // Teardown method after each test
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}



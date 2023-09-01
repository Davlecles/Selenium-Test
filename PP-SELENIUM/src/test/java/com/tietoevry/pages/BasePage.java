package com.tietoevry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    // Store the WebDriver instance
    protected static WebDriver driver;

    // Set the WebDriver instance
    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    // Find a web element using a locator
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    // Click on a web element identified by a locator
    protected void click(By locator){
        find(locator).click();
    }

    // Input text into a web element identified by a locator
    protected void sendKeys(By locator, String input){
        find(locator).sendKeys(input);
    }

    // Get the visible text of a web element identified by a locator
    protected String getText(By locator){
        return find(locator).getText();
    }
}






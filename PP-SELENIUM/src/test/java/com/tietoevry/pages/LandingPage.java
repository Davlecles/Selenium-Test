package com.tietoevry.pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    // Define locators for elements on the landing page
    private final By administrationMenu = By.linkText("Administration");
    private final By administrationMenu_RegisterLink = By.linkText("Register");

    // Method to navigate to the AdministrationPage by clicking on links
    public Administration_RegisterPage followLinkToAdministrationPage() {
        click(administrationMenu);
        click(administrationMenu_RegisterLink);
        return new Administration_RegisterPage();
    }
}

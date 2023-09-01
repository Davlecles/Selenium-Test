package com.tietoevry.pages;

import org.openqa.selenium.By;


public class Administration_RegisterPage extends BasePage {

    // Locators for elements on the AdministrationPage
    private final By nyVerksamhetButton = By.id("");
    private final By verksamhetsNamnField = By.id("");
    private final By displayedVerksamhetsnamn = By.id("");

    // Clicks the "Ny Verksamhet" button
    public void clickNyVerksamhetButton() {
        click(nyVerksamhetButton);
    }

    // Inputs text into the "Verksamhetsnamn" field
    public void typeInVerksamhetsNamnField(String input) {
        sendKeys(verksamhetsNamnField, input);
    }

    // Gets the text of the displayed "Verksamhetsnamn"
    public String getTextOfVerksamhetsnamn(){
        return getText(displayedVerksamhetsnamn);
    }
}

package com.tietoevry.seleniumtests;

import com.tietoevry.pages.Administration_RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Administration_RegisterTest extends BaseTest {


    // Administration_RegisterPage instance
    private Administration_RegisterPage administration_RegisterPage;

    // Test method to add a new "Verksamhet" in Administration_RegisterPage
    @Test
    public void Administration_Register_AddNyVerksamhet() {
        // Given
        String verksamhetNamn = "Test Verksamhet"; // Define a test "Verksamhet" name

        // When
        administration_RegisterPage = landingPage.followLinkToAdministrationPage(); // Navigate to Administration_RegisterPage
        administration_RegisterPage.clickNyVerksamhetButton(); // Click on "Ny Verksamhet" button
        administration_RegisterPage.typeInVerksamhetsNamnField(verksamhetNamn); // Enter the "Test Verksamhet" name
        String result = administration_RegisterPage.getTextOfVerksamhetsnamn(); // Get displayed "Verksamhet" name

        // Then
        Assert.assertEquals(verksamhetNamn, result); // Assert that the displayed name matches the test input
    }
}

package ui;

import bo.LoginBO;
import driver.DriverProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest {
    @Test
    public void testLogin() {
        // Step 1: Input login
        new LoginBO().login();
        LoginBO.inputLogin("andrew.doe");
        LoginBO.clickLoginButton();

        // Step 2: Input password
        LoginBO.inputPassword("password123");

        // Step 3: Click submit
        LoginBO.clickLoginButton();

        // Step 4: Verify user is logged in
        boolean loggedIn = LoginBO.isLoggedIn();
        assertTrue(loggedIn, "User is not logged in!");
    }

    @AfterClass
    public void tearDown() {
        DriverProvider.quitDriver();
    }
}

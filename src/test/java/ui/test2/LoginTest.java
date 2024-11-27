package ui.test2;

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
        LoginBO.inputLogin("artur.chopyk.150@gmail.com");
        LoginBO.clickLoginButton();

        // Step 2: Input password
        LoginBO.inputPassword("examplePasswordTest123%%%");

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

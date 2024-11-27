package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static driver.DriverProvider.getDriver;

public class LoginPO {
    // Get page
    public LoginPO() {
        getDriver().get("https://id.atlassian.com/login");
    }

    // Input login
    public static void inputUsername(String username) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        usernameField.sendKeys(username);
    }

    // Click login button
    public static void clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='login-submit']")));
        loginButton.click();
    }

    // Input password
    public static void inputPassword(String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        passwordField.sendKeys(password);
    }

    // Verify user is logged in
    public static boolean isUserLoggedIn() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("home.atlassian.com"));
        String currentUrl = getDriver().getCurrentUrl();
        return currentUrl.contains("home.atlassian.com");
    }
}

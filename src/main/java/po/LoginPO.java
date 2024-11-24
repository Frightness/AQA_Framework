package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static driver.DriverProvider.getDriver;

public class LoginPO {
    // Get page
    public LoginPO() {
        getDriver().get("http://localhost/login_page.php");
    }

    // Input login
    public static void inputUsername(String username) {
        WebElement usernameField = getDriver().findElement(By.xpath("//input[@name='username']"));
        usernameField.sendKeys(username);
    }

    // Click login button
    public static void clickLoginButton() {
        WebElement loginButton = getDriver().findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
    }

    // Input password
    public static void inputPassword(String password) {
        WebElement usernameField = getDriver().findElement(By.xpath("//input[@name='password']"));
        usernameField.sendKeys(password);
    }

    // Verify user is logged in
    public static boolean isUserLoggedIn() {
        String currentUrl = getDriver().getCurrentUrl();
        return currentUrl.contains("my_view_page.php");
    }
}
package util;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LabelElement extends Element {
    public LabelElement(WebElement webElement) {
        super(webElement);
    }

    public String getText(){
        System.out.println("getText");
        return webElement.getText();
    }

    public void waitForText(String text) {
        System.out.println("waitForText");
        WebDriverWait wait = new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
    }

    public boolean verifyLabelExists() {
        System.out.println("verifyLabelExists");
        return webElement.isDisplayed();
    }
}

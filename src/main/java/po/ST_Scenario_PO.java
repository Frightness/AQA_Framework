package po;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.FillDecorator;
import util.LabelElement;

import java.time.Duration;

import static driver.DriverProvider.getDriver;

public class ST_Scenario_PO {
    public ST_Scenario_PO(String url) {
        DriverProvider.getDriver().get(url);
        PageFactory.initElements(new FillDecorator(DriverProvider.getDriver()), this);
        waitForPageToLoad();
        waitForGoalsTab();
        waitForGoalsTitle();
    }

    private void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(driver -> ((org.openqa.selenium.JavascriptExecutor) driver)
                .executeScript("return document.readyState").equals("complete"));
    }

    private void waitForGoalsTab() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(viewGoalsTab));
    }

    private void waitForGoalsTitle() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public WebElement getGoalsTab() {
        return viewGoalsTab;
    }

    public LabelElement getGoalsTitle() {
        return goalsTab;
    }

    @FindBy(xpath = "//a[@href='/goals']")
    WebElement viewGoalsTab;

    @FindBy(xpath = "//h1[@class='css-rex7s6']")
    LabelElement goalsTab;
}
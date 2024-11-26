package po;

import driver.DriverProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.FillDecorator;
import util.LabelElement;

public class ST_Scenario_PO {
    public ST_Scenario_PO(String url) {
        DriverProvider.getDriver().get(url);
        PageFactory.initElements(new FillDecorator(DriverProvider.getDriver()), this);
    }

    public WebElement getViewIssueTab() {
        return viewIssueTab;
    }

    public LabelElement getIssueTitle() {
        return issueTitle;
    }

    @FindBy(linkText = "View Issues")
    WebElement viewIssueTab;

    @FindBy(xpath = "//h4[contains(text(), 'Filters')]")
    LabelElement issueTitle;
}

package bo;

import org.testng.Assert;
import po.ST_Scenario_PO;

public class ST_Scenerio_BO {
    ST_Scenario_PO homePage;

    public ST_Scenerio_BO openGoalsTab() {
        homePage = new ST_Scenario_PO("https://home.atlassian.com");
        homePage.getGoalsTab().click();
        return this;
    }

    public ST_Scenerio_BO verifyGoalsTitle() {
        homePage.getGoalsTitle().getText();
        homePage.getGoalsTitle().waitForText("Goals");
        homePage.getGoalsTitle().verifyLabelExists();


        Assert.assertTrue(homePage.getGoalsTitle().verifyLabelExists());
        return this;
    }
}

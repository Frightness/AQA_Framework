package bo;

import org.testng.Assert;
import po.ST_Scenario_PO;

public class ST_Scenerio_BO {
    ST_Scenario_PO homePage;

    public ST_Scenerio_BO openViewIssueTab() {
        homePage = new ST_Scenario_PO("http://localhost/my_view_page.php");
        homePage.getViewIssueTab().click();
        return this;
    }

    public ST_Scenerio_BO verifyIssueTitle() {
        homePage.getIssueTitle().getText();
        homePage.getIssueTitle().waitForText("Viewing Issues");
        homePage.getIssueTitle().verifyLabelExists();


        Assert.assertTrue(homePage.getIssueTitle().verifyLabelExists());
        return this;
    }
}

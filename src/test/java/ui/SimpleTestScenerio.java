package ui;

import bo.ST_Scenerio_BO;
import driver.DriverProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SimpleTestScenerio {
    @Test
    void LabelTest() {
        new LoginTest().testLogin();
        new ST_Scenerio_BO().openViewIssueTab().verifyIssueTitle();
    }

    @AfterTest
    void closeBrowser() {
        DriverProvider.getDriver().close();
    }
}
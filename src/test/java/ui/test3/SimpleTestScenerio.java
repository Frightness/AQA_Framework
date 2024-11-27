package ui.test3;

import bo.ST_Scenerio_BO;
import driver.DriverProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import ui.test2.LoginTest;

public class SimpleTestScenerio {
    @Test
    void LabelTest() {
        new LoginTest().testLogin();
        new ST_Scenerio_BO().openGoalsTab().verifyGoalsTitle();
    }

    @AfterTest
    void closeBrowser() {
        DriverProvider.getDriver().close();
    }
}
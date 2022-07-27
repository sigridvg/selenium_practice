package Test;

import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class alertsTest extends BaseTest {
    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickAlerts();
        alertPage.triggerAlert();
        alertPage.clickAcceptAlert();
        assertEquals(alertPage.getResult(), "You successfuly clicked an alert");
    }

    @Test
    public void testGetTextAlert(){
        var alertPage = homePage.clickAlerts();
        alertPage.triggerConfirm();
        assertEquals(alertPage.alertGetText(), "I am a JS Confirm");
        alertPage.clickCancelAlert();
    }

    @Test
    public void testSetInputAlertPromp(){
        var alertPage = homePage.clickAlerts();
        alertPage.triggerPrompt();
        alertPage.alertSendKeys("TAU test");
        alertPage.clickAcceptAlert();
        assertEquals(alertPage.getResult(),"TAU test");
    }
}

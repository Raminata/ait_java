package com.demoqa.tests;

import com.demoqa.pages.AlertPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePenel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePenel(driver).selectAlerts();
    }

    @Test
    public void sentMessageToAlertTest() {
        new AlertPage(driver).sendMessageToAlert("Hello world!")
                .assertMessage("Hello world!");
    }
}
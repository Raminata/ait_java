package com.demoqa.tests;

import com.demoqa.pages.AlertPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePenel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver)
                .getAlertsFrameWindows();

        new SidePenel(driver)
                .selectAlerts();
    }

    @Test
    public void sentMessageToAlertTest() {
        new AlertPage(driver)
                .sendMessageToAlert("Hello world!")
                .assertMessage("Hello world!");
    }

    @Test
    public void clickAlertTest() {
        new AlertPage(driver)
                .click5SecondsAlertButton()
                .wait5Seconds()
                .assertAlert5Second();
    }

    @Test
    public void click5SecondsAlertDelayTest() {
        new AlertPage(driver)
                .clickOnAlertButton()
                .assertAlert();
    }

    @Test
    public void clickConfirmTest() {
        new AlertPage(driver)
                .clickOnConfirmButton()
                .assertConfirmPrompt();
    }

}

package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[.='Alerts, Frame & Windows']")
    WebElement alertsFrameWindows;

    public SidePenel getAlertsFrameWindows() {
        click(alertsFrameWindows);
        return new SidePenel(driver);
    }

    @FindBy(xpath = "//h5[.='Interactions']")
    WebElement interactions;

    public SidePenel getInteractions() {
        click(interactions);
        return new SidePenel(driver);
    }
}

package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePenel extends BasePage {

    public SidePenel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertPage selectAlerts() {
        click(alerts);
        return new AlertPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browseWindows;

    public BrowserWindowsPage selectBrowserWindows() {
        click(browseWindows);
        return new BrowserWindowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DroppablePage selectDroppable() {
        click(droppable);
        return new DroppablePage(driver);
    }
}

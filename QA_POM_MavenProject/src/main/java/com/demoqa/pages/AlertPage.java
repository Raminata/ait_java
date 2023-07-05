package com.demoqa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "promtButton")
    WebElement promtButton;

    public AlertPage sendMessageToAlert(String message) {
        click(promtButton);

        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }

        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertPage assertMessage(String message) {
        Assert.assertTrue(promptResult.getText().contains(message));
        return this;
    }

    @FindBy(id = "timerAlertButton")
    WebElement timerButton;

    public AlertPage click5SecondsAlertButton() {
        click(timerButton);
        return this;
    }

    public AlertPage wait5Seconds() {
        pause(TimeUnit.SECONDS.toMillis(5L));
        return this;
    }

    public AlertPage assertAlert5Second() {
        Alert alert = driver.switchTo().alert();

        if (alert != null) {
            alert.accept();
        }

        Assert.assertNotNull(alert);
        return this;
    }

    @FindBy(id = "alertButton")
    WebElement alertButton;

    public AlertPage clickOnAlertButton() {
        click(alertButton);
        return this;
    }

    public AlertPage assertAlert() {
        Alert alert = driver.switchTo().alert();

        if (alert != null) {
            alert.accept();
        }

        Assert.assertNotNull(alert);
        return this;
    }
}

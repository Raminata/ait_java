package com.shop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends BaseHelper {

    public HeaderHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isRegisterLinkPresent() {
        return isElementPresent(By.xpath("//a[.='Register']"));
    }

    public void clickOnRegisterLink() {
        click(By.xpath("//a[.='Register']"));
    }
}

package com.shop.fw;

import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton() {
        click(By.id("register-button"));
    }

    public boolean isPresentContinueButton() {
        return isElementPresent(By.className("register-continue-button"));
    }

    public void fillLoginRegistrationForm(User user) {
        type(By.id("Email"), user.getEmail());
        type(By.id("FirstName"), user.getFirstName());
        type(By.id("LastName"), user.getLastName());
        type(By.id("Password"), user.getPassword());
        type(By.id("ConfirmPassword"), user.getPassword());

        if (user.isFemale()) {
            click(By.id("gender-female"));
        } else {
            click(By.id("gender-male"));
        }
    }
}

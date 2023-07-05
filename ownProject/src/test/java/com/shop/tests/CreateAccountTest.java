package com.shop.tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.UUID;

public class CreateAccountTest extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        app.getHeader().clickOnRegisterLink();
    }

    @Test
    public void createNewAccountPositiveTest() {
        //enter email field
        //[placeholder='Email']

        app.getUser()
                .fillLoginRegistrationForm(
                        new User()
                                .setEmail(UUID.randomUUID() + "@gmail.com")
                                .setPassword("Password1!")
                                .setFemale(true)
                                .setLastName("Litva")
                                .setFirstName("Ramka")
                );

        //click on Registration
        //by.name - registration
        app.getUser().clickRegisterButton();

        //assert user logged in(check Sign out button displayed)
        Assert.assertTrue(app.getUser().isPresentContinueButton());
    }

}

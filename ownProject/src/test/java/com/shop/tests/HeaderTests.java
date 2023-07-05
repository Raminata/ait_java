package com.shop.tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderTests extends TestBase {

    @Test
    public void headerRegistration() {
        Assert.assertTrue(app.getHeader().isRegisterLinkPresent());
    }

}


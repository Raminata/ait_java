package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {

    WebDriver driver;

    // before setup
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.get("https://telranedu.web.app/login");

        //maximize browser window
        driver.manage().window().maximize();
    }
    // tests

    @Test
    public void findElementByTagName(){
        System.out.println("site opened");
        //find element by
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        //find list
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        WebElement element1 = driver.findElement((By.className("navbar-component=nav__1x_4m")));
        System.out.println(element1.getText());

        driver.findElement(By.name("email"));
    }

    // after tearDown
    @AfterMethod
    public void tearDown() {
       // driver.quit(); //all tabs & close browser
       // driver.close(); // only one tab(if tab only one -> close browser)
    }
}

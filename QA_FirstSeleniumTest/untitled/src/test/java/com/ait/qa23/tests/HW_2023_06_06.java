package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW_2023_06_06 {

    WebDriver driver;

    @BeforeMethod
    public  void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void findElementByCssTest() {
        driver.findElement(By.cssSelector("#small-searchterms"));

        driver.findElement(By.cssSelector("#newsletter-email"));

        driver.findElement(By.cssSelector("#vote-poll-1"));

        driver.findElement(By.cssSelector("#newsletter-subscribe-button"));

        driver.findElement(By.cssSelector("#pollanswers-1"));

        driver.findElement(By.cssSelector(".footer"));

        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("[type='submit']"));

        driver.findElement(By.cssSelector("[href^='/apparel']"));

        driver.findElement(By.cssSelector("[href$='downloads']"));

    }

    @Test
    public void findElementByXpathTest() {

        driver.findElement(By.xpath("//*[@id='small-searchterms']"));

        driver.findElement(By.xpath("//*[@id='newsletter-email']"));

        driver.findElement(By.xpath("//*[@id='vote-poll-1']"));

        driver.findElement(By.xpath("//*[@id='newsletter-subscribe-button']"));

        driver.findElement(By.xpath("//*[@id='pollanswers-1']"));

        driver.findElement(By.xpath("//*[@class='header']"));

        driver.findElement(By.xpath("//*[@class='footer']"));

        driver.findElement(By.xpath("//*[contains(.,'Welcome to our store')]"));

        driver.findElement(By.xpath("//*[@type='submit']"));

        driver.findElement(By.xpath("//*[starts-with(@href, '/apparel')]"));

        driver.findElement(By.xpath("//*[substring(@href, string-length(@href) - string-length('downloads') + 1) = 'downloads']"));
        // substring (dio stringa, ne cijeli.)
        // ENDS With
        // substring (href) shoes-downloads (20) - (downloads) 10 = 10 chars == 'downloads'
    }


}

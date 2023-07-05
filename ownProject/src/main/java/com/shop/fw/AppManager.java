package com.shop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class AppManager {

    String browser;

    public WebDriver driver;

    public AppManager(String browser) {
        this.browser = browser;
    }

    HeaderHelper header;
    UserHelper user;

    public HeaderHelper getHeader() {
        return header;
    }

    public UserHelper getUser() {
        return user;
    }

    public void init() {

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("remote-allow-oigins=*");
            driver = new EdgeDriver(options);
            driver = new EdgeDriver();
        }

        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        header = new HeaderHelper(driver);
        user = new UserHelper(driver);
    }


    public void stop() {
        driver.quit();
    }
}


package com.qa.util;

import okio.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Baseclass {
    public static WebDriver driver;
    public static Properties prop;

    public Baseclass()
    {
        try{
            prop = new Properties();
            FileInputStream fs = new FileInputStream("/Users/lubnaurooj/IdeaProjects/Conduit_ArtifactId/src/main/java/com/qa/config/config.properties");
            prop.load(fs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization()
    {
        String browser = prop.getProperty("browser");
        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/lubnaurooj/IdeaProjects/Conduit_ArtifactId/Drivers/chromedriver");
            driver = new ChromeDriver();
        }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(Utilclass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        }

}

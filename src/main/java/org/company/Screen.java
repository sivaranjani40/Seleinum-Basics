package org.company;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.IOException;

import java.io.File;

import static org.openqa.selenium.io.FileHandler.*;

public class Screen {
    public static void main(String[] args) throws IOException{
        System.setProperty("WebDriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des =new File("/Users/ilankumaran/Ranjani/screenshot/screenshot.png");
        FileHandler.copy(src, des);
        driver.close();


    }
}

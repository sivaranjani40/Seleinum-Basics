package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("dsrtamil3@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("******");
        driver.findElement(By.id("loginbutton")).click();
       // driver.close();



        

    }
}

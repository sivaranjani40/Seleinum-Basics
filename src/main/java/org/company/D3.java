package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("ILAN");
    }
}

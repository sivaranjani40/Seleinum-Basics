package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/frame.xhtml");
        driver.switchTo().frame(0);
        driver.findElement(By.id("Click")).click();
        driver.switchTo().defaultContent();
        int countOfFrames=  driver.findElements(By.tagName("iframe")).size();
        System.out.println(countOfFrames);
        driver.switchTo().defaultContent();

       driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");
        driver.findElement(By.id("Click")).click();
        driver.switchTo().defaultContent();





    }
}

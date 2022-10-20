package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyBoard {
    public static void main(String[] args) throws InterruptedException ,AWTException {
        System.setProperty("Webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Actions act = new Actions(driver);// mouse based actions
        Robot r = new Robot();// keyboard based actions
        WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
        act.contextClick(electronics).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyPress(KeyEvent.VK_ENTER);
        WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        act.contextClick(mobiles).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        WebElement search =driver.findElement(By.xpath("//input[@value='Go']"));
        search.sendKeys("samsung phones"  + Keys.ENTER);

        r.keyPress(KeyEvent.VK_SHIFT);
        r.keyPress(KeyEvent.);
        r.keyPress(KeyEvent.VK_SHIFT);







    }
}

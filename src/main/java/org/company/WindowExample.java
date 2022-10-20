package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
public class WindowExample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("WebDriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testleaf.herokuapp.com/pages/Window.html");
       String parentWindow = driver.getWindowHandle();
       driver.findElement(By.id("home")).click();
       Set< String> childWindow = driver.getWindowHandles();
        for (String w:childWindow) {
            driver.switchTo().window(w);
        }
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a")).click();
        driver.close();
        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
        WebElement multipleWindows =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
        multipleWindows.click();
        int numberOfWindows = driver.getWindowHandles().size();
        System.out.println("number of windows opened" +numberOfWindows);
        WebElement dontCloseMe = driver.findElement(By.xpath("//button[@id='color']"));
        dontCloseMe.click();
        Thread.sleep(3000);
        Set<String> newWindowHandles = driver.getWindowHandles();
        for (String allWindow:newWindowHandles) {
            if(!allWindow.equals(parentWindow)){
                driver.switchTo().window(allWindow);
                driver.close();
            }

        }



    }
}

package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(1000);
        WebElement name =driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input"));
        name.sendKeys("siva");
        WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input"));
        pass.sendKeys("ranjani");
        driver.findElement(By.xpath("/html/body/div[1]/section/main/article/div[2]/div[2]/div/p/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div[3]/div/label/input")).sendKeys("9790659772");
        driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div[4]/div/label/input")).sendKeys("SIVA");
        driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div[5]/div/label/input")).sendKeys("ilan");
        driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div[6]/div/label/input")).sendKeys("********");

    }
}

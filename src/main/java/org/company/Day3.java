package org.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day3 {
    public static void main(String args[]) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        WebElement createAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        createAccount.click();
        Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("siva ranjani");
         driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("danabal");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9790659772");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("goddeness");







    }
}

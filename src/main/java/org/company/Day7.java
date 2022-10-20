package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Day7 {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        Actions act = new Actions(driver);
        WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])"));
        act.moveToElement(women).build().perform();
        act.click().build().perform();
        WebElement womentshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
        //act.moveToElement(womentshirt).build().perform();
        act.doubleClick(womentshirt).build().perform();

    }
}

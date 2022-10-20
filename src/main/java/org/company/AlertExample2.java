package org.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[1]")).click();
        Alert simpleDialog= driver.switchTo().alert();
        simpleDialog.accept();
        driver.findElement(By.xpath("(//*[@class='ui-button-text ui-c'])[2]")).click();
        Alert confimDialog= driver.switchTo().alert();
        confimDialog.dismiss();
        driver.findElement(By.xpath("(//button[@id='j_idt88:j_idt95'])")).click();
        driver.findElement(By.xpath("//*[text()='Dismiss']")).click();
        driver.findElement(By.xpath("(//*[text()='Show'])[4]")).click();
        WebElement close =driver.findElement(By.xpath("//*[@class='m-0']"));
        String s = close.getText();
        System.out.println(s);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101']/div[1]/a")).click();
        driver.findElement(By.xpath("(//*[@type='submit'])[4]")).click();
        Alert prompt= driver.switchTo().alert();
        prompt.sendKeys("siva");
        prompt.accept();
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[text()='No'])")).click();
        driver.findElement(By.xpath("(//*[text()='Show'])[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@role='button'])[12]")).click();
        driver.navigate().refresh();














    }
}

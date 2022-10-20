package org.company;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample  {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
//alertbox
        driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
        Alert simpleAlert= driver.switchTo().alert();
        simpleAlert.accept();
        // confirmbox
        driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
        Alert confirmAlert= driver.switchTo().alert();
        confirmAlert.dismiss();
        //promptbox
        driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
        Alert promptBox = driver.switchTo().alert();
        promptBox.sendKeys("selenium");
        promptBox.accept();
        //linebreak
        driver.findElement(By.xpath("(//button)[4]")).click();
        Alert lineBreaks = driver.switchTo().alert();
        String text =lineBreaks.getText();
        System.out.println(text);
        lineBreaks.accept();



    }
}

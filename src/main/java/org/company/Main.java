package org.company;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
brew update
brew upgrade --cask chromedriver
navigate to folder --> /usr/local/Caskroom/chromedriver/<Version no folder>
xattr -d com.apple.quarantine chromedriver
*/
public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        try {
//driver.get("www.javatpoint.com");
            driver.navigate().to("https://www.google.com");

        }catch (Exception e){
            System.out.println(e);
            //driver.quit();
        }




    }
}

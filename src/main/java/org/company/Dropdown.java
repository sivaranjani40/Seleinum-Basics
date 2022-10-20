package org.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
       WebElement index = driver.findElement(By.id("dropdown1"));
        Select s = new Select(index);
        s.selectByIndex(1);
        s.selectByValue("3");
        s.selectByVisibleText("UFT/QTP");
        WebElement text = driver.findElement(By.name("dropdown2"));
        Select s1 = new Select(text);
        s1.selectByVisibleText("Appium");
        WebElement value = driver.findElement(By.id("dropdown3"));
        Select s2 = new Select(value);
        s2.selectByValue("1");
        WebElement getoption= driver.findElement(By.xpath("//select[@class='dropdown']"));
        Select s3 = new Select(getoption);
        List<WebElement>  listOfOptions = s3.getOptions();
        System.out.println(listOfOptions.size());
        WebElement key =driver.findElement(By.xpath("(//div[@class='example'])[5]/select"));
              key  .sendKeys("Loadrunner");
             WebElement multiple = driver.findElement(By.xpath("(//div[@class='example'])[6]/select"));
              Select s4 = new Select(multiple);
              s4.selectByIndex(1);
              s4.selectByIndex(2);
             s4.deselectByIndex(1);
             s4.deselectByIndex(2);



    }
}

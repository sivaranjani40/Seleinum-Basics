package org.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.org/register.php");
        driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("siva");
        driver.findElement(By.xpath("//input[@type ='text'][ @placeholder='Last Name']")).sendKeys("Danabal");
        driver.findElement(By.xpath("//input[@type ='email'][ @placeholder='Email Address']")).sendKeys("sivaranjani40@gmail.com");
        driver.findElement(By.xpath("//input[@type ='tel'][ @placeholder='Phone Number']")).sendKeys("979065");
        driver.findElement(By.xpath("//input[@id='inputCompanyName']")).sendKeys("BRIOTECH");
        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Street Address']")).sendKeys("street");
        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Street Address 2']")).sendKeys("Virudhachalam");
        driver.findElement(By.xpath("//input[@type='text'][@placeholder='City']")).sendKeys("Cuddalore");
        driver.findElement(By.xpath("//input[@type='text'][@placeholder='State']")).sendKeys("Tamilnadu");
        driver.findElement(By.xpath("//input[@type='text'][@placeholder='Postcode']")).sendKeys("606303");
        driver.findElement(By.xpath("//select[@id='inputCountry']")).sendKeys("India");
        driver.findElement(By.xpath("//input[@id='customfield2']")).sendKeys("86673");
        driver.findElement(By.xpath("//input[@id='inputNewPassword1']")).sendKeys("dfgg");
        driver.findElement(By.xpath("//input[@id='inputNewPassword2']")).sendKeys("123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-default btn-sm btn-sm-block generate-password']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='bootstrap-switch-handle-off bootstrap-switch-secondary']")).click();
        Thread.sleep(1000);






    }
}

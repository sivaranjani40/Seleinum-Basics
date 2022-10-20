package org.company;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.IOException;
import static org.openqa.selenium.io.FileHandler.*;
public class Ticket {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("WebDriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://adactinhotelapp.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("sivaranjani92");
        driver.findElement(By.id("password")).sendKeys("Siva@1992");
        driver.findElement(By.id("login")).click();
        Thread.sleep(1000);
        WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
        Select s = new Select(loc);
        s.selectByValue("London");
        WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
        Select s1 = new Select(hotel);
        s1.selectByIndex(2);
        WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
        Select s2 = new Select(room);
        s2.selectByVisibleText("Super Deluxe");
        WebElement numOfRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
        Select s3 = new Select(numOfRooms);
        s3.selectByValue("1");
        WebElement checkInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
        checkInDate.clear();
        checkInDate.sendKeys("08/10/2022");
        WebElement checkOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
        checkOutDate.clear();
        checkOutDate.sendKeys("12/10/2022");
        WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
        Select s4 = new Select(adults);
        s4.selectByValue("1");
        WebElement child  = driver.findElement(By.xpath("//select[@name='child_room']"));
        Select s5 = new Select(child);
        s5.selectByValue("3");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first_name")).sendKeys("Sivaranjani");
        driver.findElement(By.id("last_name")).sendKeys("Ilankumaran");
        driver.findElement(By.id("address")).sendKeys("6d ,dvs complex, minnagar perambalur");
        driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567891234567");
        WebElement creditCard  = driver.findElement(By.xpath("//select[@id='cc_type']"));
        Select s6 = new Select(creditCard);
        s6.selectByValue("AMEX");
        WebElement expiryMonth  = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
        Select s7 = new Select(expiryMonth);
        s7.selectByValue("12");
        WebElement expiryYear  = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
        Select s8 = new Select(expiryYear);
        s8.selectByValue("2022");
        driver.findElement(By.id("cc_cvv")).sendKeys("456");
        Thread.sleep(1000);
        driver.findElement(By.id("book_now")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[19]/td[2]/input[2]")).click();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des =new File("/Users/ilankumaran/Ranjani/screenshot/screenshot.png");
        FileHandler.copy(src,des);
        driver.close();

















    }
}

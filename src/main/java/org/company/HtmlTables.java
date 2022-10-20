package org.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTables {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();
        String companyName = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[1]")).getText();
        System.out.println(companyName);
        int sizeOf = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td[1]")).size();
        System.out.println(sizeOf);
        String a = "//*[@id='customers']/tbody/tr[" ;
        String b =  "]/td[1]";
        for(int i = 2;i<=7;i++){
            String concat = driver.findElement(By.xpath(a+i+b)).getText();
            System.out.println("Concat details: "+concat);
        }
        System.out.println(".............................................");
        String contact = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[2]")).getText();
        System.out.println(contact);
        int size1 = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td[2]")).size();
        System.out.println(size1);
        String c = "//*[@id='customers']/tbody/tr[";
        String d = "]/td[2]";
        for (int i =2;i<=7;i++){
            String contactNumber = driver.findElement(By.xpath(c+i+d)).getText();
            System.out.println("contact details :"+contactNumber);

        }
        System.out.println(".........................................");
        String country = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[3]")).getText();
        System.out.println(country);
        int size2 =driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td[3]")).size();
        System.out.println(size2);
        String E = "//*[@id='customers']/tbody/tr[";
        String f = "]/td[3]";
        for (int i = 2;i<=7;i++){
            String countryName = driver.findElement(By.xpath(E+i+f)).getText();
            System.out.println("country details :" +countryName);
        }
    }
}

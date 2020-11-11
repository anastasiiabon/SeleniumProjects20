package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //1- Setup the driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the driver
        WebDriver driver=new ChromeDriver();

        //3- Use the driver instance to test selenium
        driver.get("https://www.google.com");
        System.out.println("The title of the page is: "+driver.getTitle());

        String ActualTitle=driver.getTitle();
        System.out.println("ACTUAL TITLE STRING "+ActualTitle);

        String ActualUrl=driver.getCurrentUrl();
        System.out.println("ActualUrl - "+ActualUrl);
        Thread.sleep(2000);
        driver.navigate().back();
    }
}

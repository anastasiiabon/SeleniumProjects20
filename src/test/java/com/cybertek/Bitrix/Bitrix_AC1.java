package com.cybertek.Bitrix;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Bitrix_AC1 {
    WebDriver driver;

    @BeforeMethod
    public void  setUpBrowser(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }

    @Test
    public void test_Us1_AC6(){

        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("helpdesk22@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser" + Keys.ENTER);

        BrowserUtils.wait(2);


        WebElement addComment = driver.findElement(By.linkText("Add message"));
        addComment.click();




        //It is the verification Test
        WebElement messageDiplayed = driver.findElement(By.xpath("//div[@class='feed-com-text-inner-inner']"));
        Assert.assertTrue(messageDiplayed.isDisplayed(), "Message is NOT displayed, verification FAILED!!!");

    }
}
package com.example.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class GeneralObjects {
    static WebDriver driver = null;
  
    public GeneralObjects(WebDriver driver) {
        GeneralObjects.driver = driver;
    }

    public static void waiting(int SECONDS) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(SECONDS));
    }

    public void back() {
        driver.navigate().back();
    }      

    public void logout() throws InterruptedException{
        WebElement elem = driver.findElement(By.xpath("//span[contains(@class,'mt-0.5')]"));
         
        Actions action = new Actions(driver);
        action.moveToElement(elem).perform();
        JavascriptExecutor je = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//button[contains(@data-automation,'logout-button')]//div[contains(@class,'')]//div[contains(@class,'')][normalize-space()='Logout']"));
		je.executeScript("arguments[0].scrollIntoView(true)", element);
		driver.findElement(By.xpath("//button[contains(@data-automation,'logout-button')]//div[contains(@class,'')]//div[contains(@class,'')][normalize-space()='Logout']")).click();
    }

    //tagname[@contains='value']
    
}

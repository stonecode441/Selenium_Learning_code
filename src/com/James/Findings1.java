package com.James;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findings1 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        //to max browser
        driver.manage().window().maximize();
        driver.get("https://slot.ng/");

        //find by Id locator
       // driver.findElement(By.id("search-input-autocomplate")).sendKeys("samsung");
        //OR
//      WebElement search = driver.findElement(By.id("jj"));
//      search.sendKeys("T-shirt");

        //find By name
        //driver.findElement(By.name("q")).sendKeys("samsung");

        //By link text/partial link text
        driver.findElement(By.linkText("TECNO POP 2F (B1C) 16GB+1GB")).click();
        //driver.findElement(By.partialLinkText("the text")).click();
    }
}

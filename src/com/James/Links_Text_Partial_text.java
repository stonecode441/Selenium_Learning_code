package com.James;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Text_Partial_text {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://slot.ng/phones-and-tables/phones/smartphone/samsung.html");

        //By link text
       // driver.findElement(By.linkText("Samsung TAB S7 PLUS 11.0 (T975) 6+128GB")).click();
        driver.findElement(By.partialLinkText("https://slot.ng/phones-and-tables/phones/smartphone/samsung.html")).click();
    }

}

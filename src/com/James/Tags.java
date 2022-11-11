package com.James;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tags {
    public static void main(String[] args){
        WebDriver diver = new ChromeDriver();
        diver.manage().window().maximize();
        diver.get("https://www.google.com/");

        //find by TagName
     List<WebElement> link = diver.findElements(By.tagName("a"));
        System.out.println(link.size());//22

        //name of links
        for (WebElement l: link)
        {
            System.out.println(l.getText());
        }



    }
}

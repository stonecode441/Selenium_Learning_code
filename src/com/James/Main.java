package com.James;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //open chrome
        //go to url
        //close the browser
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");
       driver.close();


        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.google.com");
        driver1.close();
    }
}

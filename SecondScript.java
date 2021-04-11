package com.driver_methods_dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prabh\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.navigate().back();
	driver.navigate().to("https://youtu.be/fRD_3vJagxk");
	driver.navigate().back();
	driver.navigate().to("https://youtu.be/m58kSvwzzpk");
}
}

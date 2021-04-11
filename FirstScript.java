package com.driver_methods_dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
//browser launch
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\prabh\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.iplt20.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	String Url=driver.getCurrentUrl();
	System.out.println(Url);
	Thread.sleep(2000);
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	driver.quit();
}
}

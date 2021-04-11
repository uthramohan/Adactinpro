package com.driver_methods_dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixthScript {
	public static void main(String[] args) throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.greenstechnologys.com/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
    
    driver.navigate().to("https://www.naukri.com/manual-testing-jobs-in-chennai");
    Thread.sleep(2000);
    driver.navigate().back();
    String url = driver.getCurrentUrl();
    System.out.println(url);
    String title = driver.getTitle();
    System.out.println(title);
    //driver.close();
    
	}

}

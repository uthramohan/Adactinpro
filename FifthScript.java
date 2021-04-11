package com.driver_methods_dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FifthScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\prabh\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
		WebDriver dr = new InternetExplorerDriver();
		dr.get("http://in.youtube.com/");
		dr.navigate().to("https://youtu.be/fRD_3vJagxk");
		
	}

}

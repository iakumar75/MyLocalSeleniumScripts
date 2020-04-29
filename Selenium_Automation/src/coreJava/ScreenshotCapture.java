package coreJava;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotCapture {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type url
		driver.get("https://fb.com");
		// to maximise window
		driver.manage().window().maximize();
		// type the username and password
		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		String a = ".\\Screenshots\\";
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File(a+"GB"+".PNG"));
		
	}

}

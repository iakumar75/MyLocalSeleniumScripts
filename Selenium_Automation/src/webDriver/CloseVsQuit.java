package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//type url
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		//to maximise window
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		//Two window will be display
		//close all the windows
		//driver.close();// Only current window ( Where your cursor is pointing)  will be close
		driver.quit();//Close all the windows related to web page( PArent & Child windows)
		 
	}

}

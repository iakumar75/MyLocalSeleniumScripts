package testNG;

import org.testng.annotations.Test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class FBLogin {
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.id("loginbutton")).click();
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		// to take screenshots
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println("My tmestamp is: " + timeStamp);

		File from = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(from, new File(".\\Screenshots\\" + "FB_TestNG_" + timeStamp + ".PNG"));
		

	}

	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName) {
		//	Pre-condition
		if (browserName.equalsIgnoreCase("Chrome")) {
			//Chrome
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("Firefox")) {
			//Firefox Browser
			System.setProperty("webdriver.gecko.driver", ".\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();			
		}else if (browserName.equalsIgnoreCase("ie")) {
			// IE Browser
			System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();		
		}else {
			System.out.println("Please enter valid browser name:");
		}
	}

	@AfterClass
	public void afterClass() {
		// to quit the browser
		driver.quit();

	}

}

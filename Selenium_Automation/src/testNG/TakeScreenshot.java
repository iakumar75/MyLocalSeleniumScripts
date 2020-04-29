package testNG;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;






































import org.testng.annotations.Test;

public class TakeScreenshot {

	// constructure
	public TakeScreenshot() {
		String projectDir = System.getProperty("user.dir");

		File f = new File(projectDir + "\\Screenshots");

		if (f.exists()) {
			System.out.println("Sceenshot folder already available");

		} else {
			System.out.println("Screenshot folder not available, we are creating");
			f.mkdir();
		}

	}

	@Test
	public void f() throws IOException {
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

		String path = ".\\Screenshots\\";
		Date d = new Date();
		System.out.println(d);
		// ddMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File(path + "FB_" + timeStamp + ".PNG"));
	}
}

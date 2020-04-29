package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//type url
		driver.get("https://fb.com");
		//to maximise window
		driver.manage().window().maximize();
		//type the username and password
		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.id("loginbutton")).click();
		//click on forgotten password link
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("gott")).click();
		
	}

}

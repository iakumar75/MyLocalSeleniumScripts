package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mis_nyiso {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://mis.nyiso.com/public/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.switchTo().frame("header");
	driver.findElement(By.xpath("//*[@name='P-24Alist']")).click();
	
		
	
	
	}

}

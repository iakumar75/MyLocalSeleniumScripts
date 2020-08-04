package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleVacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		
		
		//*[@id='orgAC_value']
	}

}

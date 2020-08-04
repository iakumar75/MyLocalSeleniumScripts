package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {
	public static void main(String[] args) throws Exception {
		WebDriver driver;

		// launch chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type url
		driver.get("https://www.naukri.com/");
		// to maximise window
		driver.manage().window().maximize();
		
		//Get the current window name ( Parent Screen)
		String mainWindowname = driver.getWindowHandle();
		//Get the all openwindows related to Parent Screen
		Set<String> childWindowNames = driver.getWindowHandles();
		
		for (String childWindow : childWindowNames) {
			if (!mainWindowname.equals(childWindow)) {
				//Move to child window
				driver.switchTo().window(childWindow);
				driver.close();
			}
		}
		//Move to Parent screen
		driver.switchTo().window(mainWindowname);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(@title,'for free')])[1]")).click();
		
		
	}
}

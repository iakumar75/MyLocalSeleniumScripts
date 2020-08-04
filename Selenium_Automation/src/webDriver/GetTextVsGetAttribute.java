package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		Actions act = new Actions(driver);
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();

		// get text  
		System.out.println(driver.findElement(By.linkText("Gmail")).getText());

		// Get goolge search button text
//		System.out.println(driver.findElement(By.name("btnK")).getText());

		String lable = driver.findElement(By.name("btnK")).getAttribute("aria-label");
		System.out.println(lable);
	}

}

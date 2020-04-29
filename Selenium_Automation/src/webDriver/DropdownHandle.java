package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@class,'dropdown-toggle login signup-rewrite')]")).click();driver.findElement(By.xpath("//button[@class='btn btn-social email']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Check the Tagname is Select or not?
		// if Select that is dropdown else it's not.

		// Take the locater and use select command to click

		// choose optional value from the list
		
		Select abc =  new Select(driver.findElement(By.id("country")));
		abc.selectByVisibleText("UNITED STATES");
		
//		new Select(driver.findElement(By.id("country"))).selectByVisibleText("UNITED STATES");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Parent");
		
		//driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']")).click();
		
	}
}

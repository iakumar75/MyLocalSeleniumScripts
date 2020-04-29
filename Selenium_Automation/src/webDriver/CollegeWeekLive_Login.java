package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeekLive_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		// launch web browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// type url
		driver.get("https://www.collegeweeklive.com");
		// maximis browser window
		driver.manage().window().maximize();
		// click on sign up
		// driver.findElement(By.className("dropdown-toggle login
		// signup-rewrite")).click();
		driver.findElement(By.xpath("//*[contains(@class,'dropdown-toggle login signup-rewrite')]")).click();
		// click register with email
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// //*[contains(@class,'btn btn-social email')]
		driver.findElement(By.xpath("//button[@class='btn btn-social email']")).click();
//		Thread.sleep(10000);
		//implicitwait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// fill in the sign up form		
		driver.findElement(By.id("firstName")).sendKeys("ignatius");
		driver.findElement(By.id("lastName")).sendKeys("guntupalli");
		driver.findElement(By.id("emailAddress")).sendKeys("gi_anand@yahoo.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("98495 98495");
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("ALGERIA");
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Parent");
		driver.findElement(By.id("submit")).click();

	}

}

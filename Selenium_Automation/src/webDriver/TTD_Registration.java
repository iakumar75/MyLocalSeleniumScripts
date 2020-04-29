package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTD_Registration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("fName")).sendKeys("anand");
		driver.findElement(By.name("lName")).sendKeys("kumar");
		new Select(driver.findElement(By.name("proofS"))).selectByVisibleText("Aadhaar Card");
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("Afghanistan");
		driver.findElement(By.xpath("//*[@class='iti-arrow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='United Kingdom'])[1]")).click();
		driver.findElement(By.xpath("(//*[@name='gender'])[2]")).click();
		//calender code
		driver.findElement(By.id("regdob")).click();
		new Select(driver.findElement(By.xpath("//*[@title='Change the month']"))).selectByVisibleText("May");
		new Select(driver.findElement(By.xpath("//*[@title='Change the year']"))).selectByVisibleText("1995");
		driver.findElement(By.linkText("25")).click();
		
		
		
		
		
		//*[@class='iti-arrow']
		//(//*[text()='United Kingdom'])[1]
		
	}

}

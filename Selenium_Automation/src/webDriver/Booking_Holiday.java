package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Booking_Holiday {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='ss']")).click();
		driver.findElement(By.xpath("//*[@id='ss']")).sendKeys("Germany");
		// act.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@role='listbox']/li/span[2]/span)[1]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@data-gdpr-consent='yes']")).click();
//		Thread.sleep(3000);
// 		driver.findElement(By.xpath("//*[text()='Check-in']")).click();
		driver.findElement(By.xpath("//*[@data-bui-ref='calendar-next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//table[@class='bui-calendar__dates'])[2]/tbody/tr[2]/td[2]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//table[@class='bui-calendar__dates'])[2]/tbody/tr[2]/td[3]/span")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='xp__guests__count']")).click();
		Thread.sleep(3000);
		// Get the guest count and validate it
		String guestCount = driver.findElement(By.xpath("(//*[@class='bui-stepper__display'])[1]")).getText();
		System.out.println("guestCount is: " + guestCount);
		if (guestCount.equals("2")) {
			WebElement plusIcon = driver.findElement(By.xpath("(//*[@data-bui-ref=\"input-stepper-add-button\"])[1]"));
			act.doubleClick(plusIcon).build().perform();
			Thread.sleep(5000);
			String guestCountNew = driver.findElement(By.xpath("(//*[@class='bui-stepper__display'])[1]")).getText();
			System.out.println("guestCountNew is: " + guestCountNew);
			if (guestCountNew.equals("4")) {
				System.out.println("Guest Count functionality is fine");
			}
		}

		driver.findElement(By.xpath("//*[@class='sb-searchbox__button ']")).click();

	}

}

package webDriver;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		WebElement ele = driver
				.findElement(By.xpath("(//table[@class='bui-calendar__dates'])[2]/tbody/tr[1]/td[3]/span"));
		// Scroll to element
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.click();

		Thread.sleep(3000);
		WebElement ele1 = driver
				.findElement(By.xpath("(//table[@class='bui-calendar__dates'])[2]/tbody/tr[1]/td[4]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele1);
		ele1.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@class='xp__guests__count']")).click();
		Thread.sleep(3000);
		// Get the guest count and validate it
		String guestCount = driver.findElement(By.xpath("(//*[@class='bui-stepper__display'])[1]")).getText();
		System.out.println("guestCount is: " + guestCount);
		if (guestCount.equals("2")) {
			WebElement plusIcon = driver.findElement(By.xpath("(//*[@data-bui-ref=\"input-stepper-add-button\"])[1]"));
			act.doubleClick(plusIcon).build().perform();
			act.doubleClick(plusIcon).build().perform();
			Thread.sleep(5000);
			String guestCountNew = driver.findElement(By.xpath("(//*[@class='bui-stepper__display'])[1]")).getText();
			System.out.println("guestCountNew is: " + guestCountNew);
			;

			if (guestCountNew.equals("6")) {
				System.out.println("Guest Count functionality is fine");
			}
		}
		String roomcount = driver.findElement(By.xpath("(//*[@class='bui-stepper__display'])[3]")).getText();
		System.out.println("room count is: " + roomcount);
		if (roomcount.equals("1")) {
			driver.findElement(By.xpath("(//*[@class='bui-button__text'])[6]")).click();
			String roomCountNew = driver.findElement(By.xpath("(//*[@class='bui-stepper__display'])[3]")).getText();
			System.out.println("roomCountNew is: " + roomCountNew);
			if (roomCountNew.equals("2")) {
				System.out.println("Room Count functionality is fine");

			}

		}

		driver.findElement(By.xpath("//*[@class='sb-searchbox__button ']")).click();
		Thread.sleep(6000);
		// select yur room button web element click
		WebElement ele2 = driver.findElement(By.xpath("(//*[@class='bui-button__text'])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele2);
		ele2.click();
		//System is going to display two tab(s)/Window(s)
		//User wnat to do operation on Child window / child tab
		
		
		// Click on some element then new tab will open
		Thread.sleep(3000);
		//Capturing howmany tabs were displayed?
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Tabs count is : " + tabs2.size());
		// Switch to child tab from parent tab
		driver.switchTo().window(tabs2.get(1));
		//Title of the Child tab to confirm 
		System.out.println("Child:" + driver.getTitle());

		// Go back to parent tab and get the title
		driver.switchTo().window(tabs2.get(0));
		System.out.println("PArent: " + driver.getTitle());

	}

}

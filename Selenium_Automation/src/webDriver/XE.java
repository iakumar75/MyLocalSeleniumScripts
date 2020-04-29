package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XE {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.xe.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class= 'privacy-basic-button privacy-basic-button-submit']")).click();
		
		Thread.sleep(3000);

		String label = driver.findElement(By.xpath("//*[@id='transferconverter-fromAmount']")).getAttribute("value");
		System.out.println("Entered Value= " + label);
		
		String label2 = driver.findElement(By.xpath("//*[@id='transferconverter-toAmount']")).getAttribute("value");
		System.out.println("Converted Value = " + label2);
		
	}

}

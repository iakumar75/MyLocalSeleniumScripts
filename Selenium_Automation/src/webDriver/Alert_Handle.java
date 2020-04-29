package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[text()='CONTINUE TO LOGIN']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(10000);
		//normal alert script
		System.out.println(driver.switchTo().alert().getText());
		//to click on ok button , use accept()
		driver.switchTo().alert().accept();
		//confirmation alert script
		Thread.sleep(12000);
		driver.findElement(By.partialLinkText("New User ? Register here/Activate")).click();
		//to click on cancel button , use dismiss()
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
	}

}

package coreJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.co.uk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='agree']")).click();
	
		java.util.List<WebElement> yahooLinks = driver.findElements(By.tagName("a"));
		System.out.println("HyperLinks on yahoo page are " + yahooLinks.size() );
		
		for(WebElement abc: yahooLinks) {
			System.out.println(abc.getText());
			
//			String [] names = {"amal", "anand", "siri", "joe"};
//			
//			for(String name : names ) {
//				System.out.println(name);
//			}
		}
		
		
		
				
			
	}

}

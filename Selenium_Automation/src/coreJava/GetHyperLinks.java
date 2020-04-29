package coreJava;

import java.awt.List;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//get all hyperlinks
		java.util.List<WebElement> allHyperLinks = driver.findElements(By.tagName("a"));
		System.out.println("HyperLinks on google page are " + allHyperLinks.size() );
		
		//print all hyperlinks
		
//		for (int i = 0; i < allHyperLinks.size(); i++) {
//			System.out.println(allHyperLinks.get(i).getText());
//		}
		//advance for loop
		for(WebElement abc: allHyperLinks) {
			System.out.println(abc.getText());
		}
			
	}

}

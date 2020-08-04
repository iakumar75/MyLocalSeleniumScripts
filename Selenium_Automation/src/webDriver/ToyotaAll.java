package webDriver;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToyotaAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Yes, I agree")).click();
		//Hyper links count
		List<WebElement> webLinks = driver.findElements(By.tagName("a"));
		System.out.println("HyperLinks on toyota page are " + webLinks.size());
		System.out.println("**************************************");
		for (WebElement abc : webLinks) {
			System.out.println(abc.getText());
		}
		System.out.println("**************************************");
		
		
		//Edit box count
		List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type ='text' or @type='email']"));
		System.out.println("Text Boxes on toyota page are " + textboxes.size() );
		System.out.println("**************************************");
		for(WebElement txt :textboxes) {
			System.out.println(txt.getAttribute("name"));
		}
		System.out.println("**************************************");
		
		//check boxes 		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type ='checkbox']"));
		System.out.println("Check Boxes on toyota page are " + checkboxes.size() );
		System.out.println("**************************************");
		for(WebElement cbx :checkboxes) {
			System.out.println(cbx.getAttribute("name"));
		}
		System.out.println("**************************************");
		
		//Button count
		List<WebElement> buttons = driver.findElements(By.xpath("//button[@type ='button']"));
		System.out.println("Buttons on toyota page are " + buttons.size() );
		System.out.println("**************************************");
		for(WebElement btn :buttons) {
			System.out.println(btn.getAttribute("type"));
		}
		System.out.println("**************************************");
		//Radio button count
		List<WebElement> radio = driver.findElements(By.xpath("//*[@class='tab-radio ']"));
		System.out.println("Radio Buttons on toyota page are " + radio.size() );
		System.out.println("**************************************");
		for(WebElement rdo :radio) {
			System.out.println(rdo.getAttribute("aria-controls"));
		}
		System.out.println("**************************************");
		//drop down menu
		List<WebElement> dropDown = driver.findElements(By.xpath("//div[@class='dropdown narrow-icon-field ']"));
		System.out.println("Drop down on toyota page are " + dropDown.size() );
		System.out.println("**************************************");
		for(WebElement dpd :dropDown) {
			System.out.println(dpd.getAttribute("data-select"));
			System.out.println("**************************************");
		
	}

	}
}

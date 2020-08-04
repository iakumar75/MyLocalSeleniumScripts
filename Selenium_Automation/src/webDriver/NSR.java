package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NSR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Selenium/Documents/notes/NSR_Selenium%20Automation.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Hyper Links
		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		System.out.println("No: of Hyper Links = " + hyperLinks.size());
		System.out.println("**************************************");
		for(WebElement hpl : hyperLinks) {
			System.out.println(hpl.getText());
		}
		System.out.println("************************************");
		
		//Text Boxes
		List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("No: of Text Boxes = " + textBoxes.size());
		System.out.println("************************************");
		for(WebElement tbx : textBoxes) {
			System.out.println(tbx.getAttribute("name"));
			System.out.println(tbx.getAttribute("id"));
		}
		System.out.println("************************************");
		
		//Radio Buttons
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No: of Radio Buttons = " + radioButtons.size());
		System.out.println("************************************");
		for(WebElement rdb : radioButtons) {
			System.out.println(rdb.getAttribute("value"));
		}
		System.out.println("************************************");
		
		//Check Boxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No: of Check Boxes = " + checkBoxes.size());
		System.out.println("************************************");
		for(WebElement ckb : checkBoxes) {
			System.out.println(ckb.getAttribute("value"));
		}
		System.out.println("************************************");
		
		//Drop Down Menu
		List<WebElement> dropDown = driver.findElements(By.xpath("//select"));
		System.out.println("No: of Drop Down Menus = " + dropDown.size());
		System.out.println("************************************");
		for (WebElement dpd : dropDown) {
			System.out.println(dpd.getText());
		}
		System.out.println("************************************");
		
		//Button
		List<WebElement> button = driver.findElements(By.xpath("//div[@class='button']"));
		System.out.println("No: of Buttons = " + button.size());
		System.out.println("************************************");
		for (WebElement btn : button) {
			System.out.println(btn.getText());
		}
		System.out.println("************************************");
		
			
		
		
		
	}

}

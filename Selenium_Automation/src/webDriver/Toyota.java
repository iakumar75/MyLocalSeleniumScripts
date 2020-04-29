package webDriver;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Toyota {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		Thread.sleep(5000);
		
		Random r = new Random();
		int number = r.nextInt(20);
		System.out.println(number);
		if (number == 0) {
			number = 1;
			System.out.println("Manually assigned 1 as new random number");
			System.out.println(number);
		}
		
		
		driver.findElement(By.xpath("//*[@id='car_models']/div/ul/li["+number+"]")).click();
		
		String carName = driver.findElement(By.xpath("//*[@id='car_models']/div/ul/li["+number+"]/label")).getText();
		System.out.println(carName);
		
		driver.findElement(By.xpath("//*[@class='dropdown-toggle  '][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Miss']")).click();
		driver.findElement(By.name("firstname")).sendKeys("testFirstName");
		driver.findElement(By.name("surname")).sendKeys("testSurname");
		driver.findElement(By.name("email")).sendKeys("testemail@gmail.com");
		driver.findElement(By.xpath("//*[@id='submit-br']")).click();
		
		
		//driver.findElement(By.xpath("//*[@class='iti-arrow']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//*[text()='United Kingdom'])[1]")).click();
	}

}

package webDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeIt_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//type url
		driver.get("https://www.justrechargeit.com/");
		//to maximise browser window
		driver.manage().window().maximize();
		//click on sign in link
		driver.findElement(By.id("jriTop_signin9")).click();
		
		//enter username and password
		driver.findElement(By.id("txtUserName")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("test123");
		//click login
		//driver.findElement(By.id("imgbtnSignin")).click();
		driver.findElement(By.name("imgbtnSignin")).click();
		
		

	}

}

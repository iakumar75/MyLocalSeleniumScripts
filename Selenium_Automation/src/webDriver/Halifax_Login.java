package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Halifax_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//enter the url
		driver.get("https://www.halifax.co.uk");
		//maximise the browser window
		driver.manage().window().maximize();
		//accept the cookies
		//driver.findElement(By.id("accept")).click();
		//click on sign on
		//driver.findElement(By.className("icomoon icon-padlock")).click();
		//                            (//*[text()='Sign in'])[1]
		driver.findElement(By.xpath("(//span [@class='icomoon icon-padlock'])[1]")).click();
		//enter username and password
		driver.findElement(By.name("frmLogin:strCustomerLogin_userID")).sendKeys("hello");
		driver.findElement(By.name("frmLogin:strCustomerLogin_pwd")).sendKeys("test123");
		//click on continue button
		driver.findElement(By.id("frmLogin:btnLogin2")).click();
		

	}

}

package testing;

import org.testng.annotations.Test;

//import com.objectrepository.Locators;
//import com.utilities.CommonFunctions;
//import com.utilities.Staticvariables;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.JXLException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AnyAut {

	@Test
	public void f() throws IOException, JXLException, Exception {
	WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://anyaut.com/orange/sign-up.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='heading-sign-up2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("company")).sendKeys("testcompany");
		driver.findElement(By.id("designation")).sendKeys("developer");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		Select sel = new Select(driver.findElement(By.id("country")));
		sel.selectByValue("AF");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);


	}

	

}

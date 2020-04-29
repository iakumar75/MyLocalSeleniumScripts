package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/Register.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		new Select(driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListTitle']"))).selectByVisibleText("MRS");
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName']")).sendKeys("nayana");
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName']")).sendKeys("govind");
		driver.findElement(By.xpath("//*[@class='iti-arrow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='iti-item-gb']")).click();
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINTLMOBILENUMBER']")).sendKeys("7872012757");
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldAgentPassword']")).sendKeys("Spicejet1$");
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_MemberInputRegisterView_PasswordFieldPasswordConfirm']")).sendKeys("Spicejet1$");
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TEXTBOXINPUTDOB']")).click();
		Thread.sleep(1000);
		//click on Year -1996
		driver.findElement(By.xpath("//table[@class='datepickerViewYears']/tbody[3]/tr/td[1]/a")).click();
		//Click on month - jul
		driver.findElement(By.xpath("//table[@class='datepickerViewMonths']/tbody/tr[2]/td[3]/a")).click();
		//Click on date -22
		driver.findElement(By.xpath("//table[@class='datepickerViewDays']/tbody/tr[4]/td[1]/a")).click();
		
		
		
		//new Select(driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBYear']"))).selectByVisibleText("1996");
		//Thread.sleep(1000);
		//new Select(driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBMonth']"))).selectByVisibleText("Jun");
		//Thread.sleep(1000);
		//new Select(driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_DropDownListDOBDay']"))).selectByVisibleText("28");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxEmail']")).sendKeys("spice@gmail.com");
		driver.findElement(By.xpath("//*[@id='CONTROLGROUPREGISTERVIEW_ButtonSubmit']")).click();
		driver.findElement(By.id("popup_ok")).click();
		
		
		
		
		
		

	}

}

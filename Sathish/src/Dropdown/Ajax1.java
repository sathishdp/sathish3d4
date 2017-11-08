package Dropdown;



	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	
	public class Ajax1 {
		
		
		

		public static void main(String args [])
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
		
			WebElement b=driver.findElement(By.id("selBank"));
			Select bank=new Select(b);
			bank.selectByIndex(4);
			//Thread.sleep(3000);
			
			Select state=new Select(driver.findElement(By.id("selState")));
			state.selectByVisibleText("Andhra Pradesh");
			//Thread.sleep(3000);
			
			Select city=new Select(driver.findElement(By.id("selCity")));
			city.selectByVisibleText("Hyderabad");
			//Thread.sleep(3000);
			
			Select branch=new Select(driver.findElement(By.id("selBranch")));
			branch.selectByVisibleText("Gachibowli");
			driver.quit();
		
	}}




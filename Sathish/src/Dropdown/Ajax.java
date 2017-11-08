package Dropdown;


	import java.util.List;
	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Ajax {
		
		
		public  void okkkk() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
		
		
		
		
		
			
			selectOption(driver.findElement(By.id("selBank")),"Andhra Bank");
			//wt(By.id("selState"));
			selectOption(driver.findElement(By.id("selState")),"Andhra Pradesh");
			//wt(By.id("selCity"));
			selectOption(driver.findElement(By.id("selCity")),"Hyderabad");
			//wt(By.id("selBranch"));
			selectOption(driver.findElement(By.id("selBranch")),"Gachibowli");	
		}
		

		public void selectOption(WebElement e,String optionname) throws InterruptedException
		{
			Select dd=new Select(e);
			dd.selectByVisibleText(optionname);
			Thread.sleep(2000);
			
		
		}
		
		/*public void wt(By loc)
		{
			WebDriverWait  wait=new WebDriverWait(driver,60);
			//wait.until(ExpectedConditions.elementToBeSelected(loc));
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeSelected(loc)));
		}*/
		
		
		
			//driver.quit();
	public static void main(String args[]) throws InterruptedException{
		Ajax obj = new Ajax();
		obj.okkkk();
		
	}
	

}

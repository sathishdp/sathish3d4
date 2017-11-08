package Dropdown;


	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

	public class Bootstrap {
		public static void main (String args[]){
	
			  System.setProperty("webdriver.gecko.driver", "C:\\chromedriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.get("http://www.bbc.com/");
		  
	
			 driver.findElement(By.xpath(".//*[@id='orb-nav-more']/a")).click();
			 WebElement item=driver.findElement(By.xpath(".//*[@id='orb-panel-more']/div"));
			 List<WebElement> items=item.findElements(By.tagName("a"));
			 
			 for(int i=0;i<items.size();i++)
			 {
				 String actual_value=items.get(i).getAttribute("innerHTML");
				 if(actual_value.contentEquals("Food"))
				 {
					 items.get(i).click();
					 break;
				 }
			 }
				 
		  
		  
		  
		  
		
		
			  driver.quit();
		  
	}


}

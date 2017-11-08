package ramakrishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class places {

public static class Ajax {
		
		
		public  void okkkk() throws InterruptedException 
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.veethi.com");
		//driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Places")).click();
		selectOption(driver.findElement(By.id("selState")),"Himachal Pradesh");
		selectOption(driver.findElement(By.id("district_id")),"Chamba");
		selectOption(driver.findElement(By.id("list_city")),"Agahar");	
	}

	private static void selectOption(WebElement s, String option) throws InterruptedException {
		{
			Select dd=new Select(s);
			dd.selectByVisibleText(option);
			Thread.sleep(2000);
			
		
		}
		
	}
	}

}

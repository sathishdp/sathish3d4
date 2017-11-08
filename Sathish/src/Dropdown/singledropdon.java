package Dropdown;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class singledropdon {

	
		public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");			
		
		
			
		//Identifying the Month Dropdown in Facebook Page & Storing in Select Builtin Class
			WebElement month_dropdown=driver.findElement(By.xpath("//select[@id='month']"));
			Select month_dd=new Select(month_dropdown);
			
			
		//It selects using by Index   &    To print Selected option
			month_dd.selectByIndex(3);
		
			
			WebElement sel1=month_dd.getFirstSelectedOption();
			System.out.println("Sathish :" + sel1.getText());
			Thread.sleep(3000);
			
	/*------------------------------------------------------------------------------------------------------------------------*/
			
		//It selects using by value    &    To print Selected option
			month_dd.selectByValue("4");
			
			WebElement sel2=month_dd.getFirstSelectedOption();
			System.out.println("Selected option name using  By Value is :" + sel2.getText());
			Thread.sleep(3000);
			
			
	/*------------------------------------------------------------------------------------------------------------------------*/	
			
			
		//It selects using by VisibleText    &    To print Selected option
			month_dd.selectByVisibleText("May");
			
			WebElement sel3=month_dd.getFirstSelectedOption();
			System.out.println("Selected option name using By Visibletext is :" + sel3.getText());
			Thread.sleep(3000);
			
					
		
			driver.quit();
		}
		
		
	}

	



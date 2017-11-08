package Dropdown;


	

	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;

	import org.openqa.selenium.support.ui.Select;
	

	public class Multipledropdown {

	
		public static void main(String args[]) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://eenadupellipandiri.net/register");			
		
		
			WebElement speak_languages=driver.findElement(By.id("can_speak_lang"));
			Select select_multi=new Select(speak_languages);
			
			//Loop to select first 3 items in MultiDropdown List
			for(int i=0;i<3;i++)
			{
				select_multi.selectByIndex(i);
			}
			
			
			//Loop to display for selected in MultiDropdown list
			List<WebElement> display=select_multi.getAllSelectedOptions();
			for(WebElement s:display)
			{
				System.out.println(s.getText());			
			}	
			
			
			
		}
		
		
		
		
	}




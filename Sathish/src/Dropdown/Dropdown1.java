package Dropdown;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class Dropdown1 {

		
		public static void main(String[]args){
			
		
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://amazon.in");
		
		
		
		
		
		
			WebElement drop=driver.findElement(By.id("searchDropdownBox"));
			List<WebElement> dropdown=drop.findElements(By.tagName("option"));
			
			
			System.out.println(dropdown.size());
			for(int i=0;i<dropdown.size();i++)
			{
				System.out.println(dropdown.get(i).getText());
		    }
		
			
			
		
		
			WebElement drop1=driver.findElement(By.id("searchDropdownBox"));
			Select sel=new Select(drop);		
			List<WebElement> items=sel.getOptions();
			
			
			System.out.println(items.size());
			for(int i=0;i<items.size();i++)
			{			
				System.out.println(items.get(i).getText());
			}
		
		
	
	
			driver.quit();
		
		 
		
	}}




package Dropdown;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class Dropdown2 {

	WebDriver driver;
		
		
		public void setup()
		{
			
			System.setProperty("webdrivergecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com");
		}
		
		
		
		
		public void itemSelection()
		{
			
			driver.findElement(By.linkText("REGISTER")).click();
			WebElement drop=driver.findElement(By.name("country"));
			
		    List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		    for(int i=0;i<dropdown.size();i++)
		    {
			   dropdown.get(i).click();
			   if(dropdown.get(i).isSelected())
			   {
				   System.out.println(dropdown.get(i).getText()+" --> is Active");
			   }
			   else
			   {
				   System.out.println(dropdown.get(i).getText()+" --> is Inactive");
			   }
		   }  
		}
		
		
		
		
		
		public void itemSelection1()
		{
			driver.findElement(By.linkText("REGISTER")).click();
			WebElement drop=driver.findElement(By.name("country"));
			
			Select sel=new Select(drop);
			List<WebElement> items=sel.getOptions();
			for(int j=0;j<items.size();j++)
			{
				items.get(j).click();
				if(items.get(j).isSelected())
				   {
					   System.out.println(items.get(j).getText()+" --> is Active");
				   }
				   else
				   {
					   System.out.println(items.get(j).getText()+" --> is Inactive");
				   }
			}
		}
		
		
		
		
		public void teardown()
		{
			driver.quit();
		}
		
		
	}




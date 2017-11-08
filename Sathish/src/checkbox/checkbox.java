package checkbox;



	

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;


	public class checkbox {
	  
	
		  public static void main(String args[]){
		  
				System.setProperty("webdriver.gecko.driver","C:\\Users\\sathish\\Desktop\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://echoecho.com/htmlforms09.htm");
		  
		  
		  
		
			List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
			for(int i=0;i<check.size();i++)
			{
				System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
				System.out.println(check.get(i).isSelected());
			
		}
	 


	 
		   driver.quit();
	  
	}

		  
}

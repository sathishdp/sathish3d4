package Dropdown;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;
	

	public class dropdown3 {

	WebDriver driver;
		
		
		public void setup() 
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com");
		}

		
		
		
		public void randomSelection()
		{
			driver.findElement(By.linkText("REGISTER")).click();
			WebElement drop=driver.findElement(By.name("country"));
			List<WebElement> listdrop=drop.findElements(By.tagName("option"));
			System.out.println("Total No.of Countries in a List : " + listdrop.size());
			
			int a=myRandomNo(listdrop.size());
			System.out.println("Random Number is : "+ a);
			listdrop.get(a).click();
			if(listdrop.get(a).isSelected())
			{
				System.out.println(listdrop.get(a).getText()+ "is Selected & Enabled");
			}
		}
		
		
		public static int myRandomNo(int x)
		{
			double b = Math.random()*x;
			System.out.println(b);
			int c=(int)b;
			return c;
		}
		
		
		
	
		public void teardown()
		{
			driver.quit();	
		}
		
		public static void main (String args[]){
			dropdown3 obj3 = new dropdown3();
			obj3.setup();
			obj3.randomSelection();
			obj3.teardown();
			
		}
	}




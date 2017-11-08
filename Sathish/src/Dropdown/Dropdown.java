package Dropdown;


		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
		import org.testng.Assert;
		
		
		public class Dropdown{
				
				WebDriver driver;
				
				
				
				public void setup()
				{
					
						System.setProperty("webdriver.gecko.driver","C:\\Users\\sathish\\Desktop\\geckodriver.exe");
						driver=new FirefoxDriver();
					
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.get("http://amazon.in");
				}
				
				
				public void Dropdown1()
				{
					driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
					
					driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
					driver.findElement(By.className("nav-input")).click();
					
					
					String actual_title=driver.getTitle();
					String exp_title="Amazon.in: Harry Potter: Books";
					
					Assert.assertEquals(actual_title, exp_title);
				}
				
				
				
				public void Dropdown2()
				{
					WebElement web=driver.findElement(By.id("searchDropdownBox"));
					Select sel=new Select(web);
					//sel.selectByVisibleText("Books");
					sel.selectByIndex(8);
					
					
					driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
					driver.findElement(By.className("nav-input")).click();
					
					String actual_title=driver.getTitle();
					String exp_title="Amazon.in: Harry Potter: Books";
					
					Assert.assertEquals(actual_title, exp_title);
				}
				public static void main (String args[]){
					Dropdown drop = new Dropdown();
					drop.setup();
					drop.Dropdown1();
					drop.Dropdown2();
					
				}
				
				
				
				
				
		


	}

	



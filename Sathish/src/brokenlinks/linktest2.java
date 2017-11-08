package brokenlinks;







		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		
import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class linktest2 {

			WebDriver driver;
			int count=0;
			
			
			public void setup()
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://www.hdfcbank.com");
			}
			
			
			
			public void linkTesting2()
			{
				driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
				List<WebElement> str=driver.findElements(By.tagName("a"));
				System.out.println("Total Links in A page including empty Links is ..."+str.size());
				for (int i=0;i<str.size();i++)
				{
					if(!str.get(i).getText().isEmpty())
					{
						count++;
						System.out.println(str.get(i).getAttribute("innerHTML"));
					}
				 str=driver.findElements(By.tagName("a"));
				}
				System.out.println("Total net Links present in page is ..."+count);
			}
			
		
		public static void main(String args[]){
			linktest2 obj = new linktest2();
			obj.setup();
			obj. linkTesting2();
			
			
		}
			
		}
			
		

	

	


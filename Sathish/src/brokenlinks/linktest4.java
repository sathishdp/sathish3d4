package brokenlinks;



	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;

	public class linktest4 {
	
		public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.gevko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://bbc.com");
			
			
			WebElement blocks=driver.findElement(By.xpath(".//*[@id='page']/section[6]/div/div/div[2]"));
			List<WebElement> links=blocks.findElements(By.tagName("a"));
			
			for(int i=0;i<links.size();i++)
			{
				System.out.println(links.get(i).getText());
				links.get(i).click();
				System.out.println(driver.getCurrentUrl());
				
				driver.navigate().back();
				Thread.sleep(5000);
				
				blocks=driver.findElement(By.xpath(".//*[@id='page']/section[6]/div/div/div[2]"));
				Thread.sleep(5000);
				links=blocks.findElements(By.tagName("a"));
			}
			driver.quit();
		}
	}



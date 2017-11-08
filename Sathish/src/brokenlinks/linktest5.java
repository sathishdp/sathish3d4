package brokenlinks;


	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;

	public class linktest5 {
		


		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com");
			
			List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println("Total Links Count is..."+links.size());
			int count=0;
			for(int i=0;i<links.size();i++){
				if(!links.get(i).getText().isEmpty())
				{
					count++;
					System.out.println(links.get(i).getText());
					links.get(i).click();
					System.out.println(driver.getCurrentUrl());
					driver.navigate().back();
					links=driver.findElements(By.tagName("a"));
				}
			}
			System.out.println("Visible Links Count..."+count);
			System.out.println("Hidden links Count ..."+(links.size()-count));
			driver.quit();
		}
	}




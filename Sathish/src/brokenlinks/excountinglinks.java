package brokenlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excountinglinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(6000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println("toatl links"+links.size());
		 
		/*for(WebElement linktext:links){
			String linkname=linktext.getText();
			System.out.println("link name is:::"+linkname);
			
		*/
		}

	}
	



package validation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Harifb {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a"));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (int i = 0; i <links.size(); i++) {
			System.out.println(links.get(i).getText());
		
	
		  
		}
		  
			
		}
		
	}

	



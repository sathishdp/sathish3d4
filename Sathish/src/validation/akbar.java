package validation;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class akbar {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			
			
			System.out.println(links.get(i).getText());
			
		}
		
		Thread.sleep(4000);
		driver.findElement(By.linkText("Trains")).click();
		Thread.sleep(3000);
		
		List<WebElement>links1=driver.findElements(By.tagName("a"));
		System.out.println(links1.size());
		for (int i = 0; i < links1.size(); i++) {
			System.out.println(links1.get(i).getText());
		}
		
		WebElement drop = driver.findElement(By.xpath(".//*[@id='train_adults']"));
		List<WebElement> contents=drop.findElements(By.tagName("option"));
		for (int i = 0; i < contents.size(); i++) {
			
			System.out.println(contents.get(i).getText());
			
		}
		
		Select obj=new Select(driver.findElement(By.xpath(".//*[@id='train_children']")));
		obj.selectByVisibleText("3");
		System.out.println("3");
		System.out.println("4");
		
		Select obj1 = new Select(driver.findElement(By.xpath(".//*[@id='train_male_seniors']")));
		obj1.selectByVisibleText("1");
		System.out.println("1");
		
		List<WebElement>drops = driver.findElements(By.tagName("select"));
				System.out.println(drops.size());
		for (int i = 0; i < drops.size(); i++) {
			
			System.out.println(drops.get(i).getText());
			
		}
	}
	

}

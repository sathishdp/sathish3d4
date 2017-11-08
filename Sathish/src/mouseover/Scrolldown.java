package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolldown {
	
	//ublic static void main(String[] args) throws InterruptedException {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/slider/");
	driver.switchTo().frame(0);
	
	Actions a=new Actions(driver);
	
	a.dragAndDropBy(driver.findElement(By.xpath("//div[@id='slider']/span")), 100, 0).perform();
	Thread.sleep(4000);			
	}

}

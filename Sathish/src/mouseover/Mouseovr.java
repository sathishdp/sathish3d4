package mouseover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseovr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//moveToElement(WebElement target)
	driver.get("https://aptransport.in/tgcfstonline");
	Actions a=new Actions(driver);
	a.moveToElement(driver.findElement(By.linkText("ALTERNATE ADDRESS ENTRY"))).perform();
	driver.findElement(By.linkText("License Alternate Address Entry")).click();
	Thread.sleep(3000);
	
}


	}



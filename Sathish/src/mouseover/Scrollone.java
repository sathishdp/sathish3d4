package mouseover;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scrollone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//Browser Scroll Method
				driver.get("http://www.seleniumhq.org/download/");	
				
				for(int i=0;i<10;i++)
				{
					((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)");
					Thread.sleep(2000);
				}


	}

}

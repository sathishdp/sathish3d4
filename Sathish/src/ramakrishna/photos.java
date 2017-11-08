package ramakrishna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class photos {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.veethi.com/user_register.html");
		//driver.manage().window().maximize();
	
		driver.findElement(By.linkText("Photos")).click();
		
		WebElement link = driver.findElement(By.tagName("a"));
		System.out.println("number of links"+link.getSize());
		

	}

}

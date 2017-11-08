package ramakrishna;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class veethi {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.veethi.com/user_register.html");
		//driver.manage().window().maximize();
	
		
		driver.findElement(By.id("user_name")).sendKeys("ramakrishna");
		driver.findElement(By.id("check_avail")).sendKeys("shenkeshiramakrishna@gmail.com");
		driver.findElement(By.id("user_avail")).sendKeys("ramakri");
		driver.findElement(By.id("user_password")).sendKeys("asdf@123");
		driver.findElement(By.id("user_state")).sendKeys("Telangana");
		
		
		driver.findElement(By.xpath(".//*[@id='user_terms']")).click();

        File sct = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sct, new File("C:\\Users\\sathish\\Desktop\\screnshot"new.png"));
       
}

		
	}

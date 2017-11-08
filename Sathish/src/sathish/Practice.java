package sathish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sathish");
		driver.findElement(By.id("id=pass")).sendKeys("12345678");
        //driver.findElement(By.xpath("//*[@id=u_0_2]")).click();
	}

}

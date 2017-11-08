package Dropdown;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='anonCarousell']/ol/li"));
		for(int i=4;i<li.size();i++){
        String imagename =driver.findElement(By.xpath("//div[@id='anonCarousell']/ol/li["+i+"]div/div/div/div/span/a/img")).getAttribute("alt");
        System.out.println("alt name" +imagename);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='anonCarousel1']/ol/li["+i+"]/div/div/div/div/span/a/img"))));
		WebElement abcd =driver.findElement(By.xpath("//div[@id='anonCarousell']/ol/li["+i+"]/div/div/div/div/span/a/img"));
        Actions act = new Actions(driver);
		act.moveToElement(abcd).doubleClick().perform();
		}
	}

}

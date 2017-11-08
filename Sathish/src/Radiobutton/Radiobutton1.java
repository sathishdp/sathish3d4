package Radiobutton;


	import java.util.List;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Radiobutton1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sathish\\Desktop\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://echoecho.com/htmlforms10.htm");
			
			
			WebElement radio=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
			List<WebElement> rbutton=radio.findElements(By.name("group1"));
			for(int i=0;i<rbutton.size();i++){
				System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
			}driver.close();
		}
	}




package brokenlinks;


	import java.util.List;
	import org.openqa.selenium.*;
	
import org.openqa.selenium.firefox.FirefoxDriver;
	public class countinglinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
			d.navigate().to("http://yahoo.com");
			d.manage().window().maximize();		
			//storing all links which are under tag a into a variable
			List<WebElement>links=d.findElements(By.tagName("a"));
		
			System.out.println("no of links are:::"+links.size());
	for(WebElement linktext:links)
	{
		String linkname=linktext.getText();
		System.out.println("link name is:::"+linkname);
	}
 	}

	}













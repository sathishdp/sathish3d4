package brokenlinks;



	
		

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		
import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class linklist {

		WebDriver driver;
			
		public static void main(String[] args) {

				System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://google.com");
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			
			
			
			
				String expval="Google Images";
				
				driver.findElement(By.linkText("Images")).click();		
				String actval=driver.getTitle();
				if(actval.contentEquals(expval))
				{
					System.out.println("Images links are same \n" +  actval  +  "\n"  + expval);
				}
				else
				{
					System.out.println("Images links are different \n"+actval+"\n"+ expval);
				}
			 }

		


	}



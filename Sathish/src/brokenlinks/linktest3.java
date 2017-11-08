package brokenlinks;



	

		import java.util.List;

		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
		
import org.openqa.selenium.firefox.FirefoxDriver;

		public class linktest3 {

			public static void main(String[] args) throws InterruptedException {
				int count=0;
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://bing.com");
				
				
				WebElement header=driver.findElement(By.id("sc_hdu"));
				List<WebElement> links=header.findElements(By.tagName("a"));
				
				System.out.println("Total Links present Header Page :" + links.size());
				for (int i=0;i<links.size();i++) 
				{
					if(!links.get(i).getText().isEmpty())
					{
						count++;
						if(links.get(i).getText().contentEquals("News"))
						{
							
							System.out.println(links.get(i).getText());
							links.get(i).click();
							Thread.sleep(4000);
							break;
						}
					}
					driver.navigate().back();
					Thread.sleep(4000);
					 header=driver.findElement(By.id("sc_hdu"));
					 links=header.findElements(By.tagName("a"));
				}
			
				//System.out.println("Net Links visible are : "+count);
				//driver.quit();
			}

		

		// TODO Auto-generated method stub

	}



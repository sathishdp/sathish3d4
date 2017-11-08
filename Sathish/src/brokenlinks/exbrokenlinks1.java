package brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class exbrokenlinks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
      driver.get("https://my.naukri.com");
      List<WebElement> links =  driver.findElements(By.tagName("a"));
      System.out.println("all links are  "+links.size());
      for(int i=0;i<links.size();i++){
    	  String url =  links.get(i).getAttribute("href");
    	  verifyLinkActive(url);
      }
	}
	public static void verifyLinkActive(String linkUrl)
	{
      try 
      {
         URL url = new URL(linkUrl);
         
         HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
         
         httpURLConnect.setConnectTimeout(3000);
         
         httpURLConnect.connect();
         
         if(httpURLConnect.getResponseCode()==200)
         {
             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
         }
        if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) 
         {
             System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
          }
      } catch (Exception e) {
         
      }
  }   
  
  

 

}

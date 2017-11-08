

	//launch the browser
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.opera.OperaDriver;
	public class Browsers {
	public WebDriver d;
	public void Br_Firefox() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		d=new FirefoxDriver();
		
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("http://www.google.com");
		d.manage().window().maximize();
		d.quit();
	}
	public void Br_chrome() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathish\\Desktop\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("http://facebook.com");
		d.manage().window().maximize();
		d.quit();
	}
	public void Br_iebrowser() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "D:\\selenium\\divers\\ie driver\\IEDriverServer.exe");
		d=new InternetExplorerDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("http://gmail.com");
		d.manage().window().maximize();
		d.quit();
	}
	public void Br_opera() throws InterruptedException{
		System.setProperty("webdriver.opera.driver", "D:\\selenium\\divers\\opera\\operadriver_win64\\operadriver.exe");
		d=new OperaDriver();
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		d.get("http://flipkart.com");
		d.manage().window().maximize();
		d.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		Browsers b=new Browsers();
		b.Br_Firefox();
		//b.Br_chrome();
		//b.Br_iebrowser();
		//b.Br_opera();

		}

	}


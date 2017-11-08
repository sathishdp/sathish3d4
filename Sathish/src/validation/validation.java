package validation;



	import java.io.*;
	import java.text.*;
	import java.util.Date;
	import java.util.Scanner;
	import java.util.concurrent.TimeUnit;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.*;
	
import org.openqa.selenium.firefox.FirefoxDriver;
	public class validation {
	public static WebDriver obj;
	public static String Expval,Acval;
	public static void Login() throws IOException{
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("enter user name");
			String user=s.nextLine();
			System.out.println("enter password");
			String pwd=s.nextLine();
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
	obj=new FirefoxDriver();
	//suspend selenium throught program when selenium searching for elements in a page.
	obj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	obj.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	obj.manage().window().maximize();
	DateFormat df=new SimpleDateFormat("dd_MM_yyyy hh_mm_ss");
	Date d=new Date();
	String datef=df.format(d);
	WebElement username=obj.findElement(By.xpath(".//*[@id='txtUsername']"));
	username.clear();
	username.sendKeys(user);
	WebElement pass=obj.findElement(By.xpath(".//*[@id='txtPassword']"));
	pass.clear();
	pass.sendKeys(pwd);
	obj.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	Expval="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
	Acval=obj.getCurrentUrl();
	if(Expval.equals(Acval)){
		System.out.println("login pass");
	//store screen shot into one variable	
	File src=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
	//copy screen shot into local system.
	FileUtils.copyFile(src, new File("d:/"+datef+"loginpage.jpg"));
	}
	else{
		System.out.println("login fail");
		//store screen shot into one variable	
		File src=((TakesScreenshot)obj).getScreenshotAs(OutputType.FILE);
		//copy screen shot into local system.
		FileUtils.copyFile(src, new File("d:/"+datef+"loginpage.jpg"));
	}
	obj.quit();
		}

	}
	public static void main(String[] args) throws IOException {
		validation.Login();

		}

	}




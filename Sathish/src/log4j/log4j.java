package log4j;


	
		package Retesting;
		import org.apache.log4j.Logger;
		import org.apache.log4j.PropertyConfigurator;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.Test;
		public class Log4j_Class {
		@Test
		public void Login(){
			Logger log=Logger.getLogger("Log4j_Class");
			//path log4j under your project
			PropertyConfigurator.configure("Lo4j.properties");
			System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
			log.info("Chromedriver lauching");
			WebDriver wd=new ChromeDriver();
			log.info("chrome browser launching");
			wd.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			log.info("url  launching");
			wd.manage().window().maximize();
			log.info("entering username");
			wd.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
			log.info("entering password");
			wd.findElement(By.cssSelector("#txtPassword")).sendKeys("admin");
			log.info("clcicking submit button");
			wd.findElement(By.cssSelector("#btnLogin")).submit();
			log.info("Storing url ");
			String Expval="http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard";
			log.info("Geeeting current url");
			String Acval=wd.getCurrentUrl();
			log.warn("comparing expexted and actual");
			if(Expval.matches(Acval)){
				System.out.println("login pass");
			}
			else{
				System.out.println("login fail");
			}
		}
		}

		

	
		

	}

}

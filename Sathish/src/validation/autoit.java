package validation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoit {

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//dragAndDrop(WebElement source, WebElement target)
		driver.get("https://my.naukri.com/account/register/basicdetails");
		//("https://my.naukri.com/account/register/basicdetails"); 
		driver.findElement(By.xpath("html/body/div/form/div[1]/div/button")).click();
		driver.findElement(By.xpath(".//*[@id='basicDetailForm']/resman-uploader/div/div[1]/span[1]/input")).sendKeys("C:\\Users\\sathish\\Desktop\\New Microsoft Word Document.docx");;
		Runtime.getRuntime().exec("C:\\Users\\sathish\\Desktop\\Fileupload1.exe");
		*/
	public void UploadFileUsingJacobDll()
			throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sathish\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

		String workingDir = System.getProperty("user.dir");

		final String jacobdllarch = System.getProperty("sun.arch.data.model")
				.contains("32") ? "jacob-1.18-x86.dll" : "jacob-1.18-x64.dll";
		String jacobdllpath = workingDir + "\\" + jacobdllarch;

		File filejacob = new File(jacobdllpath);
		System.setProperty(LibraryLoader.JACOB_DLL_PATH,
				filejacob.getAbsolutePath());
		autoit uploadWindow = new autoit();

		driver = new FirefoxDriver();
		String filepath = workingDir + "\\SeleniumWebdriverUploadFile.html";
		driver.get(filepath);

		Thread.sleep(1000);

		driver.findElement(By.id("uploadfile")).click();

		Thread.sleep(1000);

		if (uploadWindow.winWaitActive("File Upload", "", 5)) {
			if (uploadWindow.winExists("File Upload")) {
				uploadWindow.sleep(100);
				uploadWindow.send(filepath);
				uploadWindow.controlClick("File Upload", "", "&Open");

			}
		}
	}

	private void controlClick(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

	private void send(String filepath) {
		// TODO Auto-generated method stub
		
	}

	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	private boolean winExists(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean winWaitActive(String string, String string2, int i) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void main(String[] args){
		
		autoit abc = new autoit();
		
	}
	}


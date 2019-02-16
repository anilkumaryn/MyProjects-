import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import pomClasses.ReadWriteExcel;

public class Clarity {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		for (int k = 1; k<= 8; k++) 
		{
			ReadWriteExcel rw = new ReadWriteExcel("C:\\Downloads\\Selenium\\AVIS\\TestData\\AVIS_GUITestData_WalkUp.xlsx");
			String TestExecute = rw.getCellData("DATA", k ,13);
		
			if (TestExecute.equals("Y"))
			{	
			String username =rw.getCellData("DATA", k, 1);
			String password =rw.getCellData("DATA", k, 2);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://clarity.avisbudget.com/niku/nu#action:npt.overview");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement usernameelement =driver.findElement(By.xpath("//input[@id='ppm_login_username']"));//.sendKeys("");
		WebElement passwordelement =driver.findElement(By.xpath("//input[@id='ppm_login_password']"));//.sendKeys("Anil@7318");
		WebElement submit=driver.findElement(By.xpath("//input[@id='ppm_login_button']"));//.click();
		WebElement ek= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[3]/div[3]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]"));
		WebElement addtaskelement = driver.findElement(By.xpath("//button[contains(text(),'Add Task')]"));//.click();
		
				
		sendkeys(driver, usernameelement, 10, username);
		sendkeys(driver,passwordelement,10,password);
		click(driver, submit, 10);
		Thread.sleep(3000);
		ek.isDisplayed();
		ek.click();
		click(driver, addtaskelement, 10);
		
		
		//Regression Automation - WIZARD
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).click();
		//US Overhead Project - Contractor, only if employee on leave
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")).click();
		//WebElement ad=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[2]/div[1]/button[1]"));
		//ad.isDisplayed();
		//ad.isSelected();
		//ad.click();
		////Regression Automation - WIZARD
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/input[1]")).sendKeys("8");//mon
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/input[1]")).sendKeys("8");//tue
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[10]/input[1]")).sendKeys("8");//wed
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]/input[1]")).sendKeys("8");//thu
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[12]/input[1]")).sendKeys("8");//fri
		// select to Submit for Approval
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")).click();
		////US Overhead Project - Contractor, only if employee on leave
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[8]/input[1]")).sendKeys("0");//mon
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[9]/input[1]")).sendKeys("0");//tue
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[10]/input[1]")).sendKeys("0");//wed
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[11]/input[1]")).sendKeys("0");//thu
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[12]/input[1]")).sendKeys("0");//fri
		// select to Submit for Approval 
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")).click();
		// submit 
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[1]/button[2]")).click();
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   		FileUtils.copyFile(file,new File("C:\\Downloads\\Selenium\\Clarity"+username+".png"));
	//FileUtils
		
		
			}

	
				
		}
		
	
	}
	public static void sendkeys(WebDriver driver, WebElement element ,int timeout ,String value) {
		//new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		//element.sendKeys(value);
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		}
	public static void click(WebDriver driver,WebElement element, int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
}

import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import com.google.common.io.Files;


public class ActionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a=new Actions(driver);
		
		
		a.moveToElement(driver.findElement(By.id("nav-link-yourAccount"))).contextClick().build().perform();
		//a.moveToElement(driver.findElement(By.xpath("a[@class='nav-text']"))).click().build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("alexa").doubleClick().click().build().perform();
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(file,new File("C://Downloads//Selenium//Clarity")); //Getting error at this line
		
		

		
		
		
		
		
		

	}

}

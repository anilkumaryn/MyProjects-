import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		Set <String> ids=driver.getWindowHandles();
		Iterator <String> it=ids.iterator();
		String Parntid=it.next();
		String chldid=it.next();
		driver.switchTo().window(Parntid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(chldid);
		System.out.println(driver.getTitle());
					
		
		
		
		
		/*driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("google news");
		driver.findElement(By.xpath("//div[@class='jsb']//input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//span[@class='ellip']")).click();
		driver.get("https://news.google.com/?hl=en-IN&gl=IN&ceid=IN:en");
		driver.findElement(By.xpath("a[@class='VDXfz']")).click();*/
		
		
		
		
		
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#header_tab_hotels")).click();
		driver.findElement(By.xpath("//button[@id='searchBtn']")).click();
		driver.findElement(By.xpath("//div[@class='m_maker_crossv2']")).click();
		
		driver.findElement(By.xpath("//span[@class='ch__signup cho_signup']")).click();
		driver.findElement(By.xpath("//input[@id='ch_signup_email']")).sendKeys("anilkumar.yn@gmail.com");
		driver.findElement(By.xpath("//input[@id='ch_signup_phone']")).sendKeys("9945459590");
		driver.findElement(By.xpath("//input[@id='ch_signup_password']")).sendKeys("ak233hfkf");
		driver.findElement(By.cssSelector("#ch_signup_btn")).sendKeys(Keys.ENTER);
		String  error=driver.findElement(By.xpath("//span[contains(text(),'Sorry!This Email is already Registered.Please choo')]")).getText();
		System.out.println(error);
		
		driver.findElement(By.cssSelector("#hp-widget__sDest")).sendKeys(Keys.valueOf("goa"));
		driver.findElement(By.xpath("//input[@id='hp-widget__chkIn']")).sendKeys(Keys.TAB);
	}

}

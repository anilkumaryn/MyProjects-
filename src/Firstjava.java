import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firstjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://store.demoqa.com");// To hit the URL on browser 
		System.out.println(driver.getTitle());// validate if ryt title is correct 
		System.out.println(driver.getCurrentUrl());// validate if ryt url has been invoked 
		//System.out.println(driver.getPageSource());// to get page source of current page (ctrl+f) to find any id or attributes 
		driver.navigate().to("http://google.co.in");
		driver.navigate().back();//to navigate back to previous page
		driver.navigate().forward();// to forward 
		
		driver.navigate().to("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("akyn@gmail.com");// using ID 
		//driver.findElement(By.id("pass")).sendKeys("akyn");// using ID 
		driver.findElement(By.cssSelector("#email")).sendKeys("Akyn");// using cssselector
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("dasdf");// using xpath 
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
		System.out.println(driver.getCurrentUrl());// validate if ryt url has been invoked 
		
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		//System.out.println(driver.findElement(By.xpath("//span[@class='currentprice pricedisplay product_price_32']")).getText()); //validate to  text present in website 
		driver.close();// It close only current window only
		driver.quit();//It closes all windows opened by selenium 
		
	
		
		
	}

}

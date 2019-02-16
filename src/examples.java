import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To get count of links on page
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Downloads\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println(driver.getTitle());
		WebElement footertable=driver.findElement(By.id("gf-BIG"));
		System.out.println(footertable.findElements(By.tagName("a")).size());
		gitdemo gt=new gitdemo();
	   System.out.println(gt);
				
		
		driver.close();
		driver.quit();
		
		
		

	}

}

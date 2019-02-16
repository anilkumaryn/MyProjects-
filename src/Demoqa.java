import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
				
				driver.get("https://store.demoqa.com");
				driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
			
				driver.findElement(By.xpath("//input [@name='log']")).sendKeys("anil");
				driver.findElement(By.xpath("//input [@type='password']")).sendKeys("password");
				driver.findElement(By.xpath("//input [@name='submit']")).click(); 
			
				System.out.println(	driver.findElement(By.xpath("//p [@class='response']")).getText());
				
				
	}

}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.moneycontrol.com");
	    driver.findElement(By.cssSelector("#search_str")).sendKeys("KTK");
	    driver.findElement(By.xpath("//a[@title='Submit']")).click();
	    
	    
		
	}

}

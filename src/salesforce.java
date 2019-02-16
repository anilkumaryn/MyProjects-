

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
public class salesforce {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.name("username")).sendKeys("anil");
			driver.findElement(By.id("password")).sendKeys("anil");
			driver.findElement(By.xpath("//label[@for='rememberUn']")).click();
			driver.findElement(By.id("Login")).click();
			
			//driver.findElement(By.className("button r4 wide primary")).click();//error (invalid selector: Compound class names not permitted)
			System.out.println(driver.getTitle());// validate if ryt title is correct 
			System.out.println(driver.getCurrentUrl());// validate if ryt url has been invoked 
			System.out.println(driver.findElement(By.cssSelector("#error")).getText());
			driver.close();// It close only current window only
			driver.quit();//It closes all windows opened by selenium 
			
			
			
			
		}

	}




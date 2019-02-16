import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automationpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		
		
	
		WebElement Welement=driver.findElement(By.xpath("//a[text()='Women']"));
		WebElement topselement=driver.findElement(By.xpath("//a[@title=\"Tops\"]//parent::div[1]"));
		WebElement searchelement=driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));//.sendKeys("dress");
		sendkeys(driver, searchelement, 20, "dress");
		
		Thread.sleep(15000);
	
		//a.click(topsElement);
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//driver.findElement(By.xpath("//a[@title=\"Tops\"]//parent::div[1]")).click();
		//clickon(driver, Welement, 30);
		//clickon(driver, topsElement, 30);
	}
	
	public static void sendkeys(WebDriver driver, WebElement element ,int timeout ,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		}
	public static void clickon(WebDriver driver, WebElement element ,int timeout ) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}

}

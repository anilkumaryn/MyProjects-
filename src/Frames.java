import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Downloads\\\\Selenium\\\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\mandar\\Project Backup-GSA Automation\\May\\GSA\\Test_Library\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//WebDriver driver = new ChromeDriver(options);*/
		 int size = driver.findElements(By.tagName("iframe")).size();
		 System.out.println(size);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//driver.findElement(By.id("draggable")).click();
		System.out.println( driver.findElement(By.xpath("//iframe[@class='demo-frame']")).getSize());

		Actions a =new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		driver.close();
	  
		
		//driver.get("https://www.freecrm.com/index.html");
		//driver.findElement(By.name("username")).sendKeys("anil123");
		//driver.findElement(By.name("password")).sendKeys("anil123");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(3000);
		
		//driver.switchTo()
		//driver.findElement(By.xpath("//a[contains(Companies)]")).click();
		
		/*driver.get("https://uat.ccrgservices.com/wizardgui2/ui/wizard.jsf?mnemonic=bos");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("qa.user");
		driver.findElement(By.name("PASSWORD")).sendKeys("Avis2018#");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-index='3']")).click();
		Thread.sleep(3000);
		WebElement sr=driver.findElement((By.xpath("//div[@id='resInfoPanel']//div[@class='row']//div[4]//div[1]//select[1]")));
		//driver.findElement(By.xpath("//select/options[@value='Y']")).click();
		Select dr=new Select(sr);
		dr.selectByVisibleText("Delivery");
		dr.deselectByValue("Delivery");*/
		
		
		

	}

}

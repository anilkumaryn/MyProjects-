import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Func {

	public static void main(String[] args) throws InterruptedException {
		
	// TODO Auto-generated method stub
		
		//java script related pop up, need to switch to alert and find (java alerts)
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.xul.fr/javascript/alert.php");
	
		driver.findElement(By.xpath("//form[@name='form1']//input[@value='Send']")).click();
		String txt=driver.switchTo().alert().getText();
		System.out.println(txt);
		// to accept java alert and pop up will 
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
		String str=driver.findElement(By.xpath("//*[@id=\"content\"]/p[6]/strong")).getText();
		System.out.println(str);
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,400)");
		   Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		   driver.findElement(By.xpath("//*[@id=\"content\"]/form[2]/input[1]")).sendKeys("read this");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form[2]/input[2]")).click();
		String txt1=driver.switchTo().alert().getText();
		System.out.println(txt1);
		driver.switchTo().alert().accept();
		
	}

}

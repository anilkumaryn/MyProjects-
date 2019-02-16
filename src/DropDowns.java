import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.spicejet.com/");
		//select method for selecting from drop down which are in static ,we can use inbuilt method and use it by invoking 
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		//s.selectByIndex(2);
		//s.selectByVisibleText("USD");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//("(a[@value='HBX'])[2]")
		driver.findElement(By.xpath("(//a[@value='HBX'])[2]")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//to check if check box is selected - return ture or false 
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		
	}

}

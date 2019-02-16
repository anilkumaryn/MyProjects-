import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		// to get all radio buttons 
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		// get total count of radio button in web page
		int count=driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println(count);
		// for select required radio button and clicking on it with out hard coding the same 
		for (int i=0;i<count;i++)
		{
			String val= driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
			System.out.println(val);
			// input required so that it will go and click on it 
				if(val.equalsIgnoreCase("IE"))
				
				{
					driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
				}
		}
		
	driver.close();	
	}

}

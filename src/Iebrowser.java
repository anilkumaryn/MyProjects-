import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Iebrowser {
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\MicrosoftWebDriver.exe");
	WebDriver driver =new InternetExplorerDriver();
	
	driver.get("https://www.moneycontrol.com");
	System.out.println(driver.getTitle());
}
}

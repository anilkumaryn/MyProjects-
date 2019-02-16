import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		//gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\Downloads\\Selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.moneycontrol.com");
		System.out.println(driver.getTitle());
	
	}

}

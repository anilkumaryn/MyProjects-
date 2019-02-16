package GUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
public class SampleTest {
    WebDriver driver;
 
    @BeforeMethod
    public void setup() {
        String baseUrl = "http://www.google.com";
        // Initialize driver object
        System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
       // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/lib/chromedriver.exe");
        driver = new ChromeDriver();
        // Launch Application on browser
        driver.get(baseUrl);
    }
 
    @Test
    public void test01() {
        String expectedPageTitle = "Google";
        String actualPageTitle = "";
 
        // Fetch page title and store it in a variable
        actualPageTitle = driver.getTitle();
        // Print title
        System.out.println(actualPageTitle);
 
        if (actualPageTitle.equals(expectedPageTitle)) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case Failed");
        }
 
    }
 
    @AfterMethod
    public void tearDown() {
        // close browser
        driver.close();
    }
}
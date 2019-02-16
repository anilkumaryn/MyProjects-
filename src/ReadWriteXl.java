import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.ReadWriteExcel;

public class ReadWriteXl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		for (int k = 1; k <= 65; k++)
		{
		ReadWriteExcel rwe = new ReadWriteExcel("C:\\Downloads\\Selenium\\AVIS\\TestData\\AVIS_GUITestData_WalkUp.xlsx");
		String Execute = rwe.getCellData("Avis_GUI", k, 2);
		if (Execute.equals("Y"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			System.out.println(" iteration " + k);
			driver.get("google.com");
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("C:\\Users\\yeliyura\\Desktop\\AvcExport_SC1.png"));
			
		}
		}
	}

}

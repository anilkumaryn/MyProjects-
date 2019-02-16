import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomClasses.GUIFunctions;
import pomClasses.ReadWriteExcel;

public class ReadAndWriteMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		for (int k = 1; k <= 8; k++) 
		{
			
			ReadWriteExcel rw = new ReadWriteExcel("C:\\Downloads\\Selenium\\AVIS\\TestData\\AVIS_GUITestData_WalkUp.xlsx");
			String TestExecute = rw.getCellData("Avis_GUI", k, 2);
			System.out.println(TestExecute);
			if (TestExecute.equals("Y"))
			{
				String TestUrl = rw.getCellData("Avis_GUI", k, 7);
				String TestStn = rw.getCellData("Avis_GUI", k, 8);
				String Testqauser = rw.getCellData("Avis_GUI", k, 9);
				String Testqapwd = rw.getCellData("Avis_GUI", k, 10);
				String LastName = rw.getCellData("Avis_GUI", k, 11);
				String FirstName = rw.getCellData("Avis_GUI", k, 12);
				String CheckOutDate = rw.getCellData("Avis_GUI", k, 13);
				String CheckOutTime = rw.getCellData("Avis_GUI", k, 14);
				String InStation = rw.getCellData("Avis_GUI", k, 15);
				String CheckInDate = rw.getCellData("Avis_GUI", k, 16);
				String CheckInTime = rw.getCellData("Avis_GUI", k, 17);
				String CarGroup = rw.getCellData("Avis_GUI", k, 18);
				String Awd = rw.getCellData("Avis_GUI", k, 19);
				String CreditDeb_Card = rw.getCellData("Avis_GUI", k, 20);
				String CardNumber = rw.getCellData("Avis_GUI", k, 21);
				String Month = rw.getCellData("Avis_GUI", k, 22);
				String Year = rw.getCellData("Avis_GUI", k, 23);
				String Reason = rw.getCellData("Avis_GUI", k, 24);
				String Insurance = rw.getCellData("Avis_GUI", k, 25);
				String Counterproduct = rw.getCellData("Avis_GUI", k, 26);
				//String Year = rw.getCellData("Avis_GUI", k, 27);
				//String Year = rw.getCellData("Avis_GUI", k, 28);
				//String Year = rw.getCellData("Avis_GUI", k, 29);
				
				
				
				
				
				//System.out.println("Test Url is :" +TestUrl);
				System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions(); 
				options.addArguments("disable-infobars"); 
				WebDriver driver=new ChromeDriver(options);
				System.out.println("inside if condition");
				String TestUrlEnd = TestUrl+TestStn;
				driver.get(TestUrlEnd);
			
				GUIFunctions functions = new GUIFunctions(driver);
				//functions.link(tokenURL, thinClient);
				/* Login */
				Thread.sleep(5000);
				functions.login(Testqauser, Testqapwd);
				Thread.sleep(5000);
				driver.close();
				
				
				System.out.println("K value inside if N "+ k);
			}else
				System.out.println("K value outside if N "+ k);
		}
		
	}

}

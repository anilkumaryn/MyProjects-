	package GUI;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pomClasses.GUIFunctions;
import pomClasses.ReadWriteExcel;

@SuppressWarnings("unused")
public class AVIS_Walkup_Rentals {

	
	
	
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startReport() {

		extent = Extentmanager.GetExtent();
		//test = extent.createTest("GUI");

	}
	
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	@Test
	
	public void test() throws Exception {
		try {
			
		for (int k = 1; k<= 8; k++) 
		{
			ReadWriteExcel rw = new ReadWriteExcel("C:\\Downloads\\Selenium\\AVIS\\TestData\\Avis_GUITestData_WalkUp.xlsx");
			String TestExecute = rw.getCellData("Avis_USA", k ,2);
		
			if (TestExecute.equals("Y"))
			{	
				
				String TestCaseName   = rw.getCellData("Avis_USA", k, 5);
				String TestUrl        = rw.getCellData("Avis_USA", k, 6);
				String TestStn        = rw.getCellData("Avis_USA", k, 7);
				String Testqauser     = rw.getCellData("Avis_USA", k, 8);
				String Testqapwd      = rw.getCellData("Avis_USA", k, 9);
				String LastName       = rw.getCellData("Avis_USA", k, 10);
				String FirstName      = rw.getCellData("Avis_USA", k, 11);
				String CheckOutDate   = rw.getCellData("Avis_USA", k, 12);
				String CheckOutTime   = rw.getCellData("Avis_USA", k, 13);
				String InStation      = rw.getCellData("Avis_USA", k, 14);
				String CheckInDate    = rw.getCellData("Avis_USA", k, 15);
				String CheckInTime    = rw.getCellData("Avis_USA", k, 16);
				String CarGroup       = rw.getCellData("Avis_USA", k, 17);
				String Ftn 			  = rw.getCellData("Avis_USA", k, 18);
				String Awd            = rw.getCellData("Avis_USA", k, 19);
				String CreditDeb_Card = rw.getCellData("Avis_USA", k, 20);
				String CardNumber     = rw.getCellData("Avis_USA", k, 21);
				String Month          = rw.getCellData("Avis_USA", k, 22);
				String Year           = rw.getCellData("Avis_USA", k, 23);
				String Reason         = rw.getCellData("Avis_USA", k, 24);
				String Cpn 			  = rw.getCellData("Avis_USA", k, 25);
				String CountrProd 	  = rw.getCellData("Avis_USA", k, 26);
				String Remarks        = rw.getCellData("Avis_USA", k, 27);
				String Country    	  = rw.getCellData("Avis_USA", k, 28);
				String State          = rw.getCellData("Avis_USA", k, 29);
				String DrLincNo	      = rw.getCellData("Avis_USA", k, 30);
				String Dob			  = rw.getCellData("Avis_USA", k, 31);
				String Company 		  = rw.getCellData("Avis_USA", k, 32);
				String Addr1		  = rw.getCellData("Avis_USA", k, 33);
				String Addr2		  = rw.getCellData("Avis_USA", k, 34);
				String Addr3          = rw.getCellData("Avis_USA", k, 35);
				String ContactInfo	  = rw.getCellData("Avis_USA", k, 36);
				String Email		  = rw.getCellData("Avis_USA", k, 37);
				String Insurance      = rw.getCellData("Avis_USA", k, 38);
				

		//System.out.println("Test case name is :" +TestCaseName);
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		WebDriver driver=new ChromeDriver(options);
		String TestUrlEnd = TestUrl+TestStn;
		driver.get(TestUrlEnd);
		driver.manage().window().maximize();
		GUIFunctions functions = new GUIFunctions(driver);
		
		//To get data from properties file in same package 
		Properties prop= new Properties();
		FileInputStream ip=new FileInputStream("C:\\Downloads\\Selenium\\work\\Java_program\\src\\GUI\\config.properties");
		prop.load(ip);
		String licenseCntry =prop.getProperty("licenseCountry");
		
		//functions.link(tokenURL, thinClient);
		/* Login */
		functions.login(Testqauser, Testqapwd);
		
		String strPageTitle = driver.getTitle();
		
		if (strPageTitle.equals("Avis Budget Group"))
		{
			System.out.println(" logging in ");
		}
		else
		{
			driver.navigate().refresh();
		}
	
		Thread.sleep(5000);
		//functions.link(tokenURL, thinClient);
		/* Login */
		//functions.login("qa.user", "Avis2018#");
		//.setCellData("Walkup_Rental", 1,29,TestCaseName);
		WebElement rateShopCommandButton=driver.findElement(By.xpath("//input[@id='rateShopCommandButton']"));
		WebElement pickupStation= driver.findElement(By.id("resRateLookupDlg:rateLookupForm:pickupStation:pickupStation"));
		WebElement CheckOutDateElement =driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:pickupDate_hid']"));
		WebElement CheckOutTimeElement =driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:pickupTime']"));
		WebElement CheckInDateElement =driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:returnDate_hid']"));
		WebElement CheckInTimeElement =driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:returnTime']"));
		WebElement toavoidCalander=driver.findElement(By.xpath("//div[@class='form-horizontal']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12']"));
		WebElement wizardNumber=driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:wizardNumber']"));
		WebElement coupon=driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:coupon']"));
		WebElement qty=driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:qty']"));
		WebElement rateShop=driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:rateShop']"));
		
		clickon(driver, rateShopCommandButton, 40);
		Thread.sleep(2000);
		clickon(driver,pickupStation,10);
		pickupStation.clear();
		sendkeys(driver,pickupStation,20,TestStn);
		sendkeys(driver, CheckOutDateElement, 40, CheckOutDate);
		sendkeys(driver, CheckOutTimeElement, 40, CheckOutTime);
		sendkeys(driver, CheckInDateElement, 10, CheckInDate);
		sendkeys(driver, CheckInTimeElement, 10, CheckInTime);	
		clickon(driver, toavoidCalander, 20);
		sendkeys(driver, wizardNumber, 10, "");
		sendkeys(driver, coupon, 10, "");
		sendkeys(driver, qty, 10, "");
		clickon(driver, rateShop, 20);
		
		
		Thread.sleep(5000);
		String Car_val;
		try {
			Car_val = driver.findElement(By.xpath("//*[@id='resRateLookupDlg:rateLookupForm:groups_data']")).getAttribute("innerText");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			driver.close();
			continue;
		} 
		String[] temp_Car_Val = Car_val.split("\\n");
	     int len_tempCar= temp_Car_Val.length;
	     String Excel_ValCar = CarGroup; 
	     for (int i=1;i< len_tempCar;i++){
	         // System.out.println(temp_Car_Val[i]);
	          String[] Ary_Cls_name = temp_Car_Val[i].split("-");
	          String Cls_name = Ary_Cls_name[0].trim();
	        //  System.out.println(Cls_name);
	          if (Excel_ValCar.equals(Cls_name) ){
	              System.out.println(i);
	              int j=i-1;
	              String Rate = "//input[@value='standard,"+j+"']";
	            		//input[@value='standard,0']
	              try {
					driver.findElement(By.xpath(Rate)).click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
				driver.close(); 
				continue;
				}
	            		  break;
	              
	          }
	                
	     }
		
		
		WebElement resRateLookupDlgcheckOutButton=driver.findElement(By.xpath("//input[@id='resRateLookupDlg:rateLookupForm:checkOutButton']"));
		clickon(driver, resRateLookupDlgcheckOutButton, 40);
		// walk up
		//driver.findElement(By.xpath("//input[@id='walkupCommandwalkup']")).click();
		
		WebElement LastNameElement = driver.findElement(By.xpath("//input[@id='walkUpDialog:walkUpDailogForm:walkuplastname']"));
		WebElement FirstNameElement =driver.findElement(By.xpath("//input[@id='walkUpDialog:walkUpDailogForm:walkupfirstname']"));
		WebElement walkupContinue=driver.findElement(By.xpath("//input[@id='walkUpDialog:walkUpDailogForm:walkupContinue']"));
		WebElement licenseCountry=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:licenseCountry']"));
		WebElement licenseState=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:licenseState']"));
		WebElement licenseNumber=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:licenseNumber']"));
		WebElement dateOfBirth=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:dateOfBirth']"));
		WebElement company=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:company']"));
		WebElement address1=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:address1']"));
		WebElement address2=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:address2']"));
		WebElement address3=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:address3']"));
		WebElement contactInfo=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:contactInfo']"));
		WebElement EmailInput=driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:wizconEmailInput']"));
		sendkeys(driver, LastNameElement, 50, LastName);
		sendkeys(driver, FirstNameElement, 10, FirstName);
		// if wizard number needs to be given as input  
		//driver.findElement(By.xpath("//input[@id='walkUpDialog:walkUpDailogForm:walkupwizardnumber']")).sendKeys("");
		clickon(driver, walkupContinue, 30);
		Thread.sleep(3500);
		

		
		sendkeys(driver, licenseCountry, 30, Country);
		sendkeys(driver, licenseState, 20, State);
		sendkeys(driver, licenseNumber, 20, DrLincNo);
		sendkeys(driver, dateOfBirth, 30, Dob);
		sendkeys(driver, company, 10, Company);
		sendkeys(driver, address1, 10, Addr1);
		sendkeys(driver, address2, 10, Addr2);
		sendkeys(driver, address3, 10, Addr3);
		sendkeys(driver, contactInfo, 10, ContactInfo);
		sendkeys(driver, EmailInput, 10, Email);
		
		
		

		//Freq.Travel
		driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:ftnType']")).sendKeys("");
		//Number
		driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:ftNumber']")).sendKeys("");
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,400)");
		   Thread.sleep(2000);
		
		   WebElement CheckOut_lstCOCCDC = driver.findElement(By.id("menulist:checkoutContainer:checkoutForm:creditCard:swipe:ccType"));
           Select MOPDropDownList    = new Select(CheckOut_lstCOCCDC);
           MOPDropDownList.selectByVisibleText(CreditDeb_Card );
           Thread.sleep(1000);
           WebElement ccNumber=driver.findElement(By.id("menulist:checkoutContainer:checkoutForm:creditCard:swipe:ccNumber")); 
           WebElement ccExpireMonth= driver.findElement(By.id("menulist:checkoutContainer:checkoutForm:creditCard:swipe:ccExpireMonth")); 
           WebElement ccExpireYear=driver.findElement(By.id("menulist:checkoutContainer:checkoutForm:creditCard:swipe:ccExpireYear")); 
           sendkeys(driver, ccNumber, 10, CardNumber); 
           sendkeys(driver, ccExpireMonth, 10, Month);
           sendkeys(driver, ccExpireYear, 10, Year);
           Thread.sleep(1000);  
           
           WebElement CheckOut_MOPReason = driver.findElement(By.id("menulist:checkoutContainer:checkoutForm:creditCard:swipe:paymentReason"));
           Select MOPReasonDropDownList  = new Select(CheckOut_MOPReason);
           MOPReasonDropDownList.selectByVisibleText(Reason);
           Thread.sleep(1000);
           
           
           
           try {
			// Vehicle Selection
			   driver.findElement(By.xpath("//div[@ng-show='!isOffline']//input[@id='menulist:checkoutContainer:checkoutForm:mvaOrParkingSpace']")).sendKeys("64459010");
			   driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:mileage']")).click();
			   driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:mileage']")).clear();
			   driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:mileage']")).sendKeys("1200");
			   driver.findElement(By.xpath("//input[@id='menulist:checkoutContainer:checkoutForm:checkoutSpace']")).sendKeys("");
			   driver.findElement(By.xpath("//input[@id='footerForm:continueVehicleButton']")).click();
			   Thread.sleep(15000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			  driver.close();
			  continue;
		}
           
           //driver.findElement(By.id("checkoutRepromptDialog:repromptForm:repromptTable:0:repromptValue")).sendKeys("0");
           driver.findElement(By.id("checkoutRepromptDialog:repromptForm:repromptSubmitButton")).click();
           //checkoutRepromptDialog:repromptForm:repromptSubmitButton
           Thread.sleep(10000);
          
        	   
           //driver.findElement(By.id("id=\"footerForm:completeCheckoutButton\"")).click();
           driver.findElement(By.id("footerForm:completeCheckoutButton")).click();
           Thread.sleep(10000);
           //footerForm:completeCheckoutButton
           driver.findElement(By.id("checkoutRepromptDialog:repromptForm:repromptSubmitButton")).click();               
           Thread.sleep(8000); 
           //*[@id="checkoutRepromptDialog:repromptForm:repromptTable:0:repromptValue"]
           
           if(CreditDeb_Card.equals("American Express"))
           {
                driver.findElement(By.id("checkoutRepromptDialog:repromptForm:repromptTable:0:repromptValue")).sendKeys("1234");
                driver.findElement(By.id("checkoutRepromptDialog:repromptForm:repromptSubmitButton")).click();
                Thread.sleep(7000);
           }
           else
           {
                driver.findElement(By.id("checkoutRepromptDialog:repromptForm:repromptTable:0:repromptValue")).sendKeys("123");
                driver.findElement(By.id("checkoutRepromptDialog:repromptForm:repromptSubmitButton")).click();
                Thread.sleep(7000);
           }
           Thread.sleep(7000);
           String str1= driver.findElement(By.xpath("//textarea[@id='checkoutRepromptDialog:repromptForm:repromptOut']")).getText();

           if (str1.contains("**MULTIPLE RENTALS**NEEDS MANAGEMENT AUTHORIZATION "))
                {
        	   driver.findElement(By.xpath("//input[@id='checkoutRepromptDialog:repromptForm:repromptTable:0:repromptValuePassword']")).click();
               driver.findElement(By.xpath("//input[@id='checkoutRepromptDialog:repromptForm:repromptTable:0:repromptValuePassword']")).sendKeys("YES");
               driver.findElement(By.xpath("//button[@id='checkoutRepromptDialog:repromptForm:repromptSubmitButton']")).click();
               Thread.sleep(4000);
                }                                      

            
           Thread.sleep(10000);
           //driver.findElement(By.id("id=printPreviewDialog:printPreviewForm:closePrintPreviewBtn")).click();
           Thread.sleep(10000);
           
           
           
       
		   String strCompleteNameGetText = driver.findElement(By.xpath("//div[@class='form-group']//span[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteName']")).getText();
           Thread.sleep(5000);
           rw.setCellData("Avis_USA", k, 42, strCompleteNameGetText);
           System.out.println(" Last Name First Name value is " + strCompleteNameGetText);
           String strCOVehicleModelGetText = driver.findElement(By.xpath("//div[@class='form-group']//span[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteVehicle']")).getText();
           Thread.sleep(5000);
           rw.setCellData("Avis_USA", k, 41, strCOVehicleModelGetText);
           System.out.println(" Vehicle Model value is " + strCOVehicleModelGetText);
           String strCompleteResNumGetText = driver.findElement(By.xpath("//div[@class='form-group']//span[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteResNum']")).getText();
           Thread.sleep(5000);
           rw.setCellData("Avis_USA", k, 40, strCompleteResNumGetText);
           System.out.println(" Reservation No value is " + strCompleteResNumGetText);
           String strCompleteMVAGetText = driver.findElement(By.xpath("//div[@class='form-group']//span[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteMVA']")).getText();
           Thread.sleep(5000);
           rw.setCellData("Avis_USA", k, 43, strCompleteMVAGetText);
           System.out.println(" MVA No value is " + strCompleteMVAGetText);
           String strCompleteRANumberGetText = driver.findElement(By.xpath("//div[@class='form-group']//span[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteRANumber']")).getText();
           Thread.sleep(5000);
           rw.setCellData("Avis_USA", k, 44, strCompleteRANumberGetText);
           System.out.println(" RA Number value is " + strCompleteRANumberGetText);
           String strCOLicensePlateNoGetText = driver.findElement(By.xpath("//div[@class='form-group']//span[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteLicensePlate']")).getText();
           Thread.sleep(5000);
           rw.setCellData("Avis_USA", k, 45, strCOLicensePlateNoGetText);
           System.out.println(" License Plate Number value is " + strCOLicensePlateNoGetText);
           String strCOEstimatedCostGetText = driver.findElement(By.xpath("//div[@class='form-group']//span[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteEstimatedCost']")).getText();
           Thread.sleep(5000);
           rw.setCellData("Avis_USA", k, 46, strCOEstimatedCostGetText);
           System.out.println(" Estimated Cost value is " + strCOEstimatedCostGetText);
           
           String strCOSystemMsgGetText = driver.findElement(By.xpath("//div[@class='form-group']//textarea[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteOut']")).getText();
           Thread.sleep(5000);
           System.out.println(" CheckOut Complete System Message value is " + strCOSystemMsgGetText);
           
	        String ScreenShotPath = "C:\\Downloads\\Selenium\\Screenshots\\";
   			//String testcasename ="TC1_walkup_dd";
   			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   		FileUtils.copyFile(file,new File( ScreenShotPath +TestCaseName+ ".pgn"));
           
           driver.findElement(By.xpath("//input[@id='checkoutDialog:checkoutCompleteForm:checkoutCompleteDoneButton']")).click();
           Thread.sleep(7000);

           
           
          
           test = extent.createTest(TestCaseName);

			if (rw.getCellData("Avis_USA", k, 44).isEmpty()) {
				rw.setCellData("Avis_USA", k, 46, "FAIL");
				test.log(Status.FAIL, "Fail");
			} else {
				test.log(Status.PASS, "Pass");
				rw.setCellData("Avis_USA", k, 46, "PASS");
			}
		
           //sdf.format(d)+
           driver.close();
           }
        
			
		
			else {
				System.out.println(k);
			}
		
		}		
		} finally {
			
			// TODO: handle finally clause
			extent.flush();
			
	
		}
		
	}
	
	//private void sendKeys(String cardNumber) {
		// TODO Auto-generated method stub
		
	public static void clickon(WebDriver driver, WebElement element ,int timeout ) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
	public static void sendkeys(WebDriver driver, WebElement element ,int timeout ,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		}
	
}

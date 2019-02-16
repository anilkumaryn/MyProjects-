

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
//import ReportLib.*;
//import BaseClassLib.*;
//import dbLib.*;
//import genericLib.*;
public class AVIS_Create_ReservationPage  {
	
	
	int  a= 10;
	String b="20";
	int result = Integer.parseInt(b);			
	
	int Sum = a+result;
	
	
	@SuppressWarnings("deprecation")
	public static void main ()  {
		
		DataInputStream in = new DataInputStream(System.in);
		
		int num = 0;
		float f=0.0f;
		System.out.println("Enter an Intger : ");
		try {
			num=Integer.parseInt(in.readLine());
			System.out.println("Enter Float number :");
			f=Float.valueOf(in.readFloat());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("entered num is"+ num);
		System.out.println("entered float is "+ f);
		
		
	}
	
	
	
}
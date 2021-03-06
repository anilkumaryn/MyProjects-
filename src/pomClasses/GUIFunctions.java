


package pomClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import com.selenium.framework.FrameworkUtility;
/*
 * @author csurek
 * 01-August-2018 - Page Factory Approach for Avis GUI objects and CR common functionalities
 */
public class GUIFunctions {

	ChromeDriver driver;
	  
	public GUIFunctions(WebDriver driver) throws Exception
	{
		PageFactory.initElements(driver, this);		
	}
	
	
	/* Login Page Objects */
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement txt_userid;
	
	//@FindBy(name= "PASSWORD")
	@FindBy(xpath="//input[@name='PASSWORD']")
	public  WebElement txt_password;

	//@FindBy(xpath= "//*[@id='content']/table/tbody/tr/td[2]/form/table/tbody/tr[3]/td/input[2]")
	@FindBy(xpath="//input[@value='Login']")
	public  WebElement btn_login;

	
	/*Navigate TAB Objects*/	
	@FindBy(xpath="//*[@id='menubar']/ul/li[1]/a")
	private  WebElement tab_CheckOut;
	
	@FindBy(xpath="//*[@id='menubar']/ul/li[2]/a")
	private  WebElement tab_CheckIn;
	
	@FindBy(xpath="//*[@id='menubar']/ul/li[3]/a")
	private  WebElement tab_ReadyLine;
	
	@FindBy(xpath="//*[@id='menubar']/ul/li[4]/a")
	private  WebElement tab_ReservationRates;
	
	@FindBy(xpath="//*[@id='menubar']/ul/li[5]/a")
	private  WebElement tab_Manifest;
	
	@FindBy(xpath="//*[@id='menubar']/ul/li[6]/a")
	private  WebElement tab_DisplayRental;
	
	@FindBy(xpath="//*[@id='menubar']/ul/li[7]/a")
	private  WebElement tab_Customer;
	
	
	/*Create Reservation Screen Objects */
	@FindBy(id="menulist:rateshopContainer:resForm:lastName")
	public  WebElement txt_lastname;
	
	@FindBy(id="menulist:rateshopContainer:resForm:firstName")
	public  WebElement txt_firstname;
	
	@FindBy(id="menulist:rateshopContainer:resForm:checkout1_hid")
	public  WebElement dtp_COdate;
	
	@FindBy(id="menulist:rateshopContainer:resForm:checkout2")
	public  WebElement txt_COtime;
	
	@FindBy(id="menulist:rateshopContainer:resForm:returnStation:returnStation")
	public  WebElement txt_inSTA;
	
	@FindBy(id="menulist:rateshopContainer:resForm:checkin1_hid")
	public  WebElement dtp_CIdate;
	
	@FindBy(id="menulist:rateshopContainer:resForm:checkin2")
	public  WebElement txt_CItime;
	
	@FindBy(xpath="//*[@id='menulist:rateshopContainer:resForm:carGroup']")
	public  WebElement ddl_CarGroup;
	
	@FindBy(xpath="//*[@id='menulist:rateshopContainer:resForm:discountNumber']")
	public  WebElement txt_AWD;
	
	@FindBy(id="searchCommandLinkResRateCode")
	public  WebElement btn_RateShopSearch;
	
	@FindBy(xpath="//*[@id='rateshopResDlg']/div/div/div[3]/div/div[3]/input[1]")
	public  WebElement btn_SelectRate;
	
	@FindBy(id="footerForm:footerCreateRes") 
	public  WebElement btn_CreateReservation;
	
	/*Payment Section Objects*/
	@FindBy(id="resPaymentInfoPanel") 
	public  WebElement sec_MOPSection;

	/*MOP Objects*/	
	
	@FindBy(id="menulist:rateshopContainer:resForm:creditCard:swipe:ccType") 
	public  WebElement dd_paymentCard;
	
	@FindBy(id="menulist:rateshopContainer:resForm:creditCard:swipe:ccNumber") 
	public  WebElement txt_cardNumber;
	
	@FindBy(id="menulist:rateshopContainer:resForm:creditCard:swipe:ccExpireMonth") 
	public  WebElement txt_expiryMonth;
	
	@FindBy(id="menulist:rateshopContainer:resForm:creditCard:swipe:ccExpireYear") 
	public  WebElement txt_expiryYear;
	
	@FindBy(id="menulist:rateshopContainer:resForm:creditCard:swipe:paymentReason") 
	public  WebElement dd_paymentReason;
	
	
	/*Protection&Coverage Section Objects*/
	@FindBy(id="resCoveragesInfoPanel") 
	public  WebElement sec_PAPSection;
	
	/*LogOut Objects*/	
	@FindBy(id="headerLogOutButton")
	private  WebElement icon_LogOut;
	
	@FindBy(id="logoutForm:yesLogoutButton")
	private  WebElement btn_LogOut;
	
	/*Excel functionality to get and set data in excel cell */

	/*Open GUI Tabs*/
	public void link(String token, String thinClient) throws InterruptedException, AWTException
	{
		driver.get(token);
		Thread.sleep(2000);
		@SuppressWarnings("unused")
		String WindowHandle = driver.getWindowHandle();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		@SuppressWarnings("unchecked")
		ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(500);
		try
		{
		driver.get(thinClient);
		//Assert.assertTrue(driver.getTitle().equals("Login")); // check whether page with title Login is loaded
		}
		catch(Exception e)
		{
			System.out.println("Login page not found");
		}
	}
	
	public void login(String username, String password)
	{
    	txt_userid.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}
	
	public void navigateToTab(String tabname)
	{
	try
		{	
			if(tabname.equalsIgnoreCase("CheckOut"))
			{
				tab_CheckOut.click();
			}
			else if(tabname.equalsIgnoreCase("CheckIn"))
			{
				tab_CheckIn.click();
			}
			else if(tabname.equalsIgnoreCase("ReadyLine"))
			{
				tab_ReadyLine.click();
			}
			else if(tabname.equalsIgnoreCase("ReservationRates"))
			{
				tab_ReservationRates.click();
			}
			else if(tabname.equalsIgnoreCase("Manifest"))
			{
				tab_Manifest.click();
			}
			else if(tabname.equalsIgnoreCase("DisplayRental"))
			{
				tab_DisplayRental.click();
			}
			else if(tabname.equalsIgnoreCase("Customer"))
			{
				tab_Customer.click();
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}		

	
	public void enterCustomerInformation(String lastname, String firstname,String codate,String cotime, String instation, String cidate, String citime)
	{
		txt_lastname.sendKeys(lastname);
		txt_firstname.sendKeys(firstname);
		dtp_COdate.sendKeys(codate);
		txt_COtime.sendKeys(cotime);
		txt_inSTA.sendKeys(instation);
		dtp_CIdate.sendKeys(cidate);
		txt_CItime.sendKeys(citime);
	}
	
	public void selectCarGroupByVT(String carGroup) throws InterruptedException
	{
		//selectItemFromListBoxByText(ddl_CarGroup,carGroup);	
	    Select carDD = new Select(ddl_CarGroup);
	    carDD.selectByVisibleText(carGroup);		
	}
	
	public void selectCarGroupByIndex(int indexno) throws InterruptedException
	{
		//selectItemFromListBoxByText(ddl_CarGroup,carGroup);	
	    Select carDD = new Select(ddl_CarGroup);
	    carDD.selectByIndex(indexno);		
	}
	
	public void clickSelectRateBtn()
	{
		btn_SelectRate.click();
	}
	
	public void enterAWD (String AWD)
	{
		txt_AWD.sendKeys(AWD);
	}
	
	/*Payment Info*/	
	public void expandPaymentInfoSection()
	{	
		
		 WebElement header_MOPPayment = sec_MOPSection.findElement(By.className("panel-heading"));

		 WebElement btn_MOPSectionExpand = header_MOPPayment.findElement(By.className("pull-right")) ;
      try
       {
          if (btn_MOPSectionExpand.isDisplayed())
          {
       	 if(btn_MOPSectionExpand.isEnabled())
       	    {
       		  btn_MOPSectionExpand.click();
       	    }
          } 
        }
      catch(Exception e3)
        {
       	 e3.printStackTrace();
        }
	}
	
	public void enterPaymentInformations(String cardName, String cardNumber, String month, String year, String reason)
	{
        Select cardDD = new Select(dd_paymentCard);
        cardDD.selectByVisibleText(cardName);
        txt_cardNumber.sendKeys(cardNumber);
        txt_expiryMonth.sendKeys(month);
        txt_expiryYear.sendKeys(year);	
        Select rsnDD = new Select(dd_paymentReason); 
        rsnDD.selectByVisibleText(reason);
	}
	
	/*Additional PRoducts*/
	
	public void expandProtectionCoverageSection()
	{	
		WebElement header_PAPPanel = sec_PAPSection.findElement(By.className("panel-heading"));

		WebElement btn_PAPSectionExpand = header_PAPPanel.findElement(By.className("pull-right")) ;
      try
       {
         if (btn_PAPSectionExpand.isDisplayed())
          {
       	  if(btn_PAPSectionExpand.isEnabled())
       	    {
       		btn_PAPSectionExpand.click();
       	    }
         } 
      }
      catch(Exception e3)
        {
       	 e3.printStackTrace();
        }
	}
	
	public void clickCreateReservationBtn()
	{
		btn_CreateReservation.click();
	}
	
	public void logout() throws InterruptedException
	{
		icon_LogOut.click();
		Thread.sleep(2000);
		btn_LogOut.click();		
	}
	
	public void closeWindows()
	{
		ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)).close();
        driver.switchTo().window(tabs.get(0)).close(); 
		driver.quit();
	}
	
	public void searchResInCOTab(String ReservationNumber)
	{
		driver.findElement(By.id("searchString")).sendKeys(ReservationNumber);
        driver.findElement(By.id("searchCommandLink")).click();
	}

	


	
}





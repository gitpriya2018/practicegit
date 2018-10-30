package testscript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import jxl.read.biff.BiffException;
import pageelements.Loginpage;
import reuseablefns.ReadExcelData;
import reuseablefns.Reuseable;
import testdata.Constants;

public class Verifylogin extends Reuseable  implements Loginpage {
	public static String filepath = "C:\\Users\\AnuNeel\\eclipse-workspace\\FrameworkJava\\src\\testdata\\guru99.xls";
	public static String shtname = "Sheet1";
	Constants cons=new Constants();
	@BeforeTest
	public void beforelogintest() throws IOException {
		initializebrowser();
	}
	
	//@Test(priority=1,description="verify with valid username and invalid password")
	public void vldusinvpw() throws BiffException, IOException, InterruptedException {
		ReadExcelData readdata = new ReadExcelData(filepath, shtname);
		login(readdata.readData(1, 0),readdata.readData(1, 1));
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		if(alert.getText().equals("User or Password is not valid"))
		{
			Reporter.log("validation is displaying for invalid inputs");
		}
		alert.accept();
		
	
	}
	
	//@Test(priority=2,description="verify with Invalid username and valid password")
	public void invldusvldpw() throws BiffException, IOException {
		ReadExcelData readdata = new ReadExcelData(filepath, shtname);
		login(readdata.readData(2, 0),readdata.readData(2, 1));
		alertaccept();
	//	
	}
	//@Test(priority=3,description="verify with Invalid username and invalid password")
	public void invaliduspw() throws BiffException, IOException {
		ReadExcelData readdata = new ReadExcelData(filepath, shtname);
		login(readdata.readData(3, 0),readdata.readData(3, 1));
		alertaccept();
		
	}
	@Test(priority=4,description="verify with valid username and valid password")
	public void login() throws BiffException, IOException {
		ReadExcelData readdata = new ReadExcelData(filepath, shtname);
		login(readdata.readData(4, 0),readdata.readData(4, 1));
		takescreenshoot(new Exception().getStackTrace()[0].getMethodName());
	}
	@Test(priority=5,description="links printing")
	public void allLinks()
	{
		List<WebElement> totallin = driver.findElements(By.tagName("a"));
		for(WebElement links : totallin)
		{
			System.out.println(links.getText());
		}
	}
	@Test(priority=6,description=" new customer ")
	public void createnewcustomer()
	{
		driver.findElement(newcustomer_link).click();
		//give new customer info
		driver.findElement(custname_txt).sendKeys(cons.customername);
		driver.findElement(dob_txt).sendKeys(cons.dateofbirth);
		driver.findElement(address_txtarea).sendKeys(cons.address);
		driver.findElement(city_txt).sendKeys(cons.city);
		driver.findElement(state_txt).sendKeys(cons.state);
		driver.findElement(pin_txt).sendKeys(cons.pin);
		driver.findElement(ph_txt).sendKeys(cons.mobile);
		driver.findElement(email_txt).sendKeys(cons.email);
		driver.findElement(newcustomerpassword_txt).sendKeys(cons.pword);
		driver.findElement(submit_btn).click(); 
      
	}
	
	@AfterTest
	public void closebrsr() {
		driver.close();
	}
	
	}


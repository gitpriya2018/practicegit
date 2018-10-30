package reuseablefns;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pageelements.Loginpage;

public class Reuseable extends Callbroweser implements Loginpage{

	public void alertaccept()
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void login(String username,String password) throws IOException 
	{
		driver.findElement(username_txt).sendKeys(username);
		driver.findElement(password_txt).sendKeys(password);
		driver.findElement(login_btn).click();
		
		
	}
	public void takescreenshoot(String name) throws IOException
	{
		//String  timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		//System.out.println(timestamp);
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\AnuNeel\\eclipse-workspace\\FrameworkJava\\screenshoots\\"+name+".png"));
	}
}

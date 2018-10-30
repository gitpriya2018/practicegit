package reuseablefns;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Callbroweser {
	public WebDriver driver;
	public Properties pro=new Properties();
	public void initializebrowser() throws IOException
	{
		FileReader reader=new FileReader("C:\\Users\\AnuNeel\\eclipse-workspace\\FrameworkJava\\config.properties");
		pro.load(reader);
		switch (pro.getProperty("browser")) {
		case "FF":
			System.setProperty("webdriver.gecko.driver", pro.getProperty("FFpath"));
			DesiredCapabilities capabilities = new DesiredCapabilities();

			 capabilities = DesiredCapabilities.firefox();
			 capabilities.setBrowserName("firefox");
			 capabilities.setVersion("your firefox version");
			 capabilities.setPlatform(Platform.WINDOWS);
			 capabilities.setCapability("marionette", false);

			//driver=new FirefoxDriver(capabilities);
			getURLMax();
			break;
		case "GC":
			System.setProperty("webdriver.chrome.driver",pro.getProperty("GCpath"));
			driver=new ChromeDriver();
			getURLMax();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", pro.getProperty("IEpath"));
			driver=new InternetExplorerDriver(); 
			getURLMax();
			break;
		}
	}
	public void getURLMax()
	{
	   driver.get(pro.getProperty("URL"));
	   driver.manage().window().maximize();
	}

}

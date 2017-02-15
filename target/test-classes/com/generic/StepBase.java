package com.generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

/**
 * @ScriptName    : StepBase
 * @Description   : This class contains generic functionalities like setup/teardown test environment  
 * @Author        : Shreyas Patil
 * @Creation Date : 14 Feb 2017                       
 */
public class StepBase 
{
	// Local Variables
	protected static WebDriver driver = null;
	protected static WebDriverWait webDriverWait;
	protected static Scenario crScenario;
	private String browser = null;
	private String url = null;
	private String driverServerPath = null;

	/**
	 * @Method: setUp
	 * @Description:  This method is used to initialize test execution environment 
	 * 				 i.e. webdriver initialization, setting capabilities for selected device
	 * @author Shreyas Patil 
	 * @Creation Date:  14 Feb 2017
	 */
	public void setUp(Scenario cScenario)
	{
		crScenario = cScenario;
		try
		{
			// Load configuration file
			Properties objConfig = new Properties();
			objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/config.properties"));
			
			browser = objConfig.getProperty("test.browser");
			url = objConfig.getProperty("test.url");
			driverServerPath = System.getProperty("user.dir") + objConfig.getProperty("driverserverpath");
			System.out.println("Browser = " + browser);
			System.out.println("URL = " + url);
			System.out.println("Driver Server Path = " + driverServerPath);
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			if(browser.equalsIgnoreCase("ie"))
			{
				String OStype =System.getProperty("os.arch");
				if(OStype.contains("x86"))
				{
					System.setProperty("webdriver.ie.driver", driverServerPath + "//IEDriverServer_32bit.exe");
				}
				else
				{
					System.setProperty("webdriver.ie.driver", driverServerPath + "//IEDriverServer_64bit.exe");
				}
				capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				capabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);					
				driver = new InternetExplorerDriver(capabilities);
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				capabilities = DesiredCapabilities.firefox();
				capabilities.setJavascriptEnabled(true);
				driver = new FirefoxDriver(capabilities);
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", driverServerPath.concat("//chromedriver.exe"));
				capabilities = DesiredCapabilities.chrome();
				capabilities.setJavascriptEnabled(true);
				capabilities.setCapability("acceptSslCerts", true);
				capabilities.setCapability("ignoreZoomSetting", true);
				capabilities.setCapability("ignoreProtectedModeSettings", true);
				driver = new ChromeDriver(capabilities);
			}
			else
				throw new Exception("The " + browser + " browser is not supported. Try with another browser.");
			webDriverWait = new WebDriverWait(driver, 10L);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @Method: tearDown
	 * @Description: this method is used to close the appium driver instance. 
	 * @author Shreyas Patil 
	 * @throws Exception 
	 * @Creation Date:  14 Feb 2017
	 */
	public void tearDown(Scenario scenario) 
	{
		try 
		{
			if (scenario.isFailed()) 
			{
				embedScreenshot();
			}
			driver.manage().deleteAllCookies();
			driver.quit();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	/**
	 * @Method: getDriver
	 * @Description:  This method returns webdriver instance.
	 * @return :WebDriver instance
	 * @author Shreyas Patil
	 * @Creation Date:  14 Feb 2017
	 */
	public WebDriver getDriver()
	{
		return driver;
	}

	/**
	 * @Method: getDriver
	 * @Description:  This method returns webdriverwait instance.
	 * @return :WebDriverWait instance
	 * @author Shreyas Patil
	 * @Creation Date:  14 Feb 2017
	 */
	public WebDriverWait getWebdriverWait()
	{
		return webDriverWait;
	}

	/**	
	 * Method: embedScreenshot
	 * Description: This method attach screenshot to the cucumber report. 
	 * @author Shreyas Patil 
	 * @Creation Date:  14 Feb 2017
	 */
	public static void embedScreenshot()
	{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		crScenario.embed(screenshot, "image/png"); //stick it in the report
	}
}
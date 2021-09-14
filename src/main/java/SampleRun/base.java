package SampleRun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	
	public static Properties prop;
	public static WebDriver driver;
		
		public base()
		{
			 prop = new Properties();
			try {
				FileInputStream fip = new FileInputStream("D:\\JAVA\\J2EEworkspaceMars\\TatocAutomatedTask\\src\\main\\java\\Prperties\\config.properties");
			    try {
					prop.load(fip);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		
		
		public static WebDriver intialization() {
	       String browserName = prop.getProperty("browser");
	       
	       if(browserName.equals("chrome"));
	       {
	    	   System.setProperty("webdriver.chrome.driver", "E://selenium//chromedriver_win32//chromedriver_win32//chromedriver.exe");
	   		 driver = new ChromeDriver();
	       }
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	      //driver.manage().timeouts().pageLoadTimeout(TestUtilities.Page_Load_TimeOut, TimeUnit.SECONDS);
	       //driver.manage().timeouts().implicitlyWait(TestUtilities.Implicit_Wait, TimeUnit.SECONDS);
	       
	       driver.get(prop.getProperty("url"));
	       return driver;
		}

}

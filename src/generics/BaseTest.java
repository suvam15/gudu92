package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
  public WebDriver driver;
  
   @BeforeMethod
   public void openApp()
   {
	   //driver=new FirefoxDriver();
	   System.setProperty(chrome_key, chrome_value);
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.get(url);
   }
   
   @AfterMethod
   public void closeApp()
   {
	   //driver.quit();
   }
}

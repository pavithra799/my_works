package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements IAutoConst{
    public WebDriver driver;
    static{
    	System.setProperty(CHROME_KEY,CHROME_VALUE);
    	System.setProperty(GECKO_KEY, GECKO_VALUE);
    }
	@BeforeMethod
	public void openApplication(){
		driver=new ChromeDriver();
		String url = Lib.getProperty(CONFIG_PATH,"URL");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApplication(){
		driver.quit();
	}
}










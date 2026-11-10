package kerala_base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import kerala_page_pkg.Khome_page;
import kerala_page_pkg.Klogin_page;

public class Kerala_base 
{
	public static WebDriver driver;
	public Klogin_page kloginobj;
	public Khome_page khomeobj;
	
	
	@BeforeTest
	public void setup()
	{
		
		
		
		ChromeOptions option=new ChromeOptions (); 
		option.addArguments("--incognito");
		driver=new ChromeDriver(option);
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objects()
	{
		kloginobj=new Klogin_page(driver);
		khomeobj=new Khome_page(driver);
	}
	
	
	
	@AfterTest
	public void close()
	{
		driver.quit();
		
	}

}

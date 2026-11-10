package kerala_page_pkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Khome_page 
{
	WebDriver driver;
	Select obj;
	
	
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a") WebElement addprop;
	
//	property list presence
	@FindBy(xpath="//*[@id=\"proptype\"]") WebElement propertyFor; //dropdown
	@FindBy(xpath="//*[@id=\"listtype\"]") WebElement listingplan; //dropdown
	
//	property info
	@FindBy(xpath="//*[@id=\"proplabel\"]") WebElement propertylabel; //label
	@FindBy(xpath="//*[@id=\"propcategory\"]") WebElement category; //dropdown
	@FindBy(xpath="//*[@id=\"propcost\"]") WebElement expectedprice; //label
	@FindBy(xpath="//*[@id=\"propbeds\"]") WebElement noofbed; //label
	@FindBy(xpath="//*[@id=\"propbaths\"]") WebElement noofbath; //label
	@FindBy(xpath="//*[@id=\"district\"]") WebElement district; //dropdown
	@FindBy(xpath="//*[@id=\"proplocation\"]") WebElement location; //dropdown
	@FindBy(xpath="//*[@id=\"propaddress\"]") WebElement address; //label
	
//	property summary
	@FindBy(xpath="//*[@id=\"introlabel\"]") WebElement advertisment; //label
	
//	summary
	@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/ul/li[1]/a") WebElement heading;
	@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/ul/li[1]/ul/li[2]/a") WebElement heading1;
	@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/ul/li[2]/div/a[1]") WebElement bold;
	@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/iframe") WebElement iframe;
	@FindBy(xpath="/html/body") WebElement iframetxt;
	
	
	public Khome_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addpropMtd()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		addprop.click();
	}
	
	public void propertyListPresenceMtd()
	{
		obj=new Select(propertyFor);
		obj.selectByValue("rent");
		
		obj=new Select(listingplan);
		obj.selectByValue("featured");
	}
	
	public void propertyInfoMtd() throws Exception
	{
		
		propertylabel.sendKeys("bla bla black sheep");
		
		obj=new Select(category);
		obj.selectByValue("3");
		
		expectedprice.sendKeys("10,0000");
		
		noofbed.sendKeys("10");
		
		noofbath.sendKeys("6");
		
		obj=new Select(district);
		obj.selectByValue("3");
		
		Thread.sleep(3000);
		obj=new Select(location);
		obj.selectByValue("26");
		
		address.sendKeys("Arakkal house kannamali po kalathra");
	}
	
	public void propertySummaryMtd()
	{
		advertisment.sendKeys("lollipop");
	}
	
	public void summaryMtd() throws Exception
	{
		Actions act=new Actions(driver);
		act.moveToElement(heading).perform();
		
		heading1.click();
		
		bold.click();
		
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		iframetxt.sendKeys("hello");
		driver.switchTo().defaultContent();
		
		
	}
	
	

}

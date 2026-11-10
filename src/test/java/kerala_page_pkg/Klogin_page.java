package kerala_page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Klogin_page 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]") WebElement login_btn;
	
	public Klogin_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void loginMtd(String un,String ps)
	{
		username.sendKeys(un);
		password.sendKeys(ps);
		login_btn.click();
	}
	
	

}

package Pages.SearchPage.Arabic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.SearchPage.English.GoogleEnglishSearchPage;

public class GoogleArabicSearchPage extends GoogleEnglishSearchPage
{	
	public GoogleArabicSearchPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(linkText="العربية")
	private WebElement arabicLink;	

	@Override
	public void lunchSite()
	{
		this.driver.get("https://www.google.com.sa");
		this.arabicLink.click();		
	}
}

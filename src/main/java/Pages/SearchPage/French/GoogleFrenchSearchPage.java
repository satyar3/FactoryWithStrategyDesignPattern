package Pages.SearchPage.French;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.SearchPage.English.GoogleEnglishSearchPage;

public class GoogleFrenchSearchPage extends GoogleEnglishSearchPage
{
	public GoogleFrenchSearchPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(linkText="Français")
	private WebElement frechLink;
	
	@Override
	public void lunchSite()
	{
		this.driver.get("https://www.google.fr");
		this.frechLink.click();
		
	}
}

package Pages.SearchPage.English;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.AbstractPage.GoogleSearchPage;

public class GoogleEnglishSearchPage extends GoogleSearchPage
{	
	protected WebDriver driver;
	protected WebDriverWait wait;
	private GoogleEnglishSearchComponent googleEnglishSearchComponent;
	
	public GoogleEnglishSearchPage(final WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.googleEnglishSearchComponent = PageFactory.initElements(driver, GoogleEnglishSearchComponent.class);
		PageFactory.initElements(driver, this);
	}	

	@FindBy(css="div.rc")
	protected List<WebElement> searchResults;

	@Override
	public void lunchSite()
	{
		this.driver.get("https://www.google.com");		
	}

	@Override
	public void search(String keyword)
	{
		googleEnglishSearchComponent.search(keyword);
	}
}

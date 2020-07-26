package Pages.ResultPage.English;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.AbstractPage.GoogleResultPage;
import Pages.ResultPage.Common.SearchResultCountComponent;

public class GoogleEnglishResultPage extends GoogleResultPage
{
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	private SearchResultCountComponent searchResultCountComponent;
	
	public GoogleEnglishResultPage(final WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.searchResultCountComponent = PageFactory.initElements(driver, SearchResultCountComponent.class);
		PageFactory.initElements(driver, this);		
	}

	@Override
	public int getearchResultCount()
	{
		return searchResultCountComponent.getearchResultCount();
	}
}

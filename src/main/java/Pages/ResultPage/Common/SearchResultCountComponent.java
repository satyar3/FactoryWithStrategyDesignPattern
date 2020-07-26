package Pages.ResultPage.Common;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.AbstractPage.AbstractComponent;

public class SearchResultCountComponent extends AbstractComponent
{
	@FindBy(css="div.rc")
	private List<WebElement> searchResults;
	
	public SearchResultCountComponent(WebDriver driver)
	{
		super(driver);
	}
	
	public int getearchResultCount()
	{
		this.wait.until(driver -> searchResults.size()>0);
		return this.searchResults.size();
	}
}

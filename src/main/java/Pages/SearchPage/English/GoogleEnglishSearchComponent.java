package Pages.SearchPage.English;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.util.concurrent.Uninterruptibles;

import Pages.AbstractPage.AbstractComponent;

public class GoogleEnglishSearchComponent extends AbstractComponent
{
	@FindBy(name="q")
	protected WebElement searchBox;
	
	@FindBy(name="btnK")
	protected WebElement searchButton;
	
	public GoogleEnglishSearchComponent(WebDriver driver)
	{
		super(driver);
	}
	
	public void search(String keyword)
	{
		char[] chars = keyword.toCharArray();
		for (char c : chars)
		{
			Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
			this.searchBox.sendKeys(c+"");
		}
		this.wait.until(driver -> searchButton.isDisplayed());
		this.searchButton.click();		
	}
}

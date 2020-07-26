package Pages.SearchPage.Arabic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.SearchPage.English.GoogleEnglishSearchComponent;

public class GoogleArabicSearchComponent extends GoogleEnglishSearchComponent
{
	@FindBy(css="span.hOoLGe")
	private WebElement keyBoardBtn;
	
	@FindBy(id="kbd")
	private WebElement keyBoard;

	public GoogleArabicSearchComponent(WebDriver driver)
	{
		super(driver);
	}
	
	public void search(String keyword)
	{
		wait.until(dr -> this.keyBoardBtn.isDisplayed());
		this.keyBoardBtn.click();		
		wait.until(dr -> this.keyBoard.isDisplayed());
		super.search(keyword);
	}
}

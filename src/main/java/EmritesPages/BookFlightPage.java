package EmritesPages;

import org.openqa.selenium.By;

import EmritesTest.Base.DriverManager;

public class BookFlightPage
{	
	private By SEARCH_BTN = By.cssSelector("[aria-labelledby='lblSearch']"); 			
	
	public void goTo()
	{
		DriverManager.getDriver().get("https://fly10.emirates.com/CAB/IBE/SearchAvailability.aspx");
	}
	
	public void searchForAFlight()
	{
		DriverManager.getDriver().findElement(SEARCH_BTN).click();
	}
	
}

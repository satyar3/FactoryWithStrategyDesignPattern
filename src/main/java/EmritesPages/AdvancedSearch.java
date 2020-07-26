package EmritesPages;

import java.util.Map;

import org.openqa.selenium.By;

import EmritesTest.Base.DriverManager;

public class AdvancedSearch implements TypeOfTravel
{

	//Advance Search
	private By ADV_SEARCH_RADIO = By.cssSelector("#dvRadioMulti span");
	private By ADV_SEARCH_DEP_AIRPORT_1 = By.cssSelector("#dvFrom1 input[placeholder='Departure airport']");
	private By ADV_SEARCH_ARR_AIRPORT_1 = By.cssSelector("#dvTo1 input[placeholder='Arrival airport']");
	private By ADV_SEARCH_DATE_1 = By.cssSelector("#ctl00_c_CtWNW_txtD1");

	private By ADV_SEARCH_DEP_AIRPORT_2 = By.cssSelector("#dvFrom2 input[placeholder='Departure airport']");
	private By ADV_SEARCH_ARR_AIRPORT_2 = By.cssSelector("#dvTo2 input[placeholder='Arrival airport']");
	private By ADV_SEARCH_DATE_2 = By.cssSelector("#ctl00_c_CtWNW_txtD2");

	@Override
	public void fillJourneyDetails(Map<String, String> journeyDetals)
	{
		DriverManager.getDriver().findElement(ADV_SEARCH_RADIO).click();
		
		DriverManager.getDriver().findElement(ADV_SEARCH_DEP_AIRPORT_1).sendKeys(journeyDetals.get("depAirport1"));
		DriverManager.getDriver().findElement(ADV_SEARCH_ARR_AIRPORT_1).sendKeys(journeyDetals.get("arrAirport1"));
		DriverManager.getDriver().findElement(ADV_SEARCH_DATE_1).sendKeys(journeyDetals.get("searchDate1"));
		
		DriverManager.getDriver().findElement(ADV_SEARCH_DEP_AIRPORT_2).sendKeys(journeyDetals.get("depAirport2"));
		DriverManager.getDriver().findElement(ADV_SEARCH_ARR_AIRPORT_2).sendKeys(journeyDetals.get("arrAirport2"));
		DriverManager.getDriver().findElement(ADV_SEARCH_DATE_2).sendKeys(journeyDetals.get("searchDate2"));

	}

}

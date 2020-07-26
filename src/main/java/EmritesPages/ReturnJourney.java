package EmritesPages;

import java.util.Map;

import org.openqa.selenium.By;

import EmritesTest.Base.DriverManager;

public class ReturnJourney implements TypeOfTravel
{

	//Return Journey
	private By RETURN_RADIO = By.cssSelector(".fare-radio-row [for='returnSearch']");
	private By DEPARTURE_AIRPORT_INPUT = By.cssSelector("#dvFrom input[placeholder='Departure airport']");
	private By ARRIVAL_AIRPORT_INPUT = By.cssSelector("#dvTo input[placeholder='Arrival airport']");
	private By ARRIVAL_DATE = By.cssSelector("#txtarrivaldate");
	private By DEPART_DATE = By.cssSelector("#txtDepartDate");

	@Override
	public void fillJourneyDetails(Map<String, String> journeyDetals)
	{
		DriverManager.getDriver().findElement(RETURN_RADIO).click();
		DriverManager.getDriver().findElement(DEPARTURE_AIRPORT_INPUT).sendKeys(journeyDetals.get("departureAirport"));
		DriverManager.getDriver().findElement(ARRIVAL_AIRPORT_INPUT).sendKeys(journeyDetals.get("arrivalAirport"));
		DriverManager.getDriver().findElement(ARRIVAL_DATE).sendKeys(journeyDetals.get("arrivalDate"));
		DriverManager.getDriver().findElement(DEPART_DATE).sendKeys(journeyDetals.get("arrivalDate"));
	}

}

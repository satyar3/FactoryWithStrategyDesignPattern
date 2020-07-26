package EmritesPages;

import java.util.Map;

import org.openqa.selenium.By;

import EmritesTest.Base.DriverManager;

public class OneWayJourney implements TypeOfTravel
{

	//One way
	private By ONE_WAY_RADIO = By.cssSelector("#dvRadioOneway span");
	private By DEPARTURE_AIRPORT_INPUT = By.cssSelector("#dvFrom input[placeholder='Departure airport']");
	private By ARRIVAL_AIRPORT_INPUT = By.cssSelector("#dvTo input[placeholder='Arrival airport']");
	private By DEPART_DATE = By.cssSelector("#txtDepartDate");

	@Override
	public void fillJourneyDetails(Map<String, String> journeyDetals)
	{
		DriverManager.getDriver().findElement(ONE_WAY_RADIO).click();
		DriverManager.getDriver().findElement(DEPARTURE_AIRPORT_INPUT).sendKeys(journeyDetals.get("departureAirport"));
		DriverManager.getDriver().findElement(ARRIVAL_AIRPORT_INPUT).sendKeys(journeyDetals.get("arrivalAirport"));
		DriverManager.getDriver().findElement(DEPART_DATE).sendKeys(journeyDetals.get("arrivalDate"));
	}

}

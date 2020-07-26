package EmritesTest.Base;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import EmritesPages.BookFlightPage;
import EmritesPages.BookingFactory;
import EmritesPages.TypeOfTravel;

public class Test1 extends BaseTest
{
	BookFlightPage bookingFlightPage;
	
	@Test
	public void test(String journeyType, HashMap<String, String> data)
	{
		bookingFlightPage = new BookFlightPage();
		bookingFlightPage.goTo();
		
		TypeOfTravel travelType = BookingFactory.getJournetData(journeyType);
		travelType.fillJourneyDetails(data);	
		
		bookingFlightPage.searchForAFlight();
	}
	
	
	@DataProvider
	public Object[][] testData()
	{
		HashMap<String, String> onewayData = new HashMap<>();
		onewayData.put("arrivalAirport", "HKG");
		onewayData.put("departureAirport", "LHR");
		onewayData.put("arrivalDate", "11 Jul 2020");	
		
		HashMap<String, String> returnData = new HashMap<>();
		onewayData.put("arrivalAirport", "HKG");
		onewayData.put("departureAirport", "LHR");
		onewayData.put("arrivalDate", "11 Jul 2020");	
		
		HashMap<String, String> advSearchData = new HashMap<>();
		onewayData.put("arrivalAirport", "HKG");
		onewayData.put("departureAirport", "LHR");
		onewayData.put("arrivalDate", "11 Jul 2020");	
		
		return new Object[][]{
				{"onewayData", onewayData},
				{"returnData", returnData},
				{"advSearchData", advSearchData},
		};
	}
}

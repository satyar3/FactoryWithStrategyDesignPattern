package EmritesPages;

import java.util.HashMap;
import java.util.function.Supplier;

public class BookingFactory
{
	private final static Supplier<TypeOfTravel> ONE_WAY_SUP = () -> new OneWayJourney();
	private final static Supplier<TypeOfTravel> RETTURN_SUP = () -> new ReturnJourney();
	private final static Supplier<TypeOfTravel> ADV_SEARCH_SUP = () -> new AdvancedSearch();
	
	private static HashMap<String, Supplier<TypeOfTravel>> onewayMap = new HashMap<>();
	
	static
	{
		onewayMap.put("onewayData", ONE_WAY_SUP);
		onewayMap.put("returnData", RETTURN_SUP);
		onewayMap.put("advSearchData", ADV_SEARCH_SUP);		
	}
	
	public static TypeOfTravel getJournetData(String journeyName)
	{
		return onewayMap.get(journeyName).get();
	}
}

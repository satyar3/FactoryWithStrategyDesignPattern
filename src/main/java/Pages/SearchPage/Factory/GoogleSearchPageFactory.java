package Pages.SearchPage.Factory;

import java.util.HashMap;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

import Pages.AbstractPage.GoogleSearchPage;
import Pages.SearchPage.Arabic.GoogleArabicSearchPage;
import Pages.SearchPage.English.GoogleEnglishSearchPage;
import Pages.SearchPage.French.GoogleFrenchSearchPage;

public class GoogleSearchPageFactory
{
	private static final Function<WebDriver,GoogleSearchPage> ENGLISH = driver -> new GoogleEnglishSearchPage(driver);
	private static final Function<WebDriver,GoogleSearchPage> FRENCH = driver -> new GoogleFrenchSearchPage(driver);
	private static final Function<WebDriver,GoogleSearchPage> ARABIC = driver -> new GoogleArabicSearchPage(driver);
	
	private static final HashMap<String, Function<WebDriver,GoogleSearchPage>> LANGUAGE_MAP = new HashMap<>();
	
	static
	{
		LANGUAGE_MAP.put("english", ENGLISH);
		LANGUAGE_MAP.put("french", FRENCH);
		LANGUAGE_MAP.put("arabic", ARABIC);
	}
	
	
	public static GoogleSearchPage get(String language, WebDriver driver)
	{
		return LANGUAGE_MAP.get(language).apply(driver);
	}
}

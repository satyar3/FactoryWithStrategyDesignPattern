package Pages.ResultPage.Factory;

import java.util.HashMap;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

import Pages.AbstractPage.GoogleResultPage;
import Pages.ResultPage.Arabic.GoogleArabicResultPage;
import Pages.ResultPage.English.GoogleEnglishResultPage;
import Pages.ResultPage.French.GoogleFrenchResultPage;

public class GoogleResultFactory
{
	private static final Function<WebDriver,GoogleResultPage> ENGLISH = driver -> new GoogleEnglishResultPage(driver);
	private static final Function<WebDriver,GoogleResultPage> FRENCH = driver -> new GoogleFrenchResultPage(driver);
	private static final Function<WebDriver,GoogleResultPage> ARABIC = driver -> new GoogleArabicResultPage(driver);
	
	private static final HashMap<String, Function<WebDriver,GoogleResultPage>> LANGUAGE_MAP = new HashMap<>();
	
	static
	{
		LANGUAGE_MAP.put("english", ENGLISH);
		LANGUAGE_MAP.put("french", FRENCH);
		LANGUAGE_MAP.put("arabic", ARABIC);
	}
	
	
	public static GoogleResultPage get(String language, WebDriver driver)
	{
		return LANGUAGE_MAP.get(language).apply(driver);
	}
}

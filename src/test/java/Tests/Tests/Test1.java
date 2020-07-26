package Tests.Tests;

import org.testng.annotations.Test;

import Pages.AbstractPage.GoogleResultPage;
import Pages.AbstractPage.GoogleSearchPage;
import Pages.ResultPage.Factory.GoogleResultFactory;
import Pages.SearchPage.Factory.GoogleSearchPageFactory;
import Tests.Base.BaseTest;

public class Test1 extends BaseTest
{
	@Test
	public void googleTest()
	{
		GoogleSearchPage googleSearchPage  = GoogleSearchPageFactory.get("french", driver);
		googleSearchPage.lunchSite();
		googleSearchPage.search("Selenium");
		GoogleResultPage googleResultPage  = GoogleResultFactory.get("french", driver);		
		int count = googleResultPage.getearchResultCount();
		
		System.out.println(count);
	}
}

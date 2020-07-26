package Pages.AbstractPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//Single Responsibility pattern
public abstract class AbstractComponent
{	
	protected WebDriverWait wait;	
	protected AbstractComponent(final WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
	}
	
	//public abstract boolean isDisplayed();
}

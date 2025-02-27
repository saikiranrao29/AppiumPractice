package Android_Practice;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
	
	public static void visibilityOf(WebElement locator,int seconds){
		
			WebDriverWait wait = new WebDriverWait(InstallApp_Android.driver, Duration.ofSeconds(seconds));
			wait.until(ExpectedConditions.visibilityOf(locator));
	}
	
	public static void elementToBeClickable(WebElement locator,int seconds){
		
		WebDriverWait wait = new WebDriverWait(InstallApp_Android.driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
public static void invisibilityOf(WebElement locator,int seconds){
		
		WebDriverWait wait = new WebDriverWait(InstallApp_Android.driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.invisibilityOf(locator));
	}
	
}

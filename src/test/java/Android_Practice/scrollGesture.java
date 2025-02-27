package Android_Practice;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class scrollGesture extends InstallApp_Android{

	@Test
	public void scroll() throws MalformedURLException, URISyntaxException, InterruptedException {
		

		//I)By androidUIAutomator //Will Use When Where you know the exact location to scroll
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		String stext="WebView";
		scrolltotext (stext);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']")).click();
		
		//=================================================================================================================================//
		//II)By JavaScript Executor //Will Use only till your element found/till your co-ordinates //will use when that element is still exists or not 
		// need to keep on check if that element is exists or not 
		
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
		
		WebElement element= driver.findElement(By.xpath("//android.widget.TextView[@text='Sweep']"));
		scrolluntilelement(element);
	}
}

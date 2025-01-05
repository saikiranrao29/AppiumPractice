package Android_APIDemos_Application;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class copyToClipboard extends InstallApp{
	@Test
	public static void copytoclipboard() throws MalformedURLException, URISyntaxException{

		driver.findElement(AppiumBy.accessibilityId("OS")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Morse Code']")).click();
		String copyText=driver.findElement(AppiumBy.id("io.appium.android.apis:id/button")).getText();
		
		//copying to clipboard by set
		driver.setClipboardText(copyText);
		
		//sending those copy text to text box by using get 
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/text")).sendKeys(driver.getClipboardText());
	}

}

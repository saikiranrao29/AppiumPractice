package Android_APIDemos_Application;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class keyEvents extends InstallApp{
@Test
	public static void pressKeys() throws MalformedURLException, URISyntaxException {
		
		String apppackage= driver.getCurrentPackage();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		KeyEvent back =new KeyEvent(AndroidKey.BACK);
		KeyEvent home= new KeyEvent(AndroidKey.HOME);
		driver.pressKey(back);
		driver.pressKey(home);
		
		driver.activateApp(apppackage);
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Preferences from XML")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='An example that uses an edit text dialog']")).click();
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Text1-Line");
	
		KeyEvent enter= new KeyEvent(AndroidKey.ENTER);
		driver.pressKey(enter);
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("Text2-Line");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
		
		
	}
}

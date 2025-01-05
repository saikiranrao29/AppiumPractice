package Android_APIDemos_Application;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class rotateScreen extends InstallApp{

	@Test
	public static void landscapemode() throws MalformedURLException, URISyntaxException {
		
		DeviceRotation landscape=new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		
		//views>>Buttons>>OFF>>ON
		String stext="Views";
		scrolltotext(stext);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Buttons']")).click();
		
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/button_toggle")).getText().equals("OFF");
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/button_toggle")).click();
		driver.findElement(AppiumBy.id("io.appium.android.apis:id/button_toggle")).getText().equals("ON");	
		
		DeviceRotation portrait=new DeviceRotation(0, 0, 0);
		driver.rotate(portrait);
	}
	
	
	public static void method() throws InterruptedException{ 
	
		
		driver.activateApp("com.whatsapp");
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.PORTRAIT);
		Thread.sleep(2000);
		
	}
	
	
}

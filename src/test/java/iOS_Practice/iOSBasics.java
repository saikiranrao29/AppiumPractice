package iOS_Practice;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class iOSBasics extends InstallApp_iOS{

	@Test
	public static void locators() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		InstallApplication();
		//driver.findElement(By.className("XCUIElementTypeButton")).click();
		driver.findElement(AppiumBy.className("XCUIElementTypeButton")).click();
	}

}

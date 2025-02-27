package Java_Practices;

import org.testng.annotations.Test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class InstallStreamsApp{
	
	@Test
	public void Test1() throws MalformedURLException, URISyntaxException, InterruptedException{
		
		//To Start the Appium Service Automatically 
		AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Saikiran\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		//2.Create UiAutomar for App capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel7Pro");
		options.setApp("C:\\Users\\Saikiran\\eclipse-workspace\\Streams\\src\\test\\java\\resourses\\Streams_Android_Production.apk");
		
		//We need to Give the following AppActivity or AppPackage Details if the appium server is failed to get the proper package/activity details due to default apppackage/activity provided by the application
		
		
		options.setAppPackage("com.panterra.mobile.streams");
		options.setAppActivity("com.panterra.mobile.streams.MainActivity");

		//1.Create the AndroidDriver now
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
		//System.out.println("current package is" +driver.getCurrentPackage());
//		driver.findElement(By.id("com.panterra.mobile.streams:id/username")).sendKeys("saikiranone@dcwvalidation");
//		driver.findElement(By.id("com.panterra.mobile.streams:id/password")).sendKeys("sai@1234");
//		driver.findElement(By.id("com.panterra.mobile.streams:id/login")).click();
		
		//Checking WelcomeScreen
		driver.findElement(By.id("com.panterra.mobile.streams:id/intro_background")).isDisplayed();
		//Clicked on Got it option
		driver.findElement(By.id("com.panterra.mobile.streams:id/btn_next")).click();
		
		
//		
//		driver.quit();
//		service.stop();
	}

}

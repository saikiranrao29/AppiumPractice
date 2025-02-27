package iOS_Practice;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class checks {

	@Test
	public static void appiumservercheck() throws InterruptedException, MalformedURLException, URISyntaxException {
		
		
		AppiumDriverLocalService Service= new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4732).build();
		//Service.start();
		Thread.sleep(5000);
		//assertEquals(Service.isRunning(), true);
		
		if(Service.isRunning() == true)
		{
			System.out.println("Appium Service is Started Succesfully");
			
		}
		else if (Service.isRunning()== false)
		{
			System.out.println("Appium Service is Not Started");
		}
		Thread.sleep(2000);
		
		Service.stop();
		Thread.sleep(2000);
		
		if(Service.isRunning() == false)
		{
			System.out.println("Appium Service is Stopeed Succesfully");
			
		}
		else if (Service.isRunning()== true)
		{
			System.out.println("Appium Service is still running ===== Action Required");
		}
		
		
		XCUITestOptions options = new XCUITestOptions();
		options.setApp("//Users//saikiran_rao//Documents//iOSApps//UIKitCatalog.app");
		options.setDeviceName("iPhone 16 Pro");
		options.setPlatformVersion("18.2");
		options.setWdaLaunchTimeout(Duration.ofSeconds(5000));
		
		IOSDriver driver =new IOSDriver(new URI("http://127.0.0.1:4732/").toURL(),options);
		
		System.out.println(driver.getBatteryInfo());
	}
	
	@Test
	public static void fromInstall() throws InterruptedException{
		
	//Manually Service Checks
		AppiumDriverLocalService Service= new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js")).withIPAddress("127.0.0.1").usingPort(4732).build();
		Service.start();
		Thread.sleep(5000);
		boolean check= Service.isRunning();
		System.out.println(check);
		
	}
	
}

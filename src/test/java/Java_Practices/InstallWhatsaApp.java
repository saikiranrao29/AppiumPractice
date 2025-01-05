package Java_Practices;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class InstallWhatsaApp {
		
		@Test
		public void Test1() throws MalformedURLException, URISyntaxException, InterruptedException{
			
			//To Start the Appium Service Automatically 
			AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Saikiran\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
			service.start();
			
			//2.Create UiAutomar for App capabilities
			UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("Pixel7Pro");
			options.setApp("C:\\Users\\Saikiran\\eclipse-workspace\\Streams\\src\\test\\java\\resourses\\Whatsapp.apk");
			
			//We need to Give the following AppActivity or AppPackage Details if the Appium server is failed to get the proper package/activity details due to default apppackage/activity provided by the application is not matching during the execution
			options.setAppActivity("com.whatsapp.Main");
			options.setAppPackage("com.whatsapp");

			//1.Create the AndroidDriver now
			AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
			
			driver.quit();
			service.stop();

	}
		@Test
		public void Test(){
		
			System.out.println("Test1");
		
		}
}

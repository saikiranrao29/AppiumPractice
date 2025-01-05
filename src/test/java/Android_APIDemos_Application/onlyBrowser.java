package Android_APIDemos_Application;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class onlyBrowser {
	@Test
	public static void chromebrowseropen() throws MalformedURLException, URISyntaxException {
	
		UiAutomator2Options options= new UiAutomator2Options();
		
		options.setDeviceName("Pixel7Pro");
		//options.setApp("C:\\Users\\Saikiran\\eclipse-workspace\\Streams\\src\\test\\java\\resourses\\General_Store.apk");
		//options.setCapability("chromedriver_autodownload", true);
		//WebDriverManager.chromedriver().driverVersion("129.0.6668.59").setup();
		//options.setCapability("browserVersion", "131.0.6778.85");
		//options.setChromedriverExecutable("D:\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe");
		
		//options.setCapability("chromedriver_autodownload", true);
		//options.setCapability("browserName","Chrome");
		//options.setAutomationName("Gecko");
		options.setCapability("browserName","Firefox");

		//Set Android Driver to Install the Application (URL,Capabilities)
		AndroidDriver driver =new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(),options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.google.com/");
	}
}

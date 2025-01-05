package Streams_AndroidApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base1 {
	
	public static AndroidDriver driver;
	public AppiumDriverLocalService service;
	public WebDriverWait wait;
	
	@BeforeClass
	@Test
	public void Configure() throws MalformedURLException, URISyntaxException{
		
	//Start the Appium Service
	service =new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Saikiran\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4732).build();
	//service.start();
	
	//Set Capabilities
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Pixel7Pro");
	options.setApp("C:\\Users\\Saikiran\\eclipse-workspace\\Streams\\src\\test\\java\\resourses\\Streams_Android_Production.apk");
	//Set the App Pakage & Activity as well - as these are not matching for Streams App
	options.setAppPackage("com.panterra.mobile.streams");
	options.setAppActivity("com.panterra.mobile.streams.MainActivity");
	
	//set the Android Driver
	driver =new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
	
	//Implicit Wait (2 Min)
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	//Explicity wait for 20 seconds
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
}
	public  void acceptPermissions() throws InterruptedException {
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_all_button")).click();
		Thread.sleep(1000);
	}

	public void longPress(WebElement elementtolongpress) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",ImmutableMap.of("elementId",((RemoteWebElement)elementtolongpress).getId(),"duration",2000));
	}
	
	public void scrollToElement() {
		//Scroll to a Particular Element
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"02022024\"))"));
	}
	
	public void scrollEndAction() {
		
		boolean canScrollMore;
		
		do {
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 1.0      ));
		}
		while(canScrollMore);
	} 

	@AfterClass
	public void Down() throws InterruptedException
	{
		//driver.quit();
		//service.stop();
	}
}

package Android_Practice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.testng.annotations.Test;

public class appStates extends InstallApp_Android{
@Test
	public static void get() throws InterruptedException {
		
        System.out.println(driver.getCurrentPackage());
        Thread.sleep(3000);
       
        driver.terminateApp("com.panterra.mobile.streams");
        //driver.executeScript("mobile: terminateApp", Map.of("appId", "com.panterra.mobile.streams"));
        Thread.sleep(3000);
        
        String appState= driver.queryAppState("com.panterra.mobile.streams").toString();
        System.out.println(appState);
        AssertJUnit.assertEquals(appState,"NOT_RUNNING"); 
        Thread.sleep(3000);
        
        driver.activateApp("com.panterra.mobile.streams");
        appState= driver.queryAppState("com.panterra.mobile.streams").toString();
        AssertJUnit.assertEquals(appState,"RUNNING_IN_FOREGROUND");
        System.out.println(appState);
        Thread.sleep(3000);
        
        driver.runAppInBackground(Duration.ofSeconds(-1));
        appState= driver.queryAppState("com.panterra.mobile.streams").toString();
        AssertJUnit.assertEquals(appState,"RUNNING_IN_BACKGROUND");
        System.out.println(appState);
        Thread.sleep(3000);
        
        driver.installApp("C:\\Users\\Saikiran\\eclipse-workspace\\Streams\\src\\test\\java\\resourses\\ApiDemos_debug.apk");
        Thread.sleep(5000);
        driver.isAppInstalled("com.androidsample.generalstore");

	}
}

package Android_APIDemos_Application;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class typesOfInstalls extends InstallApp{
	@Test
	public static void intstall() throws MalformedURLException, URISyntaxException, InterruptedException {
		//1.setapp()
		
		//2. using installApp()
        driver.installApp("C:\\Users\\Saikiran\\eclipse-workspace\\Streams\\src\\test\\java\\resourses\\General_Store.apk");
        Thread.sleep(5000);
        assertTrue(driver.isAppInstalled("com.androidsample.generalstore"));  
        
        //3. executescript (mobile : installapp)
        driver.executeScript("mobile:installApp", ImmutableMap.of("appPath","C:\\Users\\Saikiran\\eclipse-workspace\\Streams\\src\\test\\java\\resourses\\ApiDemos_debug.apk"));
        Thread.sleep(5000);
        assertTrue(driver.isAppInstalled("io.appium.android.apis")); 
        
        //========================Uninstall
        //uninstall by remove
        driver.removeApp("com.androidsample.generalstore");
        Thread.sleep(5000);
        assertFalse(driver.isAppInstalled("com.androidsample.generalstore"));  
	
        
        //uninstall by execute mobile :
        driver.executeScript("mobile: removeApp", ImmutableMap.of("appId", "io.appium.android.apis"));
        Thread.sleep(5000);
        assertFalse(driver.isAppInstalled("io.appium.android.apis")); 
        
	}
	
	
	
}

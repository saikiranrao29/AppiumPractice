package Android_Practice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class openAnyAppScreen extends InstallApp_Android{
	@Test
	public static void openScreen(String appPackage,String appActivity) {		
		driver.executeScript("mobile: startActivity", ImmutableMap.of("appPackage", appPackage, 
			    "appActivity", appActivity));   
	}

	public void openScreen1(String appPackage,String appActivity) {		
		driver.executeScript("mobile: startActivity", ImmutableMap.of("intent", appPackage+"/"+appActivity));   
	}
	
	
}

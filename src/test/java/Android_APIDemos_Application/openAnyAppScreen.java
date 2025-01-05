package Android_APIDemos_Application;

import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class openAnyAppScreen extends InstallApp{
	@Test
	public static void openScreen(String appPackage,String appActivity) {		
		driver.executeScript("mobile: startActivity", ImmutableMap.of("appPackage", appPackage, 
			    "appActivity", appActivity));   
	}

	public void openScreen1(String appPackage,String appActivity) {		
		driver.executeScript("mobile: startActivity", ImmutableMap.of("intent", appPackage+"/"+appActivity));   
	}
	
	
}

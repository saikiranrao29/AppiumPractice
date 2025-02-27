package iOS_Practice;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.Map;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class getBundleID extends InstallApp_iOS{

	@Test
	public static void bundleId() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		InstallApplication();
		Map<String, Object> activeInfo = (Map<String, Object>) driver.executeScript("mobile: activeAppInfo");

		//driver.executeScript("mobile: activeInfo", ImmutableMap.of());
		activeInfo.forEach((key, value) -> System.out.println(key + " : " + value));
	}

}


package Android_Practice;

import org.testng.annotations.Test;
import static org.testng.Assert.assertNotEquals;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class appPermissions extends InstallApp_Android{

	@Test
	public static void acceptPermissions() throws MalformedURLException, URISyntaxException {
		
		InstallApplication();
		
		driver.findElement(By.id("com.panterra.mobile.streams:id/intro_background")).isDisplayed();
		driver.findElement(By.id("com.panterra.mobile.streams:id/btn_next")).click();
		driver.findElement(By.id("com.panterra.mobile.streams:id/username")).sendKeys("saikiranfive@dcwvalidation");
		driver.findElement(By.id("com.panterra.mobile.streams:id/password")).sendKeys("$Ai@1234");
		driver.findElement(By.id("com.panterra.mobile.streams:id/login")).click();

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Preparing content...']")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Downloading content...']")));

		driver.findElement(By.id("com.panterra.mobile.streams:id/appbarlayout_id")).isDisplayed();
		
		String statusname= driver.findElement(By.id("com.panterra.mobile.streams:id/tv_ab_subtitle")).getText();
		assertNotEquals(statusname,"Connecting...");

		
	}

}

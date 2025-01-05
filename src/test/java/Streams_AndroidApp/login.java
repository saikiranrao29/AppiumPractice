package Streams_AndroidApp;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends Base1{
	
	@Test
	public void Login() throws InterruptedException {
		driver.findElement(By.id("com.panterra.mobile.streams:id/intro_background")).isDisplayed();
		driver.findElement(By.id("com.panterra.mobile.streams:id/btn_next")).click();
		driver.findElement(By.id("com.panterra.mobile.streams:id/username")).sendKeys("saikiranfive@dcwvalidation");
		driver.findElement(By.id("com.panterra.mobile.streams:id/password")).sendKeys("sai@1234");
		driver.findElement(By.id("com.panterra.mobile.streams:id/login")).click();

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Preparing content...']")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Downloading content...']")));
		acceptPermissions();
		driver.findElement(By.id("com.panterra.mobile.streams:id/appbarlayout_id")).isDisplayed();
		
		String statusname= driver.findElement(By.id("com.panterra.mobile.streams:id/tv_ab_subtitle")).getText();
		assertNotEquals(statusname,"Connecting...");

	}
}

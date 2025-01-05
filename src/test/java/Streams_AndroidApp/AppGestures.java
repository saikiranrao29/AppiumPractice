package Streams_AndroidApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppGestures extends Base1{

	@Test
	public void longPress() throws InterruptedException {
		
		//Login to the Application
		login l=new login();
		l.Login();
		
		//LongPress Action
		WebElement elementtolongpress =driver.findElement(By.xpath("//android.widget.TextView[@text='saikiransix@dcwvalidation']"));
		
		//LongPress
		l.longPress(elementtolongpress);

		String count=driver.findElement(By.id("com.panterra.mobile.streams:id/action_bar_title")).getText().trim();
		Assert.assertEquals(count,"1");
		Assert.assertTrue((driver.findElement(By.id("com.panterra.mobile.streams:id/chkBox"))).isDisplayed());
		driver.findElement(By.id("com.panterra.mobile.streams:id/recent_temp_group")).isDisplayed();
		Thread.sleep(2000);
		
		//Tap on the Back Button
		driver.findElement(AppiumBy.accessibilityId("Done")).click();

	}
	
	@Test
	public void scroll() throws InterruptedException {
		
		//Login to the Application
		login l=new login();
		l.Login();
		//LongPress Action
			//1.By Using UIAutomator methods
			//2.By jscript
		
		//1.UIAutomator- will use where to scroll i.e., prior data 
			driver.findElement(AppiumBy.accessibilityId("Buddies")).click();
			String scrollText="02022024";
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + scrollText + "\"))"));
			
		//2.By jscript- will use where no prior data is present but scroll until end
			scrollEndAction();
	}
	@Test
	public void swipe() throws InterruptedException {
		
		login l=new login();
		l.Login();
		
		driver.findElement(By.id(""));
		
		
	}
}
	

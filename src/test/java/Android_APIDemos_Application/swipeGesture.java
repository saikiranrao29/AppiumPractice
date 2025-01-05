package Android_APIDemos_Application;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class swipeGesture extends InstallApp {
	@Test
	public static void swipe() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	
		WebElement firstImage = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		
		String s1=driver.findElement(By.xpath("//android.widget.ImageView[1]")).getDomAttribute("focusable");
		assertEquals(s1,true); 
		Thread.sleep(2000);
		
		String swipeDirection="left";
		swipeleft(swipeDirection,firstImage);
		String s2 = driver.findElement(By.xpath("//android.widget.ImageView[1]")).getDomAttribute("focusable");
		assertEquals(s2,false);
	}

}

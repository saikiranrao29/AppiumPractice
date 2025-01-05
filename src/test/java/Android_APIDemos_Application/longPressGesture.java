package Android_APIDemos_Application;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class longPressGesture extends InstallApp{
	
	@Test
	public void longPress() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement longpress=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longpressaction(longpress);
		
		String text =driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		Assert.assertEquals(text,"Sample menu");
		
		driver.navigate().back();
		WebElement longpress2=driver.findElement(By.xpath("//android.widget.TextView[@text='Fish Names']"));
		longpressaction(longpress2);
		String text2 =driver.findElement(By.xpath("//android.widget.TextView[@text='Sample menu']")).getText();
		Assert.assertEquals(text2,"Sample menu");
	}
}

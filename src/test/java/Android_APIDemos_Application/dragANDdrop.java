package Android_APIDemos_Application;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class dragANDdrop extends InstallApp{
	
	@Test
	public static void DragAndDrop() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
		String text= driver.findElement(By.xpath("//android.widget.TextView[@text='Views/Drag and Drop']")).getText();
		Assert.assertEquals(text,"Views/Drag and Drop");
		
		WebElement dragElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		int dropX=930;
		int dropY=1060;
		
		DragDrop(dragElement,dropX,dropY);
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='io.appium.android.apis:id/drag_result_text']")).getText(), "Dropped!");
	
	}

}

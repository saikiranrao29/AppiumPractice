package Android_Practice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.openqa.selenium.By;

//General Store E-Commerse Application

public class eCommerse_tc_1 extends InstallApp_Android{
	@Test
	public static void FillForm() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		driver.findElement(By.id("android:id/text1")).click();
	
		String stext="Argentina";
		scrolltotext(stext);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
	
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toastmessage= driver.findElement(By.xpath("//android.widget.Toast[1]")).getDomAttribute("name");
		AssertJUnit.assertEquals(toastmessage,"Please enter your name");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sai Kiran Rao");
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Products']")).isDisplayed();
	}
}

package Android_Practice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class alerts extends InstallApp_Android{
//a
	@Test(priority = 1)
	public static void all() throws MalformedURLException, URISyntaxException, InterruptedException{
		
		InstallApplication();
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@text='App/Alert Dialogs']")).getText(), "App/Alert Dialogs");
	}
	
	@Test(priority = 2)
	public static void option1() {
		//Option1
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		System.out.println("Test Case-1");
	}
		
	@Test(priority = 3)
	public static void option2(){	
		//Option2
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
		driver.findElement(AppiumBy.id("android:id/button2")).click();
		System.out.println("Test Case-2");
	}
	
	@Test(priority = 4)
	public static void option3(){
		//Option3
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
		driver.findElement(AppiumBy.id("android:id/button3")).click();
		System.out.println("Test Case-3");
	}
	
	@Test(priority = 5)
	public static void option4() {
		
		//Option4
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='List dialog']")).click();
		WebElement element =driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1'][1]"));
		
		 //From List Command one
		String text;
		text= element.getText();
		//System.out.println("First PopUp Text is="+text);
		element.click();
		
		//from popup
		String fulltext= driver.findElement(AppiumBy.id("android:id/message")).getText(); //You selected: 0 , Command one
		String[] split1 = fulltext.split(",");   //'You selected: 0 'AND' Command one'
		String halftext=split1[1]; // ' Command one'
		String FinalText=halftext.replaceFirst("^\\s+", ""); //'Command one'
		//System.out.println("Final Pop Text is="+FinalText);
			
			//checking both first & second text's are same or not
			AssertJUnit.assertEquals(FinalText,text);
			driver.navigate().back();
			System.out.println("Test Case-4");
		}

	@Test(priority = 5)
	public static void option5(){
		//Option5
		WebElement locator= driver.findElement(AppiumBy.accessibilityId("Progress dialog"));
		explicitWait.visibilityOf(locator, 10); 
		locator.click();
		driver.navigate().back();
		System.out.println("Test Case-5");
		}
	
	@Test(priority = 6)
	public static void option6() {
		//Option6
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		String s= driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Map']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(s,true);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Satellite']")).click();
		String p = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Satellite']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(p,true);
		String q = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Map']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(q,true);
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		System.out.println("Test Case-6");
	}
	
	@Test(priority = 7)
	public static void option7() {
		//Option7

		driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
		String x = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Monday']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(x,false);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Monday']")).click();
		
		String x1 = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Monday']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(x1,true);
		
		String x2 = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Tuesday']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(x2,true);
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Tuesday']")).click();
		
		String x3 =driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Tuesday']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(x3,false);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
		String d1= driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Monday']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(d1,true);
		
		String d2=driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Every Tuesday']")).getDomAttribute("checked");
		AssertJUnit.assertEquals(d2,false);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		System.out.println("Test Case-7");
	}
	@Test(priority = 8)
		public static void option8() throws MalformedURLException, URISyntaxException {
			//Option8
			driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
			String name="SaiKiranRao";
			driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit")).sendKeys(name);
			driver.findElement(AppiumBy.id("io.appium.android.apis:id/password_edit")).sendKeys("abc@1234");
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			
			driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
			driver.findElement(AppiumBy.id("io.appium.android.apis:id/username_edit")).getText().equals(name);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			System.out.println("Test Case-8");
		}
		
	@Test(priority = 10)
		public static void option10(){
			//Option10
			driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with traditional theme")).click();
			driver.findElement(AppiumBy.id("android:id/button1")).click();
			System.out.println("Test Case-10");
		}
	
	@Test(priority = 11)
		public static void option11() throws MalformedURLException, URISyntaxException {
			//Option11
			driver.findElement(AppiumBy.id("io.appium.android.apis:id/two_buttons_holo_light")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1']")).click();
			System.out.println("Test Case-11");
	}
}

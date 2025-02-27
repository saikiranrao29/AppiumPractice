package iOS_Practice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;

public class iOSAppGestures extends InstallApp_iOS{

	@Test
	public static void iOSLongPress() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		InstallApplication();
		
		driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
		WebElement longPressElement= driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Increment\"`][3]"));
		
		((JavascriptExecutor) driver).executeScript("mobile: touchAndHold", 
			    ImmutableMap.of(
			        "elementId", ((RemoteWebElement) longPressElement).getId(),
			        "duration", 5000  
			    ));
	}
	@Test
 	public static void iOSScroll() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		InstallApplication();
		Thread.sleep(2000);
		
		WebElement scrollToElement= driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Web View'"));
		
		Map<String,Object> scrollparams = new HashMap<>();
		scrollparams.put("element", ((RemoteWebElement)scrollToElement).getId());
		scrollparams.put("direction","down");
		
		driver.executeScript("mobile:scroll", scrollparams);
		
		
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.iOSNsPredicateString("name == 'Web View'")));    
	
		AssertJUnit.assertEquals(scrollToElement.isDisplayed(), true);
		System.out.println(scrollToElement.isDisplayed());
		driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Web View'")).click();
		
		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"UIKitCatalog\"`]")).click();
		
	}
	
	@Test
	public static void iOSPicker() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		InstallApplication();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("40");
		driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("200");
		driver.findElement(AppiumBy.accessibilityId("Blue color component value")).sendKeys("80");
		
		AssertJUnit.assertEquals(driver.findElement(AppiumBy.accessibilityId("Red color component value")).getText(), "40");
		AssertJUnit.assertEquals(driver.findElement(AppiumBy.accessibilityId("Green color component value")).getText(), "200");
		AssertJUnit.assertEquals(driver.findElement(AppiumBy.accessibilityId("Blue color component value")).getText(), "80");
	}
	
	@Test
	public static void iOSSlide() throws MalformedURLException, URISyntaxException, InterruptedException {
	
		InstallApplication();
		WebElement sliderIcon= driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`name == 'AppElem'`]"));
		System.out.println(sliderIcon.getDomAttribute("value"));
		sliderIcon.sendKeys("0.80%");
		System.out.println(sliderIcon.getDomAttribute("value"));
	}
	@Test
	public static void iOSSwipe() throws MalformedURLException, URISyntaxException, InterruptedException {
		
		InstallApplication();
		driver.executeScript("mobile: activateApp", ImmutableMap.of("bundleId","com.apple.mobileslideshow"));
		
		String text= driver.findElement(AppiumBy.accessibilityId("photos_navigation_title_scrolled")).getDomAttribute("value");
		String[] text1= text.split(", ");
		String[] finalText= text1[1].split(" ");
		int countOfPhotos = Integer.parseInt(finalText[0]);
        System.out.println(countOfPhotos);
        
        System.out.println(driver.getPageSource());

        
        driver.findElement(By.xpath("//XCUIElementTypeCollectionView//XCUIElementTypeCell//XCUIElementTypeImage")).click();



	}
}

package Android_Practice;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class eCommerse_tc_2 extends InstallApp_Android{
	@Test
		public static void addCart() {
			
			driver.findElement(By.id("android:id/text1")).click();
			String stext="Argentina";
			scrolltotext(stext);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
			
			
			
			driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sai Kiran Rao");
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Products']")).isDisplayed();
			
			String productName= "Jordan 6 Rings";
			scrolltotext(productName);
			int TotalProducts = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
			System.out.println("Total count is:- " + TotalProducts);
			
			for(int i=0; i<TotalProducts;i++)
			{
				String Product= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
				
				if(Product.equals(productName))
				{
					driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
					driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).getText().equals("ADDED TO CART");
				}
				else
				{
					System.out.println("Still Searching for Product Please Wait........");
				}
			}
			
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			//driver.findElement(By.xpath("//android.widget.TextView[@text='Cart']")).isDisplayed();
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
			
			driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText().equals(productName);
	}

}

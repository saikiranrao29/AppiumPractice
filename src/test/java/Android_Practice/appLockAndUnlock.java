package Android_Practice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.AndroidKey;

public class appLockAndUnlock extends InstallApp_Android {

	@Test
	public static void lock() throws InterruptedException {
		
		
		driver.lockDevice();
		AssertJUnit.assertTrue(driver.isDeviceLocked());
		Thread.sleep(2000);
		
		if (driver.isDeviceLocked() == true)
		{
			System.out.println("Device is Locked");
		}
		
		else
		{
			System.out.println("Device is Still Un-Locked");
		}

		driver.unlockDevice();
		AssertJUnit.assertFalse(driver.isDeviceLocked());
		Thread.sleep(2000);
		if (driver.isDeviceLocked() == false)
		{
			System.out.println("Device is Un-locked");
		}
		
		else
		{
			System.out.println("Device is Still Locked");
		}
		
		Thread.sleep(2000);
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.POWER));
		if (driver.isDeviceLocked() == true)
		{
			System.out.println("Device is locked");
		}
		
		else
		{
			System.out.println("Device is Still Un-Locked");
		}
		
		driver.unlockDevice();
		Thread.sleep(2000);

	}

}

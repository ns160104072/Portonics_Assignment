package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

public static AndroidDriver<AndroidElement> driver;
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException 
	{
		//Letting which application to run
		File f =new File("apk");
		File fs = new File(f,"com.chaldal.poached_2022-05-31 (1).apk");
		
		//Openning Emulator/Device
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platormName", "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		//Running Server in the mentioned port
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		
		//Adding wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
}

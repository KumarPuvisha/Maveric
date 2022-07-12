package com.Maveric_Task;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Task_3 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app","C:\\Users\\kumarm\\eclipse-workspace\\MoblieTestiing\\App\\khan-academy-7-3-2.apk");
        
        AndroidDriver ad = new AndroidDriver (new URL("http://localhost:4723/wd/hub"), cap);
        ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        ad.findElement(AppiumBy.xpath("//*[@text='Dismiss']")).click();
        ad.findElement(AppiumBy.accessibilityId("Search tab")).click();
        ad.findElement(AppiumBy.xpath("//*[@text='Math']")).click();
        
        Map<String, Object> map= new HashMap<String, Object>();
        
        map.put("strategy", "-android uiautomator");
        map.put("selector", "UiSelector().text(\"Class 12 math (India)\")");
        ad.executeScript("mobile: scroll", map);
        
        ad.findElement(AppiumBy.accessibilityId("Class 12 math (India")).click();
        
        Map<String, Object> map1= new HashMap<String, Object>();
        
        map1.put("strategy", "-android uiautomator");
        map1.put("selector", "UiSelector().text(\"Take Course Challenge\")");
        ad.executeScript("mobile: scroll", map1);
        
        ad.findElement(AppiumBy.xpath("//*[@text='Take Course Challenge']")).click();
 
        ad.findElement(AppiumBy.xpath("(//*[@class='android.widget.TextView'])[7]")).click();
        
        
        System.out.println("Done");
        
        
        
//        (new TouchAction(driver))
//        .press(PointOption.point(920, 1905}))
//        .moveTo(PointOption.point(913, 1600}))
//        .release()
//        .perform();
        

	}

}

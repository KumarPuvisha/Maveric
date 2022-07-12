package com.Maveric_Task;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class KhanAccTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app","C:\\Users\\kumarm\\eclipse-workspace\\NewversionTesting\\App\\khan-academy-7-3-2.apk");
        
        AndroidDriver ad = new AndroidDriver (new URL("http://localhost:4723/wd/hub"), cap);
        ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        ad.findElement(AppiumBy.xpath("//*[@text='Dismiss']")).click();
        ad.findElement(AppiumBy.xpath("//*[@text='Sign in']")).click();
        ad.findElement(AppiumBy.xpath("//*[@text='Sign in']")).click();
        
        WebElement email = ad.findElement(AppiumBy.xpath("//*[@text='Enter an e-mail address or username']"));
        email.sendKeys("Kumar.m060990@gmail.com");
        WebElement pass = ad.findElement(AppiumBy.xpath("//*[@content-desc='Password']"));
        pass.sendKeys("Puvisha@2219");
        ad.findElement(AppiumBy.xpath("(//*[@text='Sign in'])[2]")).click();
        
        System.out.println("Sign in Done");
   
        ad.findElement(AppiumBy.xpath("//*[@content-desc='Search tab']")).click();
        
        ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Economics\")")).click();
        ad.findElement(AppiumBy.xpath("//*[@text='Finance and capital markets']")).click();
        Thread.sleep(30);
        System.out.println("capital markets click done");
        
        Map<String, Object> map= new HashMap<String, Object>();
        
        map.put("strategy", "-android uiautomator");
        map.put("selector", "UiSelector().text(\"Inflation\")");
        ad.executeScript("mobile: scroll", map);
        
        ad.findElement(AppiumBy.xpath("(//*[@class='android.widget.TextView'])[10]")).click();
        
        System.out.println("Scroll and click Inflation done");
        
        Map<String, Object> map1= new HashMap<String, Object>();
        
        map1.put("strategy", "-android uiautomator");
        map1.put("selector", "UiSelector().text(\"Deflation\")");
        ad.executeScript("mobile: scroll", map1);
        
        ad.findElement(AppiumBy.xpath("//*[@class='android.widget.TextView']")).click();
     
        System.out.println("Scroll Deflation Done");
        Thread.sleep(30);
        ad.quit();
        
      
      
        
        
      
     
	}

}

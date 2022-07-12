package TestingScroll;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ScrollMethodNew {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "kumar");
        cap.setCapability("app","C:\\Users\\kumarm\\eclipse-workspace\\MoblieTestiing\\App\\khan-academy-7-3-2.apk");
        cap.setCapability("udid", "emulator-5554");
        
        AndroidDriver ad = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       // ad.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dismiss']")).click();
        ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
        
        
       // ad.findElement(AppiumBy.xpath("//android.widget.Button[@text='Search']")).click();
        ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Search\")")).click();
        
        //ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Arts and humanities\")")).click();
        ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Arts and humanities\")")).click();
        
//        Map<String, Object> map= new HashMap<String, Object>();
//        
//        map.put("strategy", "-android uiautomator");
//        map.put("selector", "UiSelector().text(\"Art of Asia\")");
//        ad.executeScript("mobile: scroll", map);
        
        String text="Art of Asia";
       // ad.findElement(AppiumBy.xpath("//*[@text='Art of Asia']")).click();
        ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().Scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))")); 
        String text4 = ad.findElement(AppiumBy.xpath("//*[@text='Art of Asia']")).getText();
        System.out.println(text4);
        ad.findElement(AppiumBy.xpath("//*[@text='Art of Asia']")).click();
        
//        Map<String, Object> map1= new HashMap<String, Object>(); 
//        map1.put("strategy", "-android uiautomator");
//        map1.put("selector", "UiSelector().text(\"The Himalayas\")");
//        ad.executeScript("mobile: scroll", map1);
        
        String text1="The Himalayas";
        //ad.findElement(AppiumBy.xpath("//*[@text='The Himalayas']")).click();
        //ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"The Himalayas\")")).click();
        ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().Scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + text1 + "\").instance(0))"));
        String text3 = ad.findElement(AppiumBy.xpath("//*[@text='The Himalayas']")).getText();
        System.out.println(text3);
        ad.findElement(AppiumBy.xpath("//*[@text='The Himalayas']")).click();
//        Map<String, Object> map2= new HashMap<String, Object>();
//        map2.put("strategy", "-android uiautomator");
//        map2.put("selector", "UiSelector().text(\"Prayer wheel\")");
//        ad.executeScript("mobile: scroll", map2);
        
        String text2="The Himalayas";
        //ad.findElement(AppiumBy.xpath("//*[@text='Prayer wheel']")).click();
       // ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"The Himalayas\")")).click();
        ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().Scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + text2 + "\").instance(0))"));
        String text5 = ad.findElement(AppiumBy.xpath("//*[@text='Prayer wheel']")).getText();
        System.out.println(text5);
        ad.findElement(AppiumBy.xpath("//*[@text='Prayer wheel']")).click();
        System.out.println("Done");

	}

}

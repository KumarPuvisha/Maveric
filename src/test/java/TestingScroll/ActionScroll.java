package TestingScroll;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ActionScroll {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app","C:\\Users\\kumarm\\eclipse-workspace\\MoblieTestiing\\App\\khan-academy-7-3-2.apk");
        
        AndroidDriver ad = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
       // ad.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Dismiss']")).click();
        ad.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
        
        
        ad.findElement(AppiumBy.id("org.khanacademy.android:id/tab_bar_button_search")).click();
        

        ad.findElement(AppiumBy.xpath("//*[@text='Arts and humanities']")).click();
        
        
        
        
        Thread.sleep(5000);
        
        //scroll using actions 
        
        TouchAction action = new TouchAction(ad);

        action.press(PointOption.point(971, 1276))
        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(600)))
        .moveTo(PointOption.point(982, 1045))
        .release()
        .perform();
        
        action.press(PointOption.point(971, 1276))
        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(600)))
        .moveTo(PointOption.point(982, 1045))
        .release()
        .perform();
        
        action.press(PointOption.point(971, 1276))
        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(600)))
        .moveTo(PointOption.point(982, 1045))
        .release()
        .perform();
        
      

	}

}

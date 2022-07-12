package TestingScroll;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MobileCommentShell {

	public static void main(String[] args) throws MalformedURLException {
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
        ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        
        Map<String, Object> map= new HashMap<String, Object>();
        map.put("command", "input touchscreen swipe 971 1276 982 1045");
        ad.executeScript("mobile: shell", map); 

	}

}

package TestingScroll;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ActionScrollNewwhile {

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
        
        
        
        
        while (ad.findElements(AppiumBy.xpath("//*[@text='Art of Asia']")).size()==0) {
        	
        	PointerInput fi = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            
            Actions act = new Actions(ad);
        	act.tick(fi.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 971, 1276))
            .tick(fi.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
            .tick(new Pause(fi, Duration.ofMillis(600)))
            .tick(fi.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), 982, 1045))
            .tick(fi.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()))
            
            .build().perform();
			
		}
        
        ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        ad.findElement(AppiumBy.xpath("//*[@text='Art of Asia']")).click();
        

	}

}

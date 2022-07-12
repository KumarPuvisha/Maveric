package TestingScroll;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class scrollimut {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "android");
        cap.setCapability("deviceName", "bala");

        // cap.setCapability("noReset", true);

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // enable bluetooth
        driver.executeScript("mobile: shell",
                ImmutableMap.of("command", "am start -a android.bluetooth.adapter.action.REQUEST_ENABLE"));

        driver.findElement(AppiumBy.xpath("//*[@text='Allow']")).click();
        Thread.sleep(5000);

        // disable bluetooth
        driver.executeScript("mobile: shell",
                ImmutableMap.of("command", "am start -a android.bluetooth.adapter.action.REQUEST_DISABLE"));

        driver.findElement(AppiumBy.xpath("//*[@text='Allow']")).click();
        
        
//System.setProperty("webdriver.chrome.driver", "C:\\Components\\chromedriver.exe");
//        
//        
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("deviceName", "Nexus 5");
//                
//        ChromeOptions options = new ChromeOptions();    
//        options.setExperimentalOption("mobileEmulation", map);
//        
//        WebDriver driver=new ChromeDriver(options);
//        
//        driver.get("http://facebook.com/");


	}

}

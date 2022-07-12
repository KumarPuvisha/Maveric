package com.Maveric_Task;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class AmazonTesting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
      
      DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("platformName", "android");
      cap.setCapability("deviceName", "emulator-5554");
      cap.setCapability("app","C:\\Users\\kumarm\\eclipse-workspace\\MoblieTestiing\\App\\amazon-shopping-24-12-6-100.apk");
      
      AndroidDriver ad = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
      ad.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

      System.out.println("connected");

      ad.findElement(AppiumBy.xpath("//*[@text='Already a customer? Sign in']")).click();
      ad.findElement(AppiumBy.xpath("//*[@text='Already a customer? Sign in']")).click();
      Thread.sleep(600);
      
//      ad.findElement(AppiumBy.xpath("//*[@text='Skip sign in']"))
//
//      ad.findElement(AppiumBy.xpath("//*[@resource-id='ap_email_login']")).sendKeys("evelinpearl300499@gmail.com");
//
//      ad.findElement(AppiumBy.xpath("//*[@text='Continue']")).click();
//
//      ad.findElement(AppiumBy.xpath("//*[@resource-id='ap_password']")).sendKeys("evelin");
//
//      ad.findElement(AppiumBy.xpath("//*[@resource-id='signInSubmit']")).click();
//   

    

//      List<WebElement> list= ad.findElements(AppiumBy.xpath("//*[@text='Search' or @text='What are you looking for?']"));
//      if(list.size()>0) {
//            ad.findElement(AppiumBy.xpath("//*[@text='Search' or @text='What are you looking for?']")).click();
//      ad.findElement(AppiumBy.xpath("//*[@text='Search' or @text='What are you looking for?']")).sendKeys("Laptop");
//      }else {
//          ad.findElement(AppiumBy.xpath("//*[@text='NO, THANKS']")).click();
//      }
//      ad.findElement(AppiumBy.xpath("//*[@text='laptop']")).click();

//      String item = ad.findElement(MobileBy.xpath("(//*[@class='android.widget.TextView'])[9]")).getText();
//      System.out.println(item);
  //    ad.findElement(AppiumBy.xpath("(//*[@class='android.widget.TextView'])[9]")).click();

//      ad.findElement(MobileBy.xpath("//*[@text='Enter an Indian pincode']")).click();
//      ad.findElement(MobileBy.id("com.amazon.mShop.android.shopping:id/loc_ux_pin_code_text_pt1")).sendKeys("600056");
//      ad.findElement(MobileBy.xpath("//*[@text='Apply']")).click();
//      String item = ad.findElement(AppiumBy.xpath("//android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]")).getText();
//      System.out.println(item);
//      String add = "Add to Cart";
//      ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ add + "\").instance(0))"));
//      ad.findElement(AppiumBy.xpath("//*[@text='Add to Cart']")).click();
//      ad.findElement(AppiumBy.xpath("//*[@content-desc='Cart']")).click();
//      String item1 = ad.findElement(AppiumBy.xpath("//*[@text='"+item+"']")).getText();
      //        String item1 = ad.findElement(MobileBy.xpath("(//*[@text='android.widget.TextView'])[14]")).getText();
//      System.out.println(item1);
//      if(item.equals(item1)) {    
//      ad.findElement(AppiumBy.androidUIAutomator("UiSelector().textContains(\"Proceed to Buy\")")).click();
//      }
//      
//      String addNew = "Add a New Address";
//      ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ addNew + "\").instance(0))"));
//      ad.findElement(AppiumBy.xpath("//*[@text='Add a New Address']")).click();
//      String nameField ="Full name";
//      ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ nameField + "\").instance(0))"));      
//
//      ad.findElement(AppiumBy.xpath("//*[@resource-id='address-ui-widgets-enterAddressFullName']")).sendKeys("Eva");
//      ad.findElement(AppiumBy.xpath("//*[@resource-id='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("2345645645");
//      String building = "Flat, House no., Building, Company, Apartment";
//      ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ building + "\").instance(0))"));
//      ad.findElement(AppiumBy.xpath("//*[@resource-id='address-ui-widgets-enterAddressLine1']")).sendKeys("No 174, Sai ghar apartment,Sivam street");
//      ad.findElement(AppiumBy.xpath("//*[@resource-id='address-ui-widgets-enterAddressLine2']")).sendKeys("Kattupakkam");
//      String address = "Use this address";
//      ad.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ address + "\").instance(0))"));      
//      ad.findElement(AppiumBy.xpath("//*[@text='Use this address']")).click();
//      ad.findElement(AppiumBy.xpath("//*[@text='Use this address']")).click();

      //        ad.findElement(MobileBy.xpath("//*[@text='Continue']")).click();
      ad.quit();

      //        ad.findElement(MobileBy.id("com.amazon.mShop.android.shopping:id/new_user")).click();

      //        WebDriverWait wait = new WebDriverWait(ad,30);
//      ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//      ad.findElement(MobileBy.xpath("//*[@text='New to Amazon.com? Create an account']")).click();
//      ad.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

//      ad.findElement(MobileBy.xpath("//*[@resource-id='ap_customer_name']")).sendKeys("Evelin");
//      wait.until(ExpectedConditions.elementToBeSelected(name));
//      ad.findElement(MobileBy.xpath("//*[@resource-id='ap_email']")).sendKeys("evelinpearl300499@gmail.com");
//      ad.findElement(MobileBy.xpath("//*[@resource-id='ap_password']")).sendKeys("evelin");
//      ad.findElement(MobileBy.xpath("//*[@text='Verify email']")).click();

	}

}

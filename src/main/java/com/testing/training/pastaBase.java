package com.testing.training;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class pastaBase {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		File file = new File("src\\main\\java");
		File fileS = new File("ApiDemos-debug.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulador1");
		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\lucas\\eclipse-workspace\\com.testing.training\\src\\main\\java\\ApiDemos-debug.apk");
		AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}

}

package com.testing.training;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends pastaBase {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver =Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		//TODO how to click on those damn things at the start of the app
		
	}

}

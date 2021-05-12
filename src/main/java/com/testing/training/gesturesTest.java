package com.testing.training;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;

public class gesturesTest extends pastaBase {

	public static void main(String[] args) throws IOException {
		System.out.println("Hola");
		//Code to run the batch
		Runtime runTime = Runtime.getRuntime();
        
		Process process = runTime.exec("cmd /c start C:\\Users\\lucas\\eclipse-workspace\\com.testing.training\\initialSetUp.bat");
		/*
		AndroidDriver<AndroidElement> driver =Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		//TODO why the hell make WebelEments: to perform specific Appium mobile operations
		TouchAction gestures = new TouchAction(driver);
		WebElement element = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		gestures.tap(tapOptions().withElement(element(element))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement element2 = driver.findElementByXPath("//android.widget.TextView[@text='Peoples Names']");
		//Long press action
		gestures.longPress(LongPressOptions.longPressOptions().withElement(element(element2)).withDuration(Duration.ofSeconds(2))).release().perform();*/
	}

}

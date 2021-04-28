package com.testing.training;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gesturesTest extends pastaBase {

	public static void main(String[] args) throws MalformedURLException {
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
		gestures.longPress(longPressOptions().withElement(element(element2)).withDuration(ofSeconds(2))).release().perform();
	}

}

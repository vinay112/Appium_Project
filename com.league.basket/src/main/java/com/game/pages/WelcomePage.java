package com.game.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import android.view.Window;

public class WelcomePage extends BasePage {

	TouchAction<?> touchAction;
	public AppiumDriver<?> driver;
	private static Logger log = LogManager
			.getLogger(WelcomePage.class.getName());


        @AndroidFindBy(xpath = "//android.widget.TextView[@text='HAVE AN ACCOUNT? SIGN IN']")
	public static MobileElement pointsForSignIn;

	public WelcomePage(AppiumDriver<?> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		touchAction = new TouchAction(driver);
	}

	public void clickSigninLink() {
		log.info("Inside clickSigninLink Method");
		 int y = pointsForSignIn.getCenter().getY();
			int x1=pointsForSignIn.getCenter().getX();
			Dimension size=driver.manage().window().getSize();
			int d2=size.getWidth();
	                int x=(d2+x1)/2; 	
			tapByCoordinates(touchAction, x, y);
		//pointsForSignIn.click();

	}

}

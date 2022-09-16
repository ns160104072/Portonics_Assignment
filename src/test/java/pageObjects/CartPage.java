package pageObjects;

import javax.swing.text.Utilities;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CartPage extends Utilities {
	public CartPage(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup")
	public MobileElement itemDiscardButton;

	@AndroidFindBy(xpath = "//*[@text='Nothing to see here']")
	public MobileElement text;

	String verifiedText = text.getText();

	public void clickOnMinus() throws InterruptedException {
		itemDiscardButton.click();
		Thread.sleep(1000);
		itemDiscardButton.click();
		Thread.sleep(1000);
		itemDiscardButton.click();
		Thread.sleep(3000);
	}

	public void isVerifyText() {
		if (verifiedText.contains("Nothing to see here")) {
			System.out.println("Assertion Passed");
		} else {
			System.out.println("Assertion Failed");
		}
	}
	
	

}

package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CartPage;
import pageObjects.ItemListPage;
import pageObjects.OnSelectedItemPage;
import pageObjects.Page;
import utilitties.Utilitties;

public class Test_Chaldal extends Base {

	@Test
	public void mySecondTest() throws IOException, InterruptedException {
		AndroidDriver<AndroidElement> driver = capabilities();
		Thread.sleep(20000);

		Page home_page = new Page(driver);
		home_page.clickOnSearch();
		home_page.sendValueOnSearch();
        ItemListPage ilp = new ItemListPage(driver);
        OnSelectedItemPage item_page = new OnSelectedItemPage(driver);
        CartPage cp = new CartPage(driver);
		
		
	   // home_page.clickOnCategory();
		
		ilp.tapOnSelectedBrush();
		item_page.clickOnPlus();
		item_page.clickOnBackButton();
		ilp.clickOnCart();
		cp.clickOnMinus();
		cp.isVerifyText();
		driver.hideKeyboard();
		Utilitties util = new Utilitties(driver);
		util.scrollToText("Formula Platinum Sensitive Expert Professional (Free Toothbrush 1 pcs)");
		Thread.sleep(2000);
//		home.tapOnSelectedToothpaste();



	


	}

}

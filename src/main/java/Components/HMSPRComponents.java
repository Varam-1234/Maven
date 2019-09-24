package Components;

import objectRepository.HMSPRLocators;
import utility.BaseClass;

public class HMSPRComponents extends BaseClass{
	HMSPRLocators hmsPRLocators = new HMSPRLocators();
	public void lanuchBrowser() {
		openBrowser();
		openURL("http://selenium4testing.com/hms");
	}
	public void login() {
		enterText(hmsPRLocators.username, "admin");
		enterText(hmsPRLocators.password, "admin");
	//	click("//input[@name='submit']");
		click(hmsPRLocators.login);
	}
	public void navigateToReg(){
		click(hmsPRLocators.registration);
	}




	}



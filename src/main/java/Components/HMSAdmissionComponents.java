package Components;

import objectRepository.HMSAdmissionLocators;
import utility.BaseClass;

public class HMSAdmissionComponents extends BaseClass{
	HMSAdmissionLocators hmsAdmissionLocators = new HMSAdmissionLocators();
	public void lanuchBrowser() {
		openBrowser();
		openURL("http://selenium4testing.com/hms");
	}
	public void login() {
		enterText(hmsAdmissionLocators.username, "admin");
		enterText(hmsAdmissionLocators.password, "admin");
	//	click("//input[@name='submit']");
		click(hmsAdmissionLocators.login);
	}
	public void navigatetoADT() {
		click(hmsAdmissionLocators.ADT);
	}
	public void navigatetoAdmission() {
		click(hmsAdmissionLocators.Admission);
	}
	
	}



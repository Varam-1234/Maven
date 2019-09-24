package testScripts;

import org.testng.annotations.Test;

import Components.HMSPRComponents;

public class HMSCreatePatient {
	HMSPRComponents hmsPRComponents = new HMSPRComponents();
	  @Test
	  public void f() {
		  hmsPRComponents.lanuchBrowser();
		  hmsPRComponents.login();
		  hmsPRComponents.navigateToReg();
	  }
	}




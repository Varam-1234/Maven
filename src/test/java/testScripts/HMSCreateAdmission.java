package testScripts;

import org.testng.annotations.Test;

import Components.HMSAdmissionComponents;

public class HMSCreateAdmission {
	HMSAdmissionComponents hmsAdmissionComponents = new HMSAdmissionComponents();
  @Test
  public void f() {
	  hmsAdmissionComponents.lanuchBrowser();
	  hmsAdmissionComponents.login();
	  hmsAdmissionComponents.navigatetoADT();
	  hmsAdmissionComponents.navigatetoAdmission();
  }
}

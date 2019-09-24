package objectRepository;

import org.openqa.selenium.By;

public class HMSPRLocators {
	//String username = "//input[@name='username']";
		public By username = By.xpath("//input[@name='username']");
		public By password = By.xpath("//input[@name='password']");
		public By login = By.xpath("//input[@name='submit']");
		public By registration = By.linkText("Registration");
	}



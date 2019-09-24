package objectRepository;

import org.openqa.selenium.By;

public class HMSAdmissionLocators {
	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By login = By.xpath("//input[@name='submit']");
	public By ADT = By.xpath("//*[@id=\"navigation\"]/li[2]/a");
    public By Admission = By.xpath("//*[@id=\"navigation\"]/li[2]/ul/li[2]/span/a");
}

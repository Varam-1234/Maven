package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public WebDriver driver;
	Logger log = Logger.getLogger(BaseClass.class);
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Library\\\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	public void openURL(String url){
		driver.get(url);
	}
	public void enterText(By loc, String data){
		driver.findElement(loc).clear();
		 driver.findElement(loc).sendKeys(data);
		// log.info("Entered the value in the textbox : ");
		 log.info("Entered the value: "+ data+" in the textbox: "+ loc);
	}
	public void select(String loc, String data){
		new Select(driver.findElement(By.xpath(loc))).selectByVisibleText(data);
		log.info("Selected the: "+data+" from the field: "+loc);
	}
	public void select(String loc, int no){
		new Select(driver.findElement(By.xpath(loc))).selectByIndex(no);
		log.info("Selected the: "+no+" from the field: "+loc);
	}
	
	public void click(String loc){
		driver.findElement(By.xpath(loc)).click();
		log.info("Clicked on the field :"+loc);
	}
	public void click(By loc){
		driver.findElement(loc).click();
		log.info("Clicked on the field :"+loc);
	}
	public void clickLink(String linkName){
		driver.findElement(By.linkText(linkName)).click();	
	}
	
	public void takeScreenShot(String str) throws Exception{
		SimpleDateFormat df= new SimpleDateFormat("yyyy MMM dd hh mm ss a");
		  Date d =new Date();
		  String time = df.format(d);
		  System.out.println(time);
		 File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File(str+time+".png"));
	}
	public void alert_OK(){
		String str=null;
		str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept(); //To click ok
	}
	public void alert_Cancel(){
		driver.switchTo().alert().dismiss(); // To click Cancel	
	}
	


}



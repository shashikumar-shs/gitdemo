package com.krn.actitime.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
public	WebDriver driver;
public DemoexcelLibrary xlib;
  @BeforeClass
  public void openbrowser() 
  {
	  System.setProperty("WebDriver.chrome.driver","C:\\Project1\\chromedriver_win32 (8)\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
  @BeforeMethod
  public void login()
  {
	  String un=xlib.getExceldata("login", 1, 0);
	 String pw= xlib.getExceldata("login", 1, 1);
driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
driver.findElement(By.xpath("//a[@id='loginButton']")).click();
}
  
  @AfterMethod
  public void logout()
  {
driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
  }
  @AfterClass
  public void closebrowser() 
  {
driver.close();
}
  
}

package com.krn.actitime.customer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.baseClass;

public class CreateCustomer extends baseClass {
  @Test
  public void createcustomer() throws InterruptedException
  {
	  
	  Thread.sleep(5000);
driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
driver.findElement(By.xpath("//div[text()='Add New']")).click();
driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
String cusname=xlib.getExceldata("createcustomer", 1, 0);
String desc=xlib.getExceldata("createcustomer", 1, 1);
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(cusname);
driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
}
  @Test
  public void gitdemo()
  {
	  System.out.println("this is success");
  }
  public void gitdemo1()
  {
	  System.out.println("this is success1");
  }
}

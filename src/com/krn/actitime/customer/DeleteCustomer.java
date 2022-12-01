package com.krn.actitime.customer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.baseClass;

public class DeleteCustomer extends baseClass {
  @Test
  public void deletecustomer() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys("shashi123");
	  driver.findElement(By.xpath("//span[text()='shashi123']")).click();
	 driver.findElement(By.xpath("//span[text()='shashi123']/../../..//div[@class='editButton']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("(//div[@class=\"actions\"])[1]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("(//div[@class=\"deleteButton\"])[1]")).click();
	  driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
  }
}

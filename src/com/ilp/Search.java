package com.ilp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Search {
	
	WebDriver Driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  Driver.findElement(By.name("wd")).clear();
	  
	  System.out.println("输入‘博客园’");
	  Driver.findElement(By.name("wd")).sendKeys("博客园");
	  
	  System.out.println("点击百度一下");
	  Driver.findElement(By.id("su")).click();
	  
	  WebDriverWait Wait = new WebDriverWait(Driver, 2);
	  
	  Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//em[contains(text(), '博客园')][1]")));
	  
	  System.out.println("点击博客园 - 开发者的网上家园");
	  Driver.findElement(By.xpath("//em[contains(text(), '博客园')][1]")).click();
	  
	  String currentHandle = Driver.getWindowHandle();
	
	  
	  Set <String> handles = Driver.getWindowHandles();
	  
	  for(String handle:handles) {
		  
		  if(handle.equals(currentHandle)) {
			  System.out.println(handle);
			  System.out.println(Driver.getTitle());
			  continue;
		  }	  
		  else {
			  Driver.switchTo().window(handle);
			  System.out.println(handle);
			  System.out.println(Driver.getTitle());
		  }  
		  
	  }
	  
	  //Wait.wait(2);
	  
	  Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='nav_menu']/a[contains(text(), '新闻')]")));
	  Driver.findElement(By.xpath("//div[@id='nav_menu']/a[contains(text(), '新闻')]")).click();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  //String URL = "http://www.baidu.com";
	  
	  System.out.println("Open broswer....");
	  //ChromeOptions options = new ChromeOptions();
	  //options.addArguments("test-type", "start-maximized","no-default-browser-check");
	  
	  //Driver = new ChromeDriver();
	  //Driver = new FirefoxDriver();
	  Driver = new InternetExplorerDriver();
	  
	  Driver.get("http://www.baidu.com");
	  
	  System.out.println("Maxmize broswer....");
	  Driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  //Driver.close();
	  Driver.quit();
  }

}

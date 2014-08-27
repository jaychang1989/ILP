package com.ilp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Jd {
	WebDriver Driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  Actions action = new Actions(Driver);
	  
	  WebDriverWait wait = new WebDriverWait(Driver, 20);
	  
	  System.out.println("������ƶ����ֻ�");
	  
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='http://shouji.jd.com/']")));
	  
	  //WebElement phone = Driver.findElement(By.xpath("//a[@href='http://shouji.jd.com/']"));
	  
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("�ֻ�")));
	  
	  WebElement phone = Driver.findElement(By.linkText("�ֻ�"));
	  
	  action.moveToElement(phone).perform();
	  
	  Thread.sleep(2000);
	  
	  System.out.println("����ֻ�");
	  
	  //Driver.findElement(By.xpath("//a[@href='http://list.jd.com/9987-653-655.html']")).click();
	  //Driver.findElement(By.xpath("//em//a[text() = '�ֻ�']")).click();
	  
	  ((JavascriptExecutor) Driver).executeScript("arguments[0].click();", Driver.findElement(By.xpath("//em//a[text() = '�ֻ�']")));
	
	  
	  System.out.println("������빺�ﳵ");
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@sku='981821']//div[@class='btns']/a[@class='btn-buy']")));
	  Driver.findElement(By.xpath("//li[@sku='981821']//div[@class='btns']/a[@class='btn-buy']")).click();
	  
	  String currentHandle = Driver.getWindowHandle();
	  
	  Set <String> Handles = Driver.getWindowHandles();
	  
	  for(String handle:Handles) {
		  if(handle.equals(currentHandle)) {
			  System.out.println(Driver.getTitle());
			  continue;
		  }
		  else {
			  Driver.switchTo().window(handle);
			  System.out.println(Driver.getTitle());
		  }
	  }
	  
	  Driver.findElement(By.id("GotoShoppingCart")).click();
	  
	  Driver.findElement(By.id("toSettlement")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  String URL = "http://www.jd.com";
	  
	  System.out.println("Open broswer....");
	  Driver = new ChromeDriver();
	  
	  Driver.get(URL);
	  
	  System.out.println("Maxmize broswer....");
	  Driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  //Thread.sleep(5000);

	  //Driver.quit();
  }

}

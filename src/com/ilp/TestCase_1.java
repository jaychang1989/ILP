package com.ilp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCase_1 extends MainTest {
	
  @Test
  public void loginTest() {
	  
		String Url = "http://localhost:8280/ILP/";

		// ��ҳ��
		Driver.get(Url);

		// �����û���
		Driver.findElement(By.name("userInfo.userNo")).clear();
		Driver.findElement(By.name("userInfo.userNo")).sendKeys("u0201");

		// ��������
		Driver.findElement(By.name("userInfo.password")).clear();
		Driver.findElement(By.name("userInfo.password")).sendKeys("123");

		// �����¼
		Driver.findElement(By.xpath("//img[@src='/ILP/images/logindl.gif']"))
				.click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
		// �������
		WebDriver Driver = new InternetExplorerDriver();

		// ��󻯴���
		Driver.manage().window().maximize();

  }

  @AfterTest
  public void afterTest() {
	
		
  }

}

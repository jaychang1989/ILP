package com.ilp;

import static com.ilp.MainTest.*;
import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class TestCase_1 {
	
  @Test
  public void loginTest() {
	 
		String Url = "http://localhost:8280/ILP/";

		System.out.println("������ַ������");
		// ��ҳ��
		Driver.get(Url);
		
		System.out.println("����ҳ������");

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
	  	Driver = new InternetExplorerDriver();
		
		System.out.println("Open Broswer...");

		// ��󻯴���
		Driver.manage().window().maximize();

  }


}

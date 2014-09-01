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

		System.out.println("输入网址。。。");
		// 打开页面
		Driver.get(Url);
		
		System.out.println("打开网页。。。");

		// 输入用户名
		Driver.findElement(By.name("userInfo.userNo")).clear();
		Driver.findElement(By.name("userInfo.userNo")).sendKeys("u0201");

		// 输入密码
		Driver.findElement(By.name("userInfo.password")).clear();
		Driver.findElement(By.name("userInfo.password")).sendKeys("123");

		// 点击登录
		Driver.findElement(By.xpath("//img[@src='/ILP/images/logindl.gif']"))
				.click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
		// 打开浏览器
	  	Driver = new InternetExplorerDriver();
		
		System.out.println("Open Broswer...");

		// 最大化窗口
		Driver.manage().window().maximize();

  }


}

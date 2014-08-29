package com.ilp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCase_4 extends MainTest {
	
  @Test
  public void Delete() {
	  
		// 选择订单记录
		Driver.findElement(
				By.xpath("//table[@class='l-grid-body-table']/tbody/tr/td[1]"))
				.click();

		// 点击删除
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[4]")).click();

		// 点击弹出框确定
		Driver.findElement(
				By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']"))
				.click();

		// 再次点击确定
		Driver.findElement(
				By.xpath("//div[@class='l-dialog-buttons-inner']/div[1]/div[@class='l-dialog-btn-inner']"))
				.click();

		// 切换回主frame
		Driver.switchTo().defaultContent();

		// 点击安全退出
		Driver.findElement(By.xpath("//a[contains(text(), '安全退出')]")).click();

		// 点击弹出框确定
		Driver.findElement(
				By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']"))
				.click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
		// 关闭浏览器
		Driver.quit();
  }

}

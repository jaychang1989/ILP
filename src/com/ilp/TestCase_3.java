package com.ilp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCase_3 extends MainTest {
	
	public void inCrease() throws Exception {
		
		Thread.sleep(500);
		// 进入买方
		((JavascriptExecutor) Driver).executeScript("arguments[0].click();",
				Driver.findElement(By.xpath("//map[@id='Map']/area[6]")));
		// Driver.findElement(By.xpath("//map[@id='Map']/area[6]")).click();

		Thread.sleep(500);
		// 点击订单管理列表
		Driver.findElement(By.xpath("//ul[@id='tree1']/li[@treedataindex='0']"))
				.click();

		// 点击展开后的订单管理
		Driver.findElement(
				By.xpath("//div[@class='l-body']/span[text()='订单管理']")).click();

		// 切换frame
		Driver.switchTo()
				.frame(Driver.findElement(By
						.xpath("//iframe[@src='manager/modules/orders/orders.jsp?sellerAccept=0']")));

		// 点击新增
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[2]")).click();

		// 使用JS设置订货日期
		((JavascriptExecutor) Driver)
				.executeScript("document.getElementById('orderDate').value='2014-08-21'");

		// 使用JS设置送货日期
		((JavascriptExecutor) Driver)
				.executeScript("document.getElementById('deliveryDate').value='2014-08-22'");

		// 输入公司
		Driver.findElement(By.id("companyName")).clear();
		Driver.findElement(By.id("companyName")).sendKeys("深圳市国泰安信息有限公司");

		// 输入地址
		Driver.findElement(By.id("deliveryAddr")).clear();
		Driver.findElement(By.id("deliveryAddr")).sendKeys("深圳市南山区南头检查站");

		// 输入电话
		Driver.findElement(By.id("phone")).clear();
		Driver.findElement(By.id("phone")).sendKeys("13511200021");

		// 输入联系人
		Driver.findElement(By.id("linkman")).clear();
		Driver.findElement(By.id("linkman")).sendKeys("zhc");

		// 点击增加明细
		Driver.findElement(By.xpath("//img[@src='/ILP/images/add-detail.gif']"))
				.click();

		// 选择下拉列表
		Select selectCargoId = new Select(
				Driver.findElement(By.name("cargoId")));
		selectCargoId.selectByIndex(2);

		// Thread.sleep(1000);
		// selectCargoId.selectByVisibleText("CPU");
		//
		// Thread.sleep(1000);
		// selectCargoId.selectByValue("5");

		// 输入数量
		Driver.findElement(By.name("quantity")).clear();
		Driver.findElement(By.name("quantity")).sendKeys("10");

		// 选择单位
		Select selectUnit = new Select(Driver.findElement(By.name("unit")));
		selectUnit.selectByVisibleText("个");

		// 点击新增页面确定
		Driver.findElement(By.id("saveOrderId")).click();
	}
	
	 @BeforeTest
	  public void beforeTest() {
		  
	  }

	  @AfterTest
	  public void afterTest() {
		
	  }
}

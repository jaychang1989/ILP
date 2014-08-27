/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.ilp;


import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;


public class ilp {
	public static void main(String[] args) throws InterruptedException {
		//System.out.println("hello, test1");
		
		//打开浏览器
		WebDriver Driver = new InternetExplorerDriver();
		
		//最大化窗口
		Driver.manage().window().maximize();
		
		String Url = "http://localhost:8280/ILP/";
		
		//打开页面
		Driver.get(Url);
		
		//输入用户名
		Driver.findElement(By.name("userInfo.userNo")).clear();
		Driver.findElement(By.name("userInfo.userNo")).sendKeys("u0201");
		
		//输入密码
		Driver.findElement(By.name("userInfo.password")).clear();
		Driver.findElement(By.name("userInfo.password")).sendKeys("123");
		
		//点击登录
		Driver.findElement(By.xpath("//img[@src='/ILP/images/logindl.gif']")).click();
		
		//Thread.sleep(1000);
		
		//显式等待
		WebDriverWait wait = new WebDriverWait(Driver, 5);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@name='testCaseType'])[2]")));
		
		//选择单人综合实验按钮
		Driver.findElement(By.xpath("(//input[@name='testCaseType'])[2]")).click();
		
		//点击查询
		Driver.findElement(By.xpath("//img[@src='images/search.gif']")).click();
		
		//选择实训任务
		Driver.findElement(By.xpath("//div[@class='l-grid-row-cell-inner l-grid-row-cell-inner-fixedheight']")).click();
		
		//点击确定
		Driver.findElement(By.xpath("//img[@src='images/ok.gif']")).click();
		
		Thread.sleep(500);
		/*WebDriver Window = Driver.switchTo().window(CurrentHandle);
		
		CurrentHandle = Driver.getWindowHandle();
		
		System.out.println(CurrentHandle);
		
		System.out.println(Window.getTitle() + "   " + Window.getCurrentUrl());*/
			
		//进入买方
		((JavascriptExecutor) Driver).executeScript("arguments[0].click();", Driver.findElement(By.xpath("//map[@id='Map']/area[6]")));
		//Driver.findElement(By.xpath("//map[@id='Map']/area[6]")).click();
		
		Thread.sleep(500);
		
		//点击订单管理列表
		Driver.findElement(By.xpath("//ul[@id='tree1']/li[@treedataindex='0']")).click();
		
		//点击展开后的订单管理
		Driver.findElement(By.xpath("//div[@class='l-body']/span[text()='订单管理']")).click();
		
		//切换frame
		Driver.switchTo().frame(Driver.findElement(By.xpath("//iframe[@src='manager/modules/orders/orders.jsp?sellerAccept=0']")));
		
		//点击新增
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[2]")).click();
		
		//使用JS设置订货日期
		((JavascriptExecutor) Driver).executeScript("document.getElementById('orderDate').value='2014-08-21'");
		
		//使用JS设置送货日期
		((JavascriptExecutor) Driver).executeScript("document.getElementById('deliveryDate').value='2014-08-22'");
		
		//输入公司
		Driver.findElement(By.id("companyName")).clear();
		Driver.findElement(By.id("companyName")).sendKeys("深圳市国泰安信息有限公司");
		
		//输入地址
		Driver.findElement(By.id("deliveryAddr")).clear();
		Driver.findElement(By.id("deliveryAddr")).sendKeys("深圳市南山区南头检查站");
		
		//输入电话
		Driver.findElement(By.id("phone")).clear();
		Driver.findElement(By.id("phone")).sendKeys("13511200021");
		
		//输入联系人
		Driver.findElement(By.id("linkman")).clear();
		Driver.findElement(By.id("linkman")).sendKeys("zhc");
		
		//点击增加明细
		Driver.findElement(By.xpath("//img[@src='/ILP/images/add-detail.gif']")).click();
			
		//选择下拉列表
		Select selectCargoId = new Select(Driver.findElement(By.name("cargoId")));		
		selectCargoId.selectByIndex(2);
		
//		Thread.sleep(1000);
//		selectCargoId.selectByVisibleText("CPU");
//		
//		Thread.sleep(1000);
//		selectCargoId.selectByValue("5");
		
		//输入数量
		Driver.findElement(By.name("quantity")).clear();
		Driver.findElement(By.name("quantity")).sendKeys("10");
		
		//选择单位
		Select selectUnit = new Select(Driver.findElement(By.name("unit")));		
		selectUnit.selectByVisibleText("个");
		
		//点击新增页面确定
		Driver.findElement(By.id("saveOrderId")).click();
		
		//选择订单记录
		Driver.findElement(By.xpath("//table[@class='l-grid-body-table']/tbody/tr/td[1]")).click();
		
		//点击删除
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[4]")).click();		
		
		//点击弹出框确定
		Driver.findElement(By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']")).click();
		
		//再次点击确定
		Driver.findElement(By.xpath("//div[@class='l-dialog-buttons-inner']/div[1]/div[@class='l-dialog-btn-inner']")).click();
		
		//切换回主frame
		Driver.switchTo().defaultContent();
		
		//点击安全退出
		Driver.findElement(By.xpath("//a[contains(text(), '安全退出')]")).click();
		
		//点击弹出框确定
		Driver.findElement(By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']")).click();
		
		//关闭浏览器
		Driver.quit();
		
	}
	
	
	
}
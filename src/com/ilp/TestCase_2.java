package com.ilp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestCase_2 extends MainTest {
	
  public void SelectProject() {
	
		// 显式等待
		WebDriverWait wait = new WebDriverWait(Driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("(//input[@name='testCaseType'])[2]")));

		// 选择单人综合实验按钮
		Driver.findElement(By.xpath("(//input[@name='testCaseType'])[2]"))
				.click();

		// 点击查询
		Driver.findElement(By.xpath("//img[@src='images/search.gif']")).click();

		// 选择实训任务
		Driver.findElement(
				By.xpath("//div[@class='l-grid-row-cell-inner l-grid-row-cell-inner-fixedheight']"))
				.click();

		// 点击确定
		Driver.findElement(By.xpath("//img[@src='images/ok.gif']")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	
  }
  
}

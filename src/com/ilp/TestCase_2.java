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
	
		// ��ʽ�ȴ�
		WebDriverWait wait = new WebDriverWait(Driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("(//input[@name='testCaseType'])[2]")));

		// ѡ�����ۺ�ʵ�鰴ť
		Driver.findElement(By.xpath("(//input[@name='testCaseType'])[2]"))
				.click();

		// �����ѯ
		Driver.findElement(By.xpath("//img[@src='images/search.gif']")).click();

		// ѡ��ʵѵ����
		Driver.findElement(
				By.xpath("//div[@class='l-grid-row-cell-inner l-grid-row-cell-inner-fixedheight']"))
				.click();

		// ���ȷ��
		Driver.findElement(By.xpath("//img[@src='images/ok.gif']")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	
  }
  
}

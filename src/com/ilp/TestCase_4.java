package com.ilp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCase_4 extends MainTest {
	
  @Test
  public void Delete() {
	  
		// ѡ�񶩵���¼
		Driver.findElement(
				By.xpath("//table[@class='l-grid-body-table']/tbody/tr/td[1]"))
				.click();

		// ���ɾ��
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[4]")).click();

		// ���������ȷ��
		Driver.findElement(
				By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']"))
				.click();

		// �ٴε��ȷ��
		Driver.findElement(
				By.xpath("//div[@class='l-dialog-buttons-inner']/div[1]/div[@class='l-dialog-btn-inner']"))
				.click();

		// �л�����frame
		Driver.switchTo().defaultContent();

		// �����ȫ�˳�
		Driver.findElement(By.xpath("//a[contains(text(), '��ȫ�˳�')]")).click();

		// ���������ȷ��
		Driver.findElement(
				By.xpath("//div[@class='l-dialog-buttons-inner']/div[2]/div[@class='l-dialog-btn-inner']"))
				.click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
	  
		// �ر������
		Driver.quit();
  }

}

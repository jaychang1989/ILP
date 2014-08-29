package com.ilp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCase_3 extends MainTest {
	
	public void inCrease() throws Exception {
		
		Thread.sleep(500);
		// ������
		((JavascriptExecutor) Driver).executeScript("arguments[0].click();",
				Driver.findElement(By.xpath("//map[@id='Map']/area[6]")));
		// Driver.findElement(By.xpath("//map[@id='Map']/area[6]")).click();

		Thread.sleep(500);
		// ������������б�
		Driver.findElement(By.xpath("//ul[@id='tree1']/li[@treedataindex='0']"))
				.click();

		// ���չ����Ķ�������
		Driver.findElement(
				By.xpath("//div[@class='l-body']/span[text()='��������']")).click();

		// �л�frame
		Driver.switchTo()
				.frame(Driver.findElement(By
						.xpath("//iframe[@src='manager/modules/orders/orders.jsp?sellerAccept=0']")));

		// �������
		Driver.findElement(By.xpath("//div[@id='mybarTool']/div[2]")).click();

		// ʹ��JS���ö�������
		((JavascriptExecutor) Driver)
				.executeScript("document.getElementById('orderDate').value='2014-08-21'");

		// ʹ��JS�����ͻ�����
		((JavascriptExecutor) Driver)
				.executeScript("document.getElementById('deliveryDate').value='2014-08-22'");

		// ���빫˾
		Driver.findElement(By.id("companyName")).clear();
		Driver.findElement(By.id("companyName")).sendKeys("�����й�̩����Ϣ���޹�˾");

		// �����ַ
		Driver.findElement(By.id("deliveryAddr")).clear();
		Driver.findElement(By.id("deliveryAddr")).sendKeys("��������ɽ����ͷ���վ");

		// ����绰
		Driver.findElement(By.id("phone")).clear();
		Driver.findElement(By.id("phone")).sendKeys("13511200021");

		// ������ϵ��
		Driver.findElement(By.id("linkman")).clear();
		Driver.findElement(By.id("linkman")).sendKeys("zhc");

		// ���������ϸ
		Driver.findElement(By.xpath("//img[@src='/ILP/images/add-detail.gif']"))
				.click();

		// ѡ�������б�
		Select selectCargoId = new Select(
				Driver.findElement(By.name("cargoId")));
		selectCargoId.selectByIndex(2);

		// Thread.sleep(1000);
		// selectCargoId.selectByVisibleText("CPU");
		//
		// Thread.sleep(1000);
		// selectCargoId.selectByValue("5");

		// ��������
		Driver.findElement(By.name("quantity")).clear();
		Driver.findElement(By.name("quantity")).sendKeys("10");

		// ѡ��λ
		Select selectUnit = new Select(Driver.findElement(By.name("unit")));
		selectUnit.selectByVisibleText("��");

		// �������ҳ��ȷ��
		Driver.findElement(By.id("saveOrderId")).click();
	}
	
	 @BeforeTest
	  public void beforeTest() {
		  
	  }

	  @AfterTest
	  public void afterTest() {
		
	  }
}

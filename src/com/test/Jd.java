package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Jd {
	WebDriver Driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  Actions action = new Actions(Driver);
	  
	  WebDriverWait wait = new WebDriverWait(Driver, 20);
	  
	  System.out.println("������ƶ����ֻ�");  
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("�ֻ�")));
	  
	  WebElement phone = Driver.findElement(By.linkText("�ֻ�"));
	  
	  action.moveToElement(phone).perform();
	  
	  Thread.sleep(2000);
	  
	  System.out.println("����ֻ�");
	  
	  //Driver.findElement(By.xpath("//a[@href='http://list.jd.com/9987-653-655.html']")).click();
	  //Driver.findElement(By.xpath("//em//a[text() = '�ֻ�']")).click();
	  
	  //���չ�����б���ֻ�
	  ((JavascriptExecutor) Driver).executeScript("arguments[0].click();", Driver.findElement(By.xpath("//em//a[text() = '�ֻ�']")));
	
	  
	  System.out.println("������빺�ﳵ");
	  
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@sku='981821']//div[@class='btns']/a[@class='btn-buy']")));
	  Driver.findElement(By.xpath("//li[@sku='981821']//div[@class='btns']/a[@class='btn-buy']")).click();
	  
	  String currentHandle = Driver.getWindowHandle();
	  
	  Set <String> Handles = Driver.getWindowHandles();
	  
	  for(String handle:Handles) {
		  if(handle.equals(currentHandle)) {
			  System.out.println(Driver.getTitle());
			  continue;
		  }
		  else {
			  Driver.switchTo().window(handle);
			  System.out.println(Driver.getTitle());
		  }
	  }
	  
	  //���ȥ���ﳵ
	  Driver.findElement(By.id("GotoShoppingCart")).click();
	  
	  //���ȥ����
	  wait = new WebDriverWait(Driver, 5);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("toSettlement")));
	  Driver.findElement(By.id("toSettlement")).click();
	  
	  //����޸��ջ�����Ϣ
	  Driver.findElement(By.className("step-action")).click();
	  
	  //ʹ���µ�ַ
	  System.out.println("ʹ���µ�ַ");
	  wait = new WebDriverWait(Driver, 5);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("consignee_radio_new")));
	  Driver.findElement(By.id("consignee_radio_new")).click();
	  
	  //ѡ��ʡ��
	  System.out.println("ѡ��ʡ��");
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("consignee_province")));
	  //Select select = new Select(Driver.findElement(By.id("consignee_province")));
	  //WebElement province = Driver.findElement(By.xpath("//div[@class='consignee-form']/div[2]//select[@id='consignee_province']"));
	  //WebElement province = Driver.findElement(By.id("consignee_province"));
	  //Driver.findElement(By.xpath("//div[@class='consignee-form']/div[2]//select[@id='consignee_province']")).click();
	  
	  Thread.sleep(2000);
	  Select select = new Select(Driver.findElement(By.xpath("//div[@class='consignee-form']/div[2]//select[@id='consignee_province']")));
	  select.selectByValue("19");
	  //select.selectByIndex(2);
	  
	  //ѡ�����
	  System.out.println("ѡ�����");
	  Thread.sleep(1000);
	  select = new Select(Driver.findElement(By.id("consignee_city")));
	  select.selectByValue("1607");
	  
	  //ѡ�����
	  System.out.println("ѡ�����");
	  Thread.sleep(1000);
	  select = new Select(Driver.findElement(By.id("consignee_county")));
	  select.selectByValue("3155");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  String URL = "http://www.jd.com";
	  
	  System.out.println("Open broswer....");
	  Driver = new ChromeDriver();
	  //Driver = new InternetExplorerDriver();
	  
	  Driver.get(URL);
	  
	  System.out.println("Maxmize broswer....");
	  Driver.manage().window().maximize();
	  
	  System.out.println("�����¼");
	  Driver.findElement(By.xpath("//li[@id='loginbar']/span/a[1]")).click();
	  
	  //�����û���
	  Driver.findElement(By.id("loginname")).clear();
	  Driver.findElement(By.id("loginname")).sendKeys("xxxx");
	  
	  //��������
	  Driver.findElement(By.id("nloginpwd")).clear();
	  Driver.findElement(By.id("nloginpwd")).sendKeys("xxxx");
	  
	  //�����¼
	  Driver.findElement(By.id("loginsubmit")).click();
	  
	  System.out.println("Login Success...");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  //Thread.sleep(5000);

	  //Driver.quit();
  }

}

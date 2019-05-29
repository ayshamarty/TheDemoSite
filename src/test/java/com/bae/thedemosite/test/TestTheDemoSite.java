package com.bae.thedemosite.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTheDemoSite {
	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");

		WebElement checkLogin = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		checkLogin.click();
		checkLogin = driver.findElement(By.name("username"));
		checkLogin.sendKeys("testName");
		checkLogin = driver.findElement(By.name("password"));
		checkLogin.sendKeys("password");
		checkLogin.submit();
		checkLogin = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		checkLogin.click();
		checkLogin = driver.findElement(By.name("username"));
		checkLogin.sendKeys("testName");
		checkLogin = driver.findElement(By.name("password"));
		checkLogin.sendKeys("password");
		checkLogin.submit();
		checkLogin = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertTrue(checkLogin.isDisplayed());
		Thread.sleep(10000);

	}

}
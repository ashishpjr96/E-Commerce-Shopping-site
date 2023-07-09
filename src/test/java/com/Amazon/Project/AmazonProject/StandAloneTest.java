package com.Amazon.Project.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.bewakoof.com/");
		
		driver.findElement(By.xpath("(//*[@class=\"menuSelect\"])[1]")).click(); ///landing page
		driver.findElement(By.xpath("//*[@title=\"Men's Black Valhalla Typography T-shirt-Front Bewakoof\"]")).click();//mens page
		driver.findElement(By.xpath("//span[normalize-space()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("(//*[@id=\"testSizes_M\"])[2]")).click();  //size page
		driver.findElement(By.xpath("//*[@class=\"undefined button iconDefault\"]")).click();
		
		driver.findElement(By.cssSelector("span[class='cartCount']")).click();  //cart page 
		
		String cartMessage=driver.findElement(By.cssSelector(".cartProductName")).getText();  
		Assert.assertTrue(cartMessage.equalsIgnoreCase("Men's Black Valhalla Typography T-Shirt"));
		
		
		driver.findElement(By.cssSelector(".pmts-btn")).click();//address 
		
		

		
		

	}

}

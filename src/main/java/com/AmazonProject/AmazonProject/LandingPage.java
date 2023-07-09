package com.AmazonProject.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	
WebDriver driver;

   public LandingPage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   
   }
   
   @FindBy(xpath="//a[@id='testMenuSelect-shop-men']//span[@class='menuSelect']")
   WebElement submit;
   
   
   
   public void mensPage()
   {
	 submit.click();
//	 MensPage mens=new MensPage(driver);
	// return mens;
   }
 //a[@id='testMenuSelect-shop-men']//span[@class='menuSelect']
   public void goTo()
   {
	   driver.get("https://www.bewakoof.com/");
   }
}

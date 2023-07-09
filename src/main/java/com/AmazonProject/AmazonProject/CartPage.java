package com.AmazonProject.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends MensPage {

	WebDriver driver;

	   public CartPage(WebDriver driver)
	   {
		   super(driver);
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	   
	   @FindBy(css="span[class='cartCount']")
	   WebElement clickonCart;
	   
	   @FindBy(css=".cartProductName")
	   WebElement message;
	   
	   
	   
	   
	   public void goToCart()
	   {
		   clickonCart.click();
	   }
	   
	   public String verifyProductMessage()
	   {
		   return message.getText();
	   }
}

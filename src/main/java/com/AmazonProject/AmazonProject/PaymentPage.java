package com.AmazonProject.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends CartPage {

	WebDriver driver;

	   public PaymentPage(WebDriver driver)
	   {
		   super(driver);
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	   
	   @FindBy(css=".pmts-btn")
	   WebElement pay;
	   
	   
	   public void goToPay()
	   {
		   pay.click();
	   }
}

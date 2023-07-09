package com.AmazonProject.AmazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPage extends LandingPage{

	
	WebDriver driver;

	   public MensPage(WebDriver driver)
	   {
		   super(driver);
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	   }
	
		
	   
	 @FindBy(xpath=" //*[@title=\"Men's Black Valhalla Typography T-shirt-Front Bewakoof\"]")
	 WebElement selectProduct;
	
	 @FindBy(xpath="//*[text()='ADD TO BAG']")
	 WebElement addToBag;
	 
	 
	 @FindBy(xpath="(//*[@id=\"testSizes_M\"])[2]")
	 WebElement selectSize;
	
	 @FindBy(xpath="//*[@class=\"undefined button iconDefault\"]")
	 WebElement doneButton;
 
	 public void  selectProducts()
	 {
		 selectProduct.click();
		 addToBag.click();
		 selectSize.click();
		 doneButton.click();
		

	 }
}

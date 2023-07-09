package com.Amazon.Project.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import com.AmazonProject.AmazonProject.CartPage;
import com.AmazonProject.AmazonProject.LandingPage;
import com.AmazonProject.AmazonProject.MensPage;
import com.AmazonProject.AmazonProject.PaymentPage;

public class SubmitOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
		landingPage.mensPage();

		MensPage mens = new MensPage(driver);
		mens.selectProducts();

		CartPage cart = new CartPage(driver);
		cart.goToCart();

		String confimationMSG = cart.verifyProductMessage();

		Assert.assertTrue(confimationMSG.equalsIgnoreCase("Men's Black Valhalla Typography T-Shirt"));

		PaymentPage payPage = new PaymentPage(driver);
		payPage.goToPay();

	}

}

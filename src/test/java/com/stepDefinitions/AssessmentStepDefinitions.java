package com.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.generic.StepBase;
import com.pageFactory.BuildHomePage;
import com.pageFactory.OrderCheckoutPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AssessmentStepDefinitions
{
	private StepBase objStepBase = new StepBase();
	private WebDriver driver;
	private WebDriverWait webdriverWait;
	private BuildHomePage objBuildHomePage = new BuildHomePage();
	private OrderCheckoutPage objOrderCheckoutPage = new OrderCheckoutPage();
	
	List<String> totalCartItmesPrice = new ArrayList<>();

	@Given("^I open the browser and navigate to build website homepage$")
	public void I_open_the_browser_and_navigate_to_build_website_homepage()
	{
		System.out.println("Test started...");
		driver = objStepBase.getDriver();
		webdriverWait = objStepBase.getWebdriverWait();
	}
	
	@Then("^I add one product with Suede Kohler K66266U name to the cart$")
	public void I_add_one_Suede_Kohler_K66266U_to_the_cart()
	{
		objBuildHomePage.searchProduct("Suede Kohler K66266U");
		objBuildHomePage.selectSeudeKohlerProduct();
		
		Assert.assertTrue("Correct product is not selected.", objBuildHomePage.getProductHeaderText().contains("Suede"));
		System.out.println(objBuildHomePage.getProductHeaderText());
		
		totalCartItmesPrice.add(objBuildHomePage.getProductPrice());
		
		objBuildHomePage.setProductQuantity("1");
		objBuildHomePage.clickAddToCartButton();
		
		System.out.println("Prices: ");
		for (String string : totalCartItmesPrice)
		{
			System.out.println(string);
		}
	}

	@Then("^I add one product with Cashmere Kohler K66266U name to the cart$")
	public void I_add_one_Cashmere_Kohler_K66266U_to_the_cart()
	{
		try 
		{
			objBuildHomePage.goToHomePage();
			Thread.sleep(5000L);
			objBuildHomePage.searchProduct("Cashmere Kohler K66266U");
			objBuildHomePage.selectCashmereKohlerProduct();
			
			Assert.assertTrue("Correct product is not selected.", objBuildHomePage.getProductHeaderText().contains("Cashmere"));
			System.out.println(objBuildHomePage.getProductHeaderText());
			
			totalCartItmesPrice.add(objBuildHomePage.getProductPrice());
			
			objBuildHomePage.setProductQuantity("1");
			objBuildHomePage.clickAddToCartButton();
			
			System.out.println("Prices: ");
			for (String string : totalCartItmesPrice) 
			{
				System.out.println(string);
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Then("^I add two product with Kohler K-5180-ST name to the cart$")
	public void I_add_two_product_with_Kohler_K_5180_ST_name_to_the_cart()
	{
		try 
		{
			objBuildHomePage.goToHomePage();
			Thread.sleep(5000L);
			objBuildHomePage.searchProduct("Kohler K-5180-ST");
						
			totalCartItmesPrice.add(objBuildHomePage.getProductPrice());
			
			objBuildHomePage.setProductQuantity("2");
			objBuildHomePage.clickAddToCartButton();
			
			System.out.println("Prices: ");
			for (String string : totalCartItmesPrice) 
			{
				System.out.println(string);
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
	}
	
	@Then("^I checkout from shopping$")
	public void I_checkout_from_shopping()
	{
		webdriverWait.until(ExpectedConditions.elementToBeClickable(OrderCheckoutPage.btnChekout));
		objOrderCheckoutPage.clickCheckoutButton();
	}
	
	@Then("^I select checkout as guest option$")
	public void I_select_checkout_as_guest_option()
	{
		objOrderCheckoutPage.clickCheckoutAsGuestButton();
	}
	
	@Then("^I enter (.*) in first name field of Shipping Address Form$")
	public void I_enter_firstName_in_Shipping_Address_Form(String firstName)
	{
		objOrderCheckoutPage.setFirstName(firstName);
	}
	
	@Then("^I enter (.*) in last name field of Shipping Address Form$")
	public void I_enter_lastName_in_Shipping_Address_Form(String lastName)
	{
		objOrderCheckoutPage.setLastName(lastName);
	}

	@Then("^I enter (.*) in company name field of Shipping Address Form$")
	public void I_enter_companyName_in_Shipping_Address_Form(String companyName)
	{
		objOrderCheckoutPage.setCompanyName(companyName);
	}

	@Then("^I enter (.*) in street address field of Shipping Address Form$")
	public void I_enter_street_address_in_Shipping_Address_Form(String streetAddress)
	{
		objOrderCheckoutPage.setStreetAddress(streetAddress);
	}
	
	@Then("^I enter (.*) in apartment address field of Shipping Address Form$")
	public void I_enter_apartment_address_in_Shipping_Address_Form(String apartmentName)
	{
		objOrderCheckoutPage.setApartmentName(apartmentName);
	}

	@Then("^I enter (.*) in zip code field of Shipping Address Form$")
	public void I_enter_zipcode_in_Shipping_Address_Form(String zipCode)
	{
		objOrderCheckoutPage.setZipCode(zipCode);
	}
	
	@Then("^I enter (.*) in city field of Shipping Address Form$")
	public void I_enter_city_in_Shipping_Address_Form(String city)
	{
		objOrderCheckoutPage.setCity(city);
	}
	
	@Then("^I select (.*) from state dropdown in Shipping Address Form$")
	public void I_select_state_from_dropdown_in_Shipping_Address_Form(String state)
	{
		objOrderCheckoutPage.selectState(state);
	}
	
	@Then("^I select (.*) from country dropdown in Shipping Address Form$")
	public void I_select_country_from_dropdown_in_Shipping_Address_Form(String country)
	{
		objOrderCheckoutPage.selectCountry(country);
	}
	
	@Then("^I enter (.*) in phone field of Shipping Address Form$")
	public void I_enter_phone_in_Shipping_Address_Form(String phone)
	{
		objOrderCheckoutPage.setPhoneNumber(phone);
	}
	
	@Then("^I enter (.*) in email field of Shipping Address Form$")
	public void I_enter_email_in_Shipping_Address_Form(String email)
	{
		objOrderCheckoutPage.setEmail(email);
	}

	@Then("^I enter (.*) in credit card number field of Shipping Address Form$")
	public void I_enter_creditCardNo_in_Shipping_Address_Form(String cardNumber)
	{
		objOrderCheckoutPage.setCreditCardNumber(cardNumber);
	}
	
	@Then("^I select (.*) in credit card month validity field of Shipping Address Form$")
	public void I_select_expiryMonth__validity_field_in_Shipping_Address_Form(String validityMonth)
	{
		objOrderCheckoutPage.selectExpiryMonth(validityMonth);
	}
	
	@Then("^I select (.*) in credit card year validity field of Shipping Address Form$")
	public void I_select_expiryYear_validity_field_in_Shipping_Address_Form(String validityYear)
	{
		objOrderCheckoutPage.selectExpiryYear(validityYear);
	}

	@Then("^I enter (.*) in cardName field of Shipping Address Form$")
	public void I_enter_cardName_in_Shipping_Address_Form(String cardName)
	{
		objOrderCheckoutPage.setCreditCardName(cardName);
	}
	
	@Then("^I enter (.*) in cvv field of Shipping Address Form$")
	public void I_enter_cvv_in_Shipping_Address_Form(String cvv)
	{
		objOrderCheckoutPage.setCreditCardSecurityCode(cvv);
	}
	
	@Then("^I click on Review Order button$")
	public void I_click_on_Review_Order_button()
	{
		objOrderCheckoutPage.clickReviewOrder();
	}
}

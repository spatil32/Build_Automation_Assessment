package com.pageFactory;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.generic.StepBase;

public class OrderCheckoutPage 
{
	//Static webelements on order page of build.com
	private StepBase objStepBase = new StepBase();
	private BuildHomePage objhomePage = new BuildHomePage();
	public static By btnChekout = By.cssSelector("div[class='button-group right']>a[href*='https://www.build.com/index.cfm?page=checkout:payments']");
	public static By btnCheckoutAsGuest = By.cssSelector("button[name='guestLoginSubmit']");
	public static By txtFirstName = By.cssSelector("input[id='shippingfirstname']");
	public static By txtLastName = By.cssSelector("input[id='shippinglastname']");
	public static By txtCompanyName = By.cssSelector("input[id='shippingcompany']");
	public static By txtStreetAddress = By.cssSelector("input[id='shippingaddress1']");
	public static By txtApartmentName = By.cssSelector("input[id='shippingaddress2']");
	public static By txtZipCode = By.cssSelector("input[id='shippingpostalcode']");
	public static By txtCityName = By.cssSelector("input[id='shippingcity']");
	public static By selectState = By.cssSelector("select[id='shippingstate_1']");
	public static By selectCountry = By.cssSelector("select[id='shippingcountryID']");
	public static By txtPhoneNumber = By.cssSelector("input[id='shippingphonenumber']");
	public static By txtEmail = By.cssSelector("input[id='emailAddress']");
	public static By txtCreditCardNo = By.cssSelector("input[id='creditCardNumber']");
	public static By selectValidityMonth = By.cssSelector("select[id='creditCardMonth']");
	public static By selectCreditCardYear = By.cssSelector("select[id='creditCardYear']");
	public static By txtCreditCardName = By.cssSelector("input[id='creditcardname']");
	public static By txtCreditCardCVV = By.cssSelector("input[id='creditCardCVV2']");
	public static By btnReviewOrder = By.cssSelector("input[value='Review Order']");
	public static By lblTotalOrderPrice = By.cssSelector("div[id='grandtotalamount']");
	public static By lblTaxPrice = By.cssSelector("div[id='taxAmount']");
	public static By priceList = By.cssSelector("td[class='total']");
	
	/**
	 * This method is used to click on checkout button
	 * @author Shreyas Patil
	 */
	public void clickCheckoutButton()
	{
		objhomePage.waitForElementToBeClickable(btnChekout);
		objStepBase.getDriver().findElement(btnChekout).click();
	}

	/**
	 * This method is used to click on checkout as guest button
	 * @author Shreyas Patil
	 */
	public void clickCheckoutAsGuestButton()
	{
		objhomePage.waitForElementToBeClickable(btnCheckoutAsGuest);
		objStepBase.getDriver().findElement(btnCheckoutAsGuest).click();
	}

	/**
	 * This method is used to set first name
	 * @param firstName first name
	 * @author Shreyas Patil
	 */
	public void setFirstName(String firstName)
	{
		objStepBase.getDriver().findElement(txtFirstName).clear();
		objStepBase.getDriver().findElement(txtFirstName).sendKeys(firstName);
	}

	/**
	 * This method is used to set last name
	 * @param lastName last name
	 * @author Shreyas Patil
	 */
	public void setLastName(String lastName)
	{
		objStepBase.getDriver().findElement(txtLastName).clear();
		objStepBase.getDriver().findElement(txtLastName).sendKeys(lastName);
	}

	/**
	 * This method is used to set company name
	 * @param companyName company name
	 * @author Shreyas Patil
	 */
	public void setCompanyName(String companyName)
	{
		objStepBase.getDriver().findElement(txtCompanyName).clear();
		objStepBase.getDriver().findElement(txtCompanyName).sendKeys(companyName);
	}
	
	/**
	 * This method is used to set street address
	 * @param streetAddress street address
	 * @author Shreyas Patil
	 */
	public void setStreetAddress(String streetAddress)
	{
		objStepBase.getDriver().findElement(txtStreetAddress).clear();
		objStepBase.getDriver().findElement(txtStreetAddress).sendKeys(streetAddress);
	}
	
	/**
	 * This method is used to set apartment
	 * @param apartmentName apartment
	 * @author Shreyas Patil
	 */
	public void setApartmentName(String apartmentName)
	{
		objStepBase.getDriver().findElement(txtApartmentName).clear();
		objStepBase.getDriver().findElement(txtApartmentName).sendKeys(apartmentName);
	}

	/**
	 * This method is used to set zipcode
	 * @param zipCode zip code
	 * @author Shreyas Patil
	 */
	public void setZipCode(String zipCode)
	{
		objStepBase.getDriver().findElement(txtZipCode).clear();
		objStepBase.getDriver().findElement(txtZipCode).sendKeys(zipCode);
	}

	/**
	 * This method is used to city name
	 * @param city city name
	 * @author Shreyas Patil
	 */
	public void setCity(String city)
	{
		objStepBase.getDriver().findElement(txtCityName).clear();
		objStepBase.getDriver().findElement(txtCityName).sendKeys(city);
	}

	/**
	 * This method is used to select state
	 * @param state state name
	 * @author Shreyas Patil
	 */
	public void selectState(String state)
	{
		Select stateSelection = new Select(objStepBase.getDriver().findElement(selectState));
		stateSelection.selectByVisibleText(state);
	}

	/**
	 * This method is used to select country name
	 * @param country country name
	 * @author Shreyas Patil
	 */
	public void selectCountry(String country)
	{
		Select countrySelection = new Select(objStepBase.getDriver().findElement(selectCountry));
		countrySelection.selectByVisibleText(country);
	}

	/**
	 * This method is used to set phone
	 * @param phoneNumber phone
	 * @author Shreyas Patil
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		objStepBase.getDriver().findElement(txtPhoneNumber).clear();
		objStepBase.getDriver().findElement(txtPhoneNumber).sendKeys(phoneNumber);
	}

	/**
	 * This method is used to set email
	 * @param email email id
	 * @author Shreyas Patil
	 */
	public void setEmail(String email)
	{
		objStepBase.getDriver().findElement(txtEmail).clear();
		objStepBase.getDriver().findElement(txtEmail).sendKeys(email);
	}
	
	/**
	 * This method is used to set credit card number
	 * @param creditCardNumber credit card number
	 * @author Shreyas Patil
	 */
	public void setCreditCardNumber(String creditCardNumber)
	{
		objStepBase.getDriver().findElement(txtCreditCardNo).clear();
		objStepBase.getDriver().findElement(txtCreditCardNo).sendKeys(creditCardNumber);		
	}

	/**
	 * This method is used to set month name
	 * @param month month name
	 * @author Shreyas Patil
	 */
	public void selectExpiryMonth(String month)
	{
		Select expiryMonth = new Select(objStepBase.getDriver().findElement(selectValidityMonth));
		expiryMonth.selectByVisibleText(month);
	}

	/**
	 * This method is used to set year
	 * @param year year
	 * @author Shreyas Patil
	 */
	public void selectExpiryYear(String year)
	{
		Select expiryYear = new Select(objStepBase.getDriver().findElement(selectCreditCardYear));
		expiryYear.selectByVisibleText(year);
	}

	/**
	 * This method is used to set name on credit card
	 * @param creditCardName account name
	 * @author Shreyas Patil
	 */
	public void setCreditCardName(String creditCardName)
	{
		objStepBase.getDriver().findElement(txtCreditCardName).clear();
		objStepBase.getDriver().findElement(txtCreditCardName).sendKeys(creditCardName);		
	}

	/**
	 * This method is used to set CVV
	 * @param creditCardSecurityCode cvv
	 * @author Shreyas Patil
	 */
	public void setCreditCardSecurityCode(String creditCardSecurityCode)
	{
		objStepBase.getDriver().findElement(txtCreditCardCVV).clear();
		objStepBase.getDriver().findElement(txtCreditCardCVV).sendKeys(creditCardSecurityCode);		
	}
	
	/**
	 * This method is used to click review order button
	 * @author Shreyas Patil
	 */
	public void clickReviewOrder()
	{
		objhomePage.waitForElementToBeClickable(btnReviewOrder);
		objStepBase.getDriver().findElement(btnReviewOrder).click();
	}
	
	/**
	 * This method is used to confirm review order page is visited
	 * @param url review order page URL
	 * @author Shreyas Patil
	 */
	public void confirmReviewOrderPage(String url)
	{
		Assertions.assertThat(objStepBase.getDriver().getCurrentUrl().equalsIgnoreCase(url));
	}

	/**
	 * This method is used to verify CA tax
	 * @author Shreyas Patil
	 */
	public void verifyCATax()
	{
		//AssertJ to validate CA tax
		Assertions.assertThat(objStepBase.getDriver().findElement(lblTaxPrice).getText().trim().equals("$0.00"));
	}
	
	/**
	 * This method is used to verify grand total
	 * @author Shreyas Patil
	 */
	public void verifyGrandTotal()
	{
		//webelement with total price
		String grandTotal = objStepBase.getDriver().findElement(lblTotalOrderPrice).getText().trim();
		double totalPrice = 0.0;
		//individual prices of the products in cart
		List<WebElement> individualPrices = objStepBase.getDriver().findElements(OrderCheckoutPage.priceList);
		for (WebElement webElement : individualPrices) 
		{
			totalPrice = totalPrice + Double.parseDouble(webElement.getText().trim().substring(1));
		}
		//AssertJ to validate total bill amount
		Assertions.assertThat(grandTotal.contains(String.valueOf(totalPrice)));
	}
}
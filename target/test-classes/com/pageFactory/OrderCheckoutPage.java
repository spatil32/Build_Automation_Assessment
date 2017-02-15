package com.pageFactory;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.generic.StepBase;

public class OrderCheckoutPage 
{
	private StepBase objStepBase = new StepBase();
	public static By btnChekout = By.cssSelector("div[class='button-group right']>a[href*='https://www.build.com/index.cfm?page=checkout:payments']");
	//public static By btnChekout = By.xpath(".//*[@id='checkoutbuttons']/fieldSet/a");
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
	
	public void clickCheckoutButton()
	{
		objStepBase.getDriver().findElement(btnChekout).click();
	}

	public void clickCheckoutAsGuestButton()
	{
		objStepBase.getDriver().findElement(btnCheckoutAsGuest).click();
	}

	public void setFirstName(String firstName)
	{
		objStepBase.getDriver().findElement(txtFirstName).clear();
		objStepBase.getDriver().findElement(txtFirstName).sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		objStepBase.getDriver().findElement(txtLastName).clear();
		objStepBase.getDriver().findElement(txtLastName).sendKeys(lastName);
	}

	public void setCompanyName(String companyName)
	{
		objStepBase.getDriver().findElement(txtCompanyName).clear();
		objStepBase.getDriver().findElement(txtCompanyName).sendKeys(companyName);
	}
	
	public void setStreetAddress(String streetAddress)
	{
		objStepBase.getDriver().findElement(txtStreetAddress).clear();
		objStepBase.getDriver().findElement(txtStreetAddress).sendKeys(streetAddress);
	}
	
	public void setApartmentName(String apartmentName)
	{
		objStepBase.getDriver().findElement(txtApartmentName).clear();
		objStepBase.getDriver().findElement(txtApartmentName).sendKeys(apartmentName);
	}

	public void setZipCode(String zipCode)
	{
		objStepBase.getDriver().findElement(txtZipCode).clear();
		objStepBase.getDriver().findElement(txtZipCode).sendKeys(zipCode);
	}

	public void setCity(String city)
	{
		objStepBase.getDriver().findElement(txtCityName).clear();
		objStepBase.getDriver().findElement(txtCityName).sendKeys(city);
	}

	public void selectState(String state)
	{
		Select stateSelection = new Select(objStepBase.getDriver().findElement(selectState));
		stateSelection.selectByVisibleText(state);
	}

	public void selectCountry(String country)
	{
		Select countrySelection = new Select(objStepBase.getDriver().findElement(selectCountry));
		countrySelection.selectByVisibleText(country);
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		objStepBase.getDriver().findElement(txtPhoneNumber).clear();
		objStepBase.getDriver().findElement(txtPhoneNumber).sendKeys(phoneNumber);
	}

	public void setEmail(String email)
	{
		objStepBase.getDriver().findElement(txtEmail).clear();
		objStepBase.getDriver().findElement(txtEmail).sendKeys(email);
	}
	
	public void setCreditCardNumber(String creditCardNumber)
	{
		objStepBase.getDriver().findElement(txtCreditCardNo).clear();
		objStepBase.getDriver().findElement(txtCreditCardNo).sendKeys(creditCardNumber);		
	}

	public void selectExpiryMonth(String month)
	{
		Select expiryMonth = new Select(objStepBase.getDriver().findElement(selectValidityMonth));
		expiryMonth.selectByVisibleText(month);
	}

	public void selectExpiryYear(String year)
	{
		Select expiryYear = new Select(objStepBase.getDriver().findElement(selectCreditCardYear));
		expiryYear.selectByVisibleText(year);
	}

	public void setCreditCardName(String creditCardName)
	{
		objStepBase.getDriver().findElement(txtCreditCardName).clear();
		objStepBase.getDriver().findElement(txtCreditCardName).sendKeys(creditCardName);		
	}

	public void setCreditCardSecurityCode(String creditCardSecurityCode)
	{
		objStepBase.getDriver().findElement(txtCreditCardCVV).clear();
		objStepBase.getDriver().findElement(txtCreditCardCVV).sendKeys(creditCardSecurityCode);		
	}
	
	public void clickReviewOrder()
	{
		objStepBase.getDriver().findElement(btnReviewOrder).click();
	}
	
	public void confirmReviewOrderPage(String url)
	{
		Assertions.assertThat(objStepBase.getDriver().getCurrentUrl().equalsIgnoreCase(url));
	}

}

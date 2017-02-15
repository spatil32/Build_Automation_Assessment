package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.generic.StepBase;

public class BuildHomePage 
{
	private StepBase objStepBase = new StepBase();
	public static By productSearchBox = By.cssSelector("input[id='search_txt']");
	public static By reSearchProduct = By.cssSelector("input[id='headerSearchInput']");
	public static By productSearchButton = By.cssSelector("button[class='button-primary search-site-search']");
	public static By reSearchButton = By.cssSelector("button[id='headerSearch']");
	//public static By seude_kohler_product = By.cssSelector("li[class='media'][data-original-title='Suede<br>$740.03 / Made To Order']");
	public static By seude_kohler_product = By.cssSelector("img[alt='Suede']");		
	public static By product_header_text = By.cssSelector("h2[class='sub-text js-sub-heading']");
	public static By productPrice = By.cssSelector("div[class='text-price']>span[class*='js-price']");
	public static By productQuantity = By.cssSelector("input[name='qty']");
	public static By btnContinueShopping = By.cssSelector("button[class='button secondary dropdown-toggle']");
	public static By btnAddToCart = By.cssSelector("button[class*='button-primary add-to-cart js-add-to-cart btn-lg']");
	public static By homePageLink = By.cssSelector("a[href*='/?intcmp=cart_home']");
	public static By cashmere_kohler_product = By.cssSelector("li[class='media'][data-original-title='Cashmere<br>$740.03 / 9 In Stock']");
	
	
	public void clickProductSearchBox()
	{
		objStepBase.getDriver().findElement(productSearchBox).click();
	}

	public void clickProductSearchButton()
	{
		objStepBase.getDriver().findElement(productSearchButton).click();
	}
	
	public void selectSeudeKohlerProduct()
	{
		objStepBase.getDriver().findElement(seude_kohler_product).click();
	}
	
	public void selectCashmereKohlerProduct()
	{
		objStepBase.getDriver().findElement(cashmere_kohler_product).click();
	}

	public String getProductHeaderText()
	{
		return objStepBase.getDriver().findElement(product_header_text).getText().trim();
	}
	
	public String getProductPrice()
	{
		return objStepBase.getDriver().findElement(productPrice).getText().trim();
	}
	
	public void setProductQuantity(String quantity)
	{
		WebElement element = objStepBase.getDriver().findElement(productQuantity);
		((JavascriptExecutor)objStepBase.getDriver()).executeScript("arguments[0].setAttribute('value', '" + quantity +"')", element);
	}
	
	public void clickAddToCartButton()
	{
		objStepBase.getDriver().findElement(btnAddToCart).click();
	}
		
	public void clickContinueShoppingButton()
	{
		objStepBase.getDriver().findElement(btnContinueShopping).click();
	}
	
	public void goToHomePage()
	{
		try 
		{
			Thread.sleep(10000L);
			objStepBase.getDriver().get("https://www.build.com/");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchProduct(String productName)
	{
		objStepBase.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(productSearchBox));
		objStepBase.getDriver().findElement(productSearchBox).clear();
		objStepBase.getDriver().findElement(productSearchBox).sendKeys(productName);
		objStepBase.getDriver().findElement(productSearchButton).click();
	}
	
	public void searchNewProduct(String productName)
	{
		objStepBase.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(reSearchProduct));
		objStepBase.getDriver().findElement(reSearchProduct).clear();
		objStepBase.getDriver().findElement(reSearchProduct).sendKeys(productName);
		objStepBase.getDriver().findElement(reSearchButton).click();
	}
}

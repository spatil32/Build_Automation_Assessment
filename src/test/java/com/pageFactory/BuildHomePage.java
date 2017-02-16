package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.generic.StepBase;

public class BuildHomePage 
{
	//Static webelements on homepage of build.com
	private StepBase objStepBase = new StepBase();
	public static By productSearchBox = By.cssSelector("input[id='search_txt']");
	public static By reSearchProduct = By.cssSelector("input[id='headerSearchInput']");
	public static By productSearchButton = By.cssSelector("button[class='button-primary search-site-search']");
	public static By reSearchButton = By.cssSelector("#search_txt");
	public static By seude_kohler_product = By.cssSelector("li[class='media'][data-original-title='Suede<br>$740.03 / Made To Order']");
	public static By product_header_text = By.cssSelector("h2[class='sub-text js-sub-heading']");
	public static By productPrice = By.cssSelector("div[class='text-price']>span[class*='js-price']");
	public static By productQuantity = By.cssSelector("input[name='qty']");
	public static By btnContinueShopping = By.cssSelector("button[class='button secondary dropdown-toggle']");
	public static By btnAddToCart = By.cssSelector("button[class*='button-primary add-to-cart js-add-to-cart btn-lg']");
	public static By homePageLink = By.cssSelector("a[href*='/?intcmp=cart_home']");
	public static By cashmere_kohler_product = By.cssSelector("li[class='media'][data-original-title='Cashmere<br>$740.03 / 9 In Stock']");

	/**
	 * This method is used to wait for the element until it becomes clickable by webdriver
	 * @author Shreyas Patil
	 * @param element webelement
	 */
	public void waitForElementToBeClickable(By element)
	{
		objStepBase.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method is used to click on product search box
	 * @author Shreyas Patil
	 */
	public void clickProductSearchBox()
	{
		waitForElementToBeClickable(productSearchBox);
		objStepBase.getDriver().findElement(productSearchBox).click();
	}

	/**
	 * This method is used to click on product search button
	 * @author Shreyas Patil
	 */
	public void clickProductSearchButton()
	{
		waitForElementToBeClickable(productSearchButton);
		objStepBase.getDriver().findElement(productSearchButton).click();
	}
	
	/**
	 * This method is used to select Suede Kohler K66266U product
	 * @author Shreyas Patil
	 */
	public void selectSeudeKohlerProduct()
	{
		waitForElementToBeClickable(seude_kohler_product);
		objStepBase.getDriver().findElement(seude_kohler_product).click();
	}
	
	/**
	 * This method is used to select Cashmere Kohler K66266U product
	 * @author Shreyas Patil
	 */
	public void selectCashmereKohlerProduct()
	{
		waitForElementToBeClickable(cashmere_kohler_product);
		objStepBase.getDriver().findElement(cashmere_kohler_product).click();
	}

	/**
	 * This method is used to verify if right product is selected
	 * @author Shreyas Patil
	 * @return product headet text
	 */
	public String getProductHeaderText()
	{
		return objStepBase.getDriver().findElement(product_header_text).getText().trim();
	}

	/**
	 * This method is used to return the product price
	 * @author Shreyas Patil
	 * @return product price
	 */
	public String getProductPrice()
	{
		return objStepBase.getDriver().findElement(productPrice).getText().trim();
	}

	/**
	 * This method is used to select product quantity to add to the basket
	 * @param quantity number of products
	 * @author Shreyas Patil
	 */
	public void setProductQuantity(String quantity)
	{
		WebElement element = objStepBase.getDriver().findElement(productQuantity);
		((JavascriptExecutor)objStepBase.getDriver()).executeScript("arguments[0].setAttribute('value', '" + quantity +"')", element);
	}

	/**
	 * This method is used to click Add to cart button
	 * @author Shreyas Patil
	 */
	public void clickAddToCartButton()
	{
		waitForElementToBeClickable(btnAddToCart);
		objStepBase.getDriver().findElement(btnAddToCart).click();
	}

	/**
	 * This method is used to click continue shopping button
	 * @author Shreyas Patil
	 */
	public void clickContinueShoppingButton()
	{
		waitForElementToBeClickable(btnContinueShopping);
		objStepBase.getDriver().findElement(btnContinueShopping).click();
	}
	
	/**
	 * This method is used to search product by name
	 * @param productName name of the product
	 * @author Shreyas Patil
	 */
	public void searchProduct(String productName)
	{
		objStepBase.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(productSearchBox));
		objStepBase.getDriver().findElement(productSearchBox).clear();
		objStepBase.getDriver().findElement(productSearchBox).sendKeys(productName);
		objStepBase.getDriver().findElement(productSearchButton).click();
	}
	
	/**
	 * This method is used to search new product once a product is added to cart
	 * @param productName name of the product
	 * @author Shreyas Patil
	 */
	public void searchNewProduct(String productName)
	{
		objStepBase.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(reSearchProduct));
		objStepBase.getDriver().findElement(reSearchProduct).clear();
		objStepBase.getDriver().findElement(reSearchProduct).sendKeys(productName);
		objStepBase.getDriver().findElement(reSearchButton).click();
	}
}
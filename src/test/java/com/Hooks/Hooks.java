/*******************************************************************************
 * Copyright (c) 2017 Shreyas Patil.
 * All rights reserved. This assessment framework or any portion thereof
 * may not be reproduced or used in any manner whatsoever
 * without the express written permission of the publisher
 * except for the use to review for assessment results by the members of build.com.
 *
 * Contributors:
 *     Shreyas Patil
 *******************************************************************************/
package com.Hooks;
import com.generic.StepBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * This class contains Hooks method that apply before and after each scenario
 * @author Shreyas Patil
 */
public class Hooks 
{
	public Scenario currentScenario;
	StepBase objStepBase = new StepBase();
	
	/**
	 * This method does setup for each scenario that is being tested
	 * @param scenario scenario for each test
	 */
	@Before
	public void applyHook(Scenario scenario)
	{
		this.currentScenario = scenario;
		objStepBase.setUp(scenario);
	}

	/**
	 * This method does de-initialization logic for each scenario that is being tested
	 * @param scenario scenario for each test
	 */
	@After
	public void removeHook(Scenario scenario) 
	{
		objStepBase.tearDown(scenario);
	}	
}
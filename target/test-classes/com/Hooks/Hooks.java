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
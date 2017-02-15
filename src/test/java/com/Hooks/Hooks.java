package com.Hooks;
import com.generic.StepBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * @ScriptName    : Hooks
 * @Description   : This class contains Hooks method that apply before and after each scenario
 * @Author        : Shreyas Patil
 * @Creation Date : 14 Feb 2017                       
 */
public class Hooks 
{
	public Scenario currentScenario;
	StepBase objStepBase = new StepBase();
	@Before
	public void applyHook(Scenario scenario)
	{
		this.currentScenario = scenario;
		objStepBase.setUp(scenario);
	}

	@After
	public void removeHook(Scenario scenario) 
	{
		objStepBase.tearDown(scenario);
	}	
}

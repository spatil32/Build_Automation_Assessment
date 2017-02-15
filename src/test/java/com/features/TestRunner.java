package com.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		features = {"src/test/java/com/features"},
		glue = {"com.Hooks", "com.stepDefinitions"},
		tags = {"@Build"},
		monochrome = true,
		format = {
				"pretty",
				"html:src/test/java/com/testresult/cucumber-report",
				"junit:src/test/java/com/testresult/cucumber-report/cucumber.xml",
				"json:src/test/java/com/testresult/cucumber-report/cucumber.json"
		})
/**
 * @ScriptName    : TestRunner
 * @Description   : This class is used to run feature   
 * @Author        : Shreyas Patil
 * @Creation Date : 14 Feb 2017                       
 */
public class TestRunner
{ 	
}
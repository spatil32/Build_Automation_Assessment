# Build_Automation_Assessment
This project is the automation framework development project for Assessment of Build.com.
The framework is made generic to test the test case on Internet Explorer, Chrome & Firefox browser.

Instructions to execute the project:
Step 1: Set browser name i.e. either firefox, chrome or ie & url in config.properties file.
Step 2: Open command prompt at the base directory of project and execute using "mvn install" command.

Requirements:
- Apache Maven 3.3.9
- Java 1.7 or above
- Firefox v.10 or v.12
- Chrome v.40 or v.42
- IE v.9 or v.10
To run the framework for browser versions other than the specified, then you need to download the drivers for Internet Explorer, Chrome and Gecko
diver for Firefox that will support the browser version on your machine.

Link to download drivers: 
a. Chrome Drivers: https://chromedriver.storage.googleapis.com/index.html
b. IE drivers: http://selenium-release.storage.googleapis.com/index.html

Framework Structure:
This framework is built using Maven build tool with related dependencies in pom.xml.
The execution is triggered internally using TestRunner & Hooks class which used cucumber-jUnit dependencies to create a webdriver setup for the current
scenario and then executes steps provided in test case feature file to create cucumber HTML report at the end.

Packages & Files:
src/test/java folder- 
A. com.features:
  i. TestRunner.java : This is the main class which triggers the execution with the help of CucumberOptions annotations. It contains path
                       to store cucumber html, xml and json reports as well as path to the feature file where test case is written.
  ii. Assessment.feature: This is the feature file where test case is written in text format. THe specific steps in feature file maps to
                        step definitions.

B. com.generic:
   i. StepBase.java: This class contains generic functionalities like setup/teardown test environment. It reads the config.properties
                     file at the root directory of project and reads variable values for URL, Browser and driverServerPath from it.
                     According to the values specified for browser and URL, it creates webdriver instance and starts the execution.

C. com.Hooks:
    i. Hooks.java: This is the important class in triggering the execution. Once, the trigger request is passed from TestRunner.java class,
                   Hooks class maintains the specified instance of webdriver for current scenario or test case.

D. com.PageFacory: The project is designed using POM (Page-Object Model) structure where webelements and functionalities specifically related
                    to those webelements on separate webpage are mapped to a single java class.
    i. BuildHomePage.java: It contains WebElement paths (css Selectors) and functions related objects on Build website homepage.
    ii. OrderCheckoutPage.java: It contains WebElement paths (css Selectors) and functions related objects on Build website order checkout page.
    
E. com.stepDefinitions:
    i. AssessmentStepDefinitions.java: This is the wrapper class which wraps the wendriver functions related to test cases and corrousponding 
                                       steps provided in test case feature file.
                                       
F. com.testResult: This is the path where cucumber HTML reports are generated.

doc folder-
This folder contains JavaDocs for the project.

Execution_Video folder-
This folder contains the demo execution video executed on firefox browser from my machine.

config.properties file-
confuguration file used to set value of browser, url and driver server path.

pom.xml-
Maven dependency file.

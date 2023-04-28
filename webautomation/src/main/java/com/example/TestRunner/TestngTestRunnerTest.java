package com.example.TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions

(
	// features ="classpath:feature",
		   features ="classpath:feature/01SignUp.feature",
		/// features ="classpath:feature/02MyProfile.feature",
		//  features ="classpath:feature/03ProfileVerification.feature",
		// features ="classpath:feature/04Ecom.feature",
		// features ="classpath:feature/05MyOrder.feature",
		// features ="classpath:feature/06CreateFeedPost.feature",
		// features ="classpath:feature/APIAutomation.feature",
 
glue="com.example.StepDefinitions",
monochrome=false,
 tags="@Run",
//////glue="stepDefinitions",stepNotifications=true,tags="@SmokeTest or @RegressionTest",
//glue="stepDefinitions",stepNotifications=true,tags="@SmokeTest and @RegressionTest",
//glue="stepDefinitions",stepNotifications=true,tags="not @SanityTest"
// plugin= {"html:target/cucumber.html", "json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failed_scenarios.txt"}
// ),

plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml","com.epam.reportportal.cucumber.ScenarioReporter"})


//AbstractTestNGCucumberTests - This is class which provided all wrappers to run our cucumber test through TestNG
public class TestngTestRunnerTest extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}

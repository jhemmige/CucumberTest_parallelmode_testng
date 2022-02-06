package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt"
				},
		
features= "@target/failedrerun.txt",
	//features="src/test/resources/parallel/AddingCustomer.feature",		
//features="src/test/resources/Appfeatures/LoginPage.feature",

//features= "src/test/resources/Appfeatures/AdministrationPage.feature",
glue = {"parallel"},
dryRun= false, //before running the actual run, every step is created correctly
monochrome= true //removes unneccessary characters from console window. Refer to  "/Users/jayashreehemmige/Documents/Selenium/Selenium Hybrid Framework_youtube/malformed_characters_in_cucumber_test.png"

)

public class FailedRun extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		
		return super.scenarios();

}
}

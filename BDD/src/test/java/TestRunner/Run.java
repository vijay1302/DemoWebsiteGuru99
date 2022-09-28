package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Login.feature",
		glue="StepDef",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-reportnew/Report1.html","json:target/cucumber-reportnew/Report2.json"}
		
		
		)

public class Run {

}

package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
features = {"src/test/resources/Signup/signup.feature"},
glue="StepDefinition",
tags= "@Signup",
plugin={"html:testoutput/Nidhi.html","junit:testoutput/Nidhi.xml","json:testoutput/Nidhi.json"}
)
public class Test_Runner extends AbstractTestNGCucumberTests{
	

}

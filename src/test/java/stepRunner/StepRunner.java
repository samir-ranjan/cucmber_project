package stepRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features=".//target/login.feature",
glue="StepDefination",
dryRun=false,
monochrome=true,
plugin= {"pretty","html:test-out"}
		)
public class StepRunner {

}

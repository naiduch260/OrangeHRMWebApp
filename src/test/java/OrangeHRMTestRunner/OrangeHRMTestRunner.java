package OrangeHRMTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/FeatureFiles",
glue="StepDefenitationFiles",
tags="@p2",
monochrome=true,
dryRun=false,
plugin= {"pretty", "html:target/cucumber.html"})

public class OrangeHRMTestRunner extends AbstractTestNGCucumberTests {

}

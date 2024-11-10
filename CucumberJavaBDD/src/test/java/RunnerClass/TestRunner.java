package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\test\\java\\Features",
glue= "StepDefinitions",
monochrome=true,


plugin= {"pretty","html:target/HtmlReports",
		"json:target/JSONReports/report.json"}

		)


public class TestRunner   extends AbstractTestNGCucumberTests {

}

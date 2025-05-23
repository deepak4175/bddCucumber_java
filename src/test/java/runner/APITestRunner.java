package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature",
                 plugin = {"pretty",
                            "json:target/cucumber-parallel.json",
                            "html:target/cucumber-parallel.html"},
                 glue = "stepdef",
                 monochrome = false,
                 tags = "@API")
public class APITestRunner {

}

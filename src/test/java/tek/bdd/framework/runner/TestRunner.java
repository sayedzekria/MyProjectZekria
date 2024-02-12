package tek.bdd.framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "tek.bdd.framework.steps",
        tags = "",
        dryRun = false,
        plugin = {
                "html:target/cucumber_report/report.html",
                "json:target/jsonReports/report.json"
        }
)
public class TestRunner {


}

package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;


@RunWith( Cucumber.class)
@ExtendWith( org.junit.jupiter.api.extension.Extension.class )
@CucumberOptions(
        features = "src/test/java/resources/Features",
        plugin={ "html:target/Reports/user_login/HtmlReports.html","json:target/Reports/user_login/reports.json","junit:target/Reports/user_login/JUnit_reports.junit" },

        publish=true,
        dryRun = true,
        glue={"StepDefinitions"}
)

public class TestRunner {


}

package WorldStats.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/WorldStats/features"},
    glue = {"WorldStats/StepDefs","WorldStats/Hooks"},
        publish = false
    )

    public class TestRunner {

    }



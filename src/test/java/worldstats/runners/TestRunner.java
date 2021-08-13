package worldstats.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/WorldStats/features"},
    glue = {"worldstats/stepdefs", "worldstats/hooks"},
        publish = true
    )

    public class TestRunner {

    }



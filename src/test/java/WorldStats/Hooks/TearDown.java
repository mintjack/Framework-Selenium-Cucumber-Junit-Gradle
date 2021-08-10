package WorldStats.Hooks;

import WorldStats.Pages.Base;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TearDown extends Base {

    private WebDriver driver;

    public TearDown() {
        this.driver = Setup.driver;
    }

    @After
    public void quitDriver(Scenario scenario){
        if(scenario.isFailed()){
            saveScreenshotsForScenario(scenario);
        }
        System.out.println("in After hook");
        this.driver.quit();
    }

    private void saveScreenshotsForScenario(final Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","Failure - " +  scenario.getName());
        //scenario.embed(screenshot, "image/png"); //commented out by Sarah
    }
}

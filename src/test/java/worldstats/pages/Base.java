package worldstats.pages;

import worldstats.helpers.Wait;
import worldstats.hooks.Setup;

import org.openqa.selenium.WebDriver;


public class Base {
    protected final WebDriver driver;
    protected final Wait wait;

    public Base() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}

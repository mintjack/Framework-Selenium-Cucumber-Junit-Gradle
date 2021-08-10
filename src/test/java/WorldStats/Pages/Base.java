package WorldStats.Pages;

import WorldStats.Helpers.Wait;
import WorldStats.Hooks.Setup;

import org.openqa.selenium.WebDriver;


public class Base {
    protected WebDriver driver;
    protected Wait wait;

    public Base() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}

package WorldStats.StepDefs;

import WorldStats.Pages.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Titles extends Base {

    private static final String HOME_PAGE_URL = "https://www.worldometers.info";

    @Given("a user navigates to Homepage {string}")
    public void a_user_navigates_to_homepage(String path) {
        driver.get(HOME_PAGE_URL + path);
        wait.forLoading(5);
    }
    @Then("page title {string} is displayed")
    public void page_title_is_displayed(String expectedTitle) {
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }

}

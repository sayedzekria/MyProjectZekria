package tek.bdd.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tek.bdd.framework.page.CreateAccountPage;
import tek.bdd.framework.page.HomePage;
import tek.bdd.framework.utility.SeleniumUtilities;

import java.awt.*;

public class HomePageSteps extends SeleniumUtilities {
    @Given("Open Browser and Navigate to Insurance Application")
    public void openBrowserAndNavigateToTekInsuranceApp() {
        setupBrowser();
    }

    @Then("Validate Tek Insurance App on the left corner")
    public void validateTekInsuranceAppTitle() {
        String actualTitle = getElementText(HomePage.VALIDATE_HOME_PAGE_TITLE);
        // assert here validate the conditions fail or pass
        Assert.assertEquals("TEK Insurance App", actualTitle);


    }

    @And("quit browser")
    public void quitBrowser() {
        getDriver().quit();
    }

    @Then("Validate Create Primary that should be enabled")
    public void ValidateCreatePrimaryAccountShouldBeEnabled() {

        Boolean createPrimaryAccountIsEnabled = validateElementPrimaryAccountIsEnabled(
                HomePage.VALIDATE_CREATE_PRIMARY_ACCOUNT);
        // here assert check the condition is true
        Assert.assertTrue(createPrimaryAccountIsEnabled);
    }

    @Then("Click on Create Primary Account")
    public void clickOnCreatePrimaryAccount() {
        clickONElement(HomePage.CLICK_ON_CREATE_PRIMARY_ACCOUNT);

    }


}

package tek.bdd.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.framework.page.PlansStepsPage;
import tek.bdd.framework.utility.SeleniumUtilities;

public class PlansSteps extends SeleniumUtilities {
    @When("Clicking on Plans")
    public void clickingOnPlans() {
        clickONElement(PlansStepsPage.PLANS_BUTTON);
    }
    @Then("on the user plans page 4 data rows must be show up")
    public void fourRowsShouldBeVisible() {
        String actualText = getElementText(PlansStepsPage.ROWS_INFO);
        String rows = actualText.replaceAll("","");
        System.out.println(rows);
        Assert.assertEquals(actualText,rows);
    }
    @Then("Validate Create")
    public void validateCreate() {
        String createDate = getElementText(PlansStepsPage.CREATE_DATE);
        String date = createDate.replaceAll("","");
        Assert.assertEquals(date,createDate);
        System.out.println("Create Date is: " +createDate);
    }
    @Then("Validate Expire")
    public void validate_Expiration() {
        String expireDate = getElementText(PlansStepsPage.DATE_EXPIRE);
        String dateOfExpire = expireDate.replaceAll("","");
        Assert.assertEquals(expireDate,dateOfExpire);
        System.out.println("Expire Date is: " + dateOfExpire);
    }

}

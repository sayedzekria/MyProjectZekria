package tek.bdd.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.framework.page.CreateAccountPage;
import tek.bdd.framework.utility.SeleniumUtilities;

import java.util.Map;

public class CreateAccountSteps extends SeleniumUtilities {
    @Then("Create Primary Account Holder should be displayed")
    public void primaryAccountTitle() {
//        String[] splitEmail = email.split ("@");
//        int randomNumber = (int) (Math.random() * 1000);
//        String randomEmail = splitEmail[0] + randomNumber + "@" + splitEmail[1];
        getElementText(CreateAccountPage.PRIMARY_ACCOUNT_HOLDER_DISPLAYED);
        String title = getElementText(CreateAccountPage.PRIMARY_ACCOUNT_HOLDER_DISPLAYED);
        System.out.println(title);
        Assert.assertEquals("Create Primary Account Holder", title);

    }

    @Then("Fill Up Primary Account Holder on DataTable")
    public void fillUpAccountForm(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        sendText(CreateAccountPage.EMAIL_INPUT_VALUE, data.get("email"));
        sendText(CreateAccountPage.PREFIX_SELECT_VALUE, data.get("title"));
        sendText(CreateAccountPage.FIRST_NAME_INPUT_VALUE,data.get("firstName"));
        sendText(CreateAccountPage.LAST_NAME_INPUT_VALUE,data.get("lastName"));
        sendText(CreateAccountPage.GENDER_SELECT,data.get("gender"));
        sendText(CreateAccountPage.MARITAL_STATUS,data.get("maritalStatus"));
        sendText(CreateAccountPage.EMPLOYMENT_STATUS_INPUT_VALUE,data.get("employmentStatus"));
        sendText(CreateAccountPage.DATE_OF_BIRTH,data.get("dateOfBirth"));




    }
    @Then("Click on Create Account button")
    public void click_on_create_account_button() {
   clickONElement(CreateAccountPage.CLICK_CREATE_BUTTON);
    }
    @Then("Validate user is on {string}")
    public void validate_user_is_on(String string) {
      getElementText(CreateAccountPage.SIGN_UP_TITLE);
    }
    @Then("Email should be display same as entry")
    public void email_Should_Display_same_as_entry() {
  String actualEmail = getElementText(CreateAccountPage.EMAIL_OF_CREATE_ACCOUNT);

    }
//

    }
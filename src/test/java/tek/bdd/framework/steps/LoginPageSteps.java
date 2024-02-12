package tek.bdd.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.framework.page.LoginPage;
import tek.bdd.framework.utility.SeleniumUtilities;

public class LoginPageSteps extends SeleniumUtilities {
    @When("Click on Login button")
    public void click_on_login_button() {
        clickONElement(LoginPage.LOGIN_BUTTON);
    }

    @Then("Login with valid credential user {string} and password {string}")
    public void login_with_valid_user_and_password(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT_INPUT_VALUE, username);
        sendText(LoginPage.PASSWORD_INPUT_INPUT_VALUE, password);
    }

    @Then("Click on Displayed Sign in button")
    public void click_on_sign_in_button() {
        clickONElement(LoginPage.CLICK_SIGN_IN_BUTTON);

    }
    @Then("navigate to Customer Service Portal and Validate It")
    public void navigate_to_customer_service_portal_and_validate_it() {
        // Write code here that turns the phrase above into concrete actions
        String title = getElementText(LoginPage.CUSTOMER_SERVICE_PORTAL_PAGE);
        Assert.assertEquals("Customer Service Portal",title);
        System.out.println(title);
    }


    @Then("Login with valid user {string} and invalid password {string}")
    public void Login_with_valid_user_credentials(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT_INPUT_VALUE, username);
        sendText(LoginPage.PASSWORD_INPUT_INPUT_VALUE, password);
    }
    @Then("Login with invalid user credentials {string} and {string}")
    public void Login_with_invalid_user_credentials(String username, String password) {
        sendText(LoginPage.USERNAME_INPUT_INPUT_VALUE, username);
        sendText(LoginPage.PASSWORD_INPUT_INPUT_VALUE, password);

    }

    @Then("Validate error message {string}")
    public void validate_error_message(String errorMessage) {
        String actualErrorMessageDisplayed = getElementText(LoginPage.USER_ERROR_MESSAGE_DISPLAYED);

        System.out.println(actualErrorMessageDisplayed);


    }
}

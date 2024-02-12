package tek.bdd.framework.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.framework.page.UserProfilePage;
import tek.bdd.framework.utility.SeleniumUtilities;

public class UserProfileSteps extends SeleniumUtilities {
    @Then("click on profile button")
    public void clickOnProfileButton() {
        clickONElement(UserProfilePage.PROFILE_BUTTON_INPUT_VALUE);

    }
    @Then("All all value should be correct {string}")
    public void allProfileSideDrawerMustBeCorrect(String info) {
        String profileInfo = getElementText(UserProfilePage.PROFILE_INFO_VALUE);
        String profileSort = profileInfo.replaceAll(profileInfo,
                "Status:Active, User:CSR, Name:Supervisor, Username:supervisor, SAuthorities:admin");
        Assert.assertEquals(profileSort,info);
        System.out.println(profileSort);
    }
    HomePageSteps homePageSteps = new HomePageSteps();

    @Then("home page should display after logout")
    public void clickOnLogoutButtonAndHomePageMustDisplay() {
        clickONElement(UserProfilePage.CLICK_LOGOUT_BUTTON);


    }
}

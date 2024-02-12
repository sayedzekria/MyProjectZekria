package tek.bdd.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.framework.page.AccountPage;
import tek.bdd.framework.utility.SeleniumUtilities;

import java.util.List;

public class AccountPageSteps extends SeleniumUtilities {
    @When("Clicking on Accounts")
    public void clickingOnAccountsButton() {
        clickONElement(AccountPage.ACCOUNTS_BUTTON_CLICK);
    }

    @When("data rows should be displayed as default {string}")
    public void fiveRowsDefault(String rows) {
        selectDropDownByText(AccountPage.ROWS_DROPDOWN_INPUT,"Show " + rows);
    }

    @Then("Data rows should be displayed on {int}")
    public void dataMustDisplayAsExpected(int expectedValueRows) {
        List<WebElement> tableRows = getElements(AccountPage.DATA_ROWS_INPUT_VALUE);
        Assert.assertEquals("Available rows ", tableRows.size(), expectedValueRows);
        System.out.println(tableRows.size());
    }

    @When("Data change {string} rows every per page")
    public void changeData(String rows) {
        selectDropDownByText(AccountPage.ROWS_DROPDOWN_INPUT,"Show " + rows );
    }

    @When("Page row is {string} data must be same")
    public void changeRows(String PageRows) {
        selectDropDownByText(AccountPage.ROWS_DROPDOWN_INPUT,PageRows);
        waitTime(8000);
        printRows(AccountPage.DATA_ROWS_INPUT_VALUE);
    }

}

package tek.bdd.framework.page;

import org.openqa.selenium.By;
import tek.bdd.framework.base.BaseSetup;

public class AccountPage extends BaseSetup {
    public static final By ROWS_DROPDOWN_INPUT = By.xpath("//div/div/div[3]/select");
    public static final By DATA_ROWS_INPUT_VALUE = By.xpath("//table[contains(@class,'chakra-table')]//tbody/tr");
    public static final By ACCOUNTS_BUTTON_CLICK = By.linkText("Accounts");
}

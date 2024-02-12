package tek.bdd.framework.page;

import org.openqa.selenium.By;
import tek.bdd.framework.base.BaseSetup;

public class LoginPage extends BaseSetup {

    public static final By LOGIN_BUTTON = By.xpath("/html/body/div[1]/div/div[1]/div/a[2]");
    public static final By USERNAME_INPUT_INPUT_VALUE = By.id("username");
    public static final By PASSWORD_INPUT_INPUT_VALUE = By.id("password");
    public static final By CLICK_SIGN_IN_BUTTON = By.xpath("//button[@type='submit']");
    public static final By CUSTOMER_SERVICE_PORTAL_PAGE = By.xpath("//h2[contains(text(),'Customer Service Portal')]");
    public static final By USER_ERROR_MESSAGE_DISPLAYED = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");




}

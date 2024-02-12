package tek.bdd.framework.page;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final By PRIMARY_ACCOUNT_HOLDER_DISPLAYED = By.xpath(
            "/html/body/div[1]/div/div[2]/div/div/div/h2");
    public static final By EMAIL_INPUT_VALUE= By.name("email");
    public static final By PREFIX_SELECT_VALUE = By.name("title");
    public static final By FIRST_NAME_INPUT_VALUE =By.name("firstName");
    public static final By LAST_NAME_INPUT_VALUE = By.name("lastName");
    public static final By GENDER_SELECT=By.name("gender");
    public static final By MARITAL_STATUS =By.name("maritalStatus");
    public static final By EMPLOYMENT_STATUS_INPUT_VALUE=By.name("employmentStatus");
    public static final By DATE_OF_BIRTH = By.id("dateOfBirth");
    public static final By CLICK_CREATE_BUTTON=By.xpath("//button[@type='submit']");
    public static final By SIGN_UP_TITLE = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[1]");

    public static final By EMAIL_OF_CREATE_ACCOUNT = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/h2[3]");
    public static final By EXIST_EMAIL_ERROR = By.xpath("//div[@class='chakra-alert banner-error css-1ykemat']");

}
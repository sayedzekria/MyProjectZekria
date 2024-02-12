package tek.bdd.framework.page;

import org.openqa.selenium.By;
import tek.bdd.framework.base.BaseSetup;

public class UserProfilePage extends BaseSetup{
        public static final By PROFILE_BUTTON_INPUT_VALUE = By.xpath("/html/body/div[1]/div/div[1]/div/button");
        public static final By PROFILE_INFO_VALUE = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div");
        public static final By CLICK_LOGOUT_BUTTON = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");

}

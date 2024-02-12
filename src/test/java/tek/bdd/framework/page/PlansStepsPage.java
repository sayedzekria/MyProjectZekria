package tek.bdd.framework.page;

import org.openqa.selenium.By;
import tek.bdd.framework.base.BaseSetup;

public class PlansStepsPage extends BaseSetup {
    public static final By PLANS_BUTTON = By.linkText("Plans");
    public static final By ROWS_INFO = By.xpath("//table/tbody");
    public static final By CREATE_DATE = By.xpath("//table/tbody/tr[1]/td[4]");
    public static final By DATE_EXPIRE = By.xpath("//table/tbody/tr[1]/td[5]");


}

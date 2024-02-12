package tek.bdd.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import tek.bdd.framework.utility.SeleniumUtilities;

public class Hooks extends SeleniumUtilities {
    @Before
    public void beforeScenario(){
        setupBrowser();
    }
    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()){


            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
        byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");
    }
        quitBrowser();

    }
    }


package tek.bdd.framework.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.framework.base.BaseSetup;

import java.nio.Buffer;
import java.time.Duration;
import java.util.List;

public class SeleniumUtilities extends BaseSetup {
    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }

    public WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String getElementText(By locator) {
        WebElement element = waitForVisibility(locator);
        return element.getText();
    }

    //    public String validateCreatePrimaryAccountIsEnabled(By locator){
//        return getDriver().findElement(locator).isEnabled();
    public boolean validateElementPrimaryAccountIsEnabled(By locator) {
        return waitForVisibility(locator).isEnabled();


    }

    public void clickONElement(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    public void sendText(By locator, String text) {
        waitForVisibility(locator).sendKeys(text);
    }

    public void selectDropDownByValue(By locator, String value){
        WebElement element = getDriver().findElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    //Teacher
    public void selectFromDropDown(By locator, int index) {
        WebElement element = waitForVisibility(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDownByIndex(By locator, int index){
        WebElement element = getDriver().findElement(locator);
        Select select = new Select(element);
        select.selectByIndex(index);

    }
    public void selectDropDownByText(By locator, String text){
        WebElement element = getDriver().findElement(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }
    public WebElement waitUntilPresent(WebElement element){
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }
    public static void waitTime(int wait){
        try{
            Thread.sleep(wait);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    public boolean isElementDisplayed(By locator) {
        return waitForVisibility(locator).isDisplayed();
    }

    public void printRows(By locator){
        List <WebElement> availableRows = getDriver().findElements(locator);
        System.out.println("Available rows are: "+ availableRows.size());
    }
    public  List<WebElement> getElements(By locator){
        return  getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

    }

}
package SeleniumPractice.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {

    WebDriver driver;

    ElementUtil(WebDriver driver) {
        this.driver = driver;
    }


    public Actions getActionsClassInstance()
    {
        return new Actions(driver);
    }


    public void clickSubMenu(By target, By sub) {
        Actions act = new Actions(driver);
        // WebElement menu = getWebElement(target);
        act.moveToElement(getWebElement(target)).perform();
        // WebElement subMenu = getWebElement(sub);
        doClick(sub);

    }
    public void clickSubMenu(By locator1, By locator2, By locator3, By locator4) throws InterruptedException {
        Actions act = new Actions(driver);
        doClick(locator1);
        Thread.sleep(1500);
        act.moveToElement(getWebElement(locator2)).perform();
        Thread.sleep(1500);
        act.moveToElement(getWebElement(locator3)).perform();
        Thread.sleep(1500);
        doClick(locator4);

    }

    public void doActionsSendKeys(By locator,String value) {
        Actions act=new Actions(driver);
        act.sendKeys(getWebElement(locator),value).perform();
    }

    public void doActionsClick(By locator) {
        Actions act=new Actions(driver);
        act.click(getWebElement(locator)).perform();
    }

    public WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public void doClick(By locator) {
        getWebElement(locator).click();
    }

}

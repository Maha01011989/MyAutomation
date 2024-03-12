package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElementMultiLevel {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.bigbasket.com/");

        By shopBy = By.xpath("(//span[text()='Shop by'])[2]");
        By menu = By.linkText("Beverages");
        By menu2 = By.linkText("Tea");
        By menu3 = By.linkText("Green Tea");

        clickSubMenu(shopBy, menu, menu2, menu3);

    }

    public static void clickSubMenu(By locator1, By locator2, By locator3, By locator4) throws InterruptedException {
        Actions act = new Actions(driver);
        doClick(locator1);
        Thread.sleep(1500);
        moveToElement(locator2);
        Thread.sleep(1500);
        moveToElement(locator3);
        Thread.sleep(1500);
        doClick(locator4);

    }

    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doClick(By locator) {
        getWebElement(locator).click();
    }

    public static void moveToElement(By locator) {

        Actions act = new Actions(driver);
        act.moveToElement(getWebElement(locator)).perform();
    }

}

package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("http://mrbool.com/search/");
        By menu = By.className("menulink");
        By subMenu = By.linkText("COURSES");


// hover on the menu
// actions.moveToElement(driver.findElement(By.className("menulink"))).perform();
// driver.findElement(By.linkText("COURSES")).click();

// driver.get("https://www.spicejet.com/");
// By menu = By.xpath("//div[text()='Add-ons']");
// By subMenu = By.xpath("//div[text()='Extra Seat']");

        clickSubMenu(menu, subMenu);


    }


    public static void clickSubMenu(By target, By sub) {
        //Actions act = new Actions(driver);
        // WebElement menu = getWebElement(target);
        moveToElement(target);
        // WebElement subMenu = getWebElement(sub);
        doClick(sub);

    }


    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doClick(By locator) {
        getWebElement(locator).click();
    }


    public static void moveToElement(By locator) {

        Actions act =new Actions(driver);
        act.moveToElement(getWebElement(locator)).perform();
    }


}

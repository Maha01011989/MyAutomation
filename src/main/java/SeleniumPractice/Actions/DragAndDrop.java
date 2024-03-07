package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        By drag = By.id("draggable");
        By drop = By.id("droppable");


        driver.switchTo().frame(getWebElement(By.className("demo-frame")));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(getWebElement(drag), getWebElement(drop)).perform();


    }

    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doClick(By locator) {
        getWebElement(locator).click();
    }
}
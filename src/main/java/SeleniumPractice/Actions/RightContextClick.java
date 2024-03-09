package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RightContextClick {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        By rightClick = By.xpath("//span[text()='right click me']");
        By submenu = By.xpath("//span[text()='Copy']");
        Actions actions = new Actions(driver);
        actions.contextClick(getWebElement(rightClick)).perform();
        //doClick(submenu);


        List<WebElement> rightClickElements= driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root>li:not(.context-menu-not-selectable)"));

        for(WebElement e: rightClickElements)
        {
            if(e.getText().equals("Copy"))
            {
                e.click();
                break;
            }
        }

    }

    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doClick(By locator) {
        getWebElement(locator).click();
    }
}

package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabSequence {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        WebElement fName = driver.findElement(By.id("input-firstname"));

        Actions act = new Actions(driver);
        act.sendKeys(fName, "Maha").pause(500)
                .sendKeys(Keys.TAB).sendKeys("Lakshmi").pause(500)
                .sendKeys(Keys.TAB).sendKeys("lekshmi0101@gmail.com").pause(500)
                .sendKeys(Keys.TAB).sendKeys("9562030005").pause(500)
                .sendKeys(Keys.TAB).sendKeys("abcde").pause(500)
                .sendKeys(Keys.TAB).sendKeys("abcde").pause(500)
                .perform();

    }
}

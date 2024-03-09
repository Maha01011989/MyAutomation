package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

        Actions act=new Actions(driver);
        //1.Scrolling up and Down
//        act.sendKeys(Keys.PAGE_DOWN).perform();
//        Thread.sleep(3000);
//        act.sendKeys((Keys.PAGE_UP)).perform();

        //2.Scrolling up and Down
        act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();

        //3.Scrolling up and Down

        By footer= By.xpath("//a[text()='Ring']");

        act.scrollToElement(getWebElement(footer)).click(getWebElement(footer)).perform();



    }
    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }
}

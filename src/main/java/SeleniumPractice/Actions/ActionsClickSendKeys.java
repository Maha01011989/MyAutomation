package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
   static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By userName= By.id("input-email");

        By password=By.id("input-password");

        By login= By.xpath("//input[@value='Login']");

//        Actions act=new Actions(driver);
//        act.sendKeys(getWebElement(userName),"apiautomation").perform();
//
//        act.sendKeys(getWebElement(password),"apiautomation").perform();
        //act.click(getWebElement(login));
        doActionsSendKeys(userName,"test@gmail.com");

        doActionsSendKeys(password,"test@123");

        doActionsClick(login);

    }

    public static WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }


    public static void  doActionsSendKeys(By locator,String value) {
        Actions act=new Actions(driver);
        act.sendKeys(getWebElement(locator),value).perform();
    }

    public static void  doActionsClick(By locator) {
        Actions act=new Actions(driver);
        act.click(getWebElement(locator)).perform();
    }


}

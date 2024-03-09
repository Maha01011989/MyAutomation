package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        WebElement search = driver.findElement(By.name("search"));
        String s="macbook";
        Actions act= new Actions(driver);

        char[] arr=s.toCharArray();
        for(char a: arr)
        {
            act.sendKeys(search,String.valueOf(a)).pause(500).perform();
        }
    }


}

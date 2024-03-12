package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signature {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://signature-generator.com/draw-signature/");

        Actions act=new Actions(driver);

        WebElement canvas= driver.findElement(By.id("signature-pad"));

        act.click(canvas).moveToElement(canvas,20,20).clickAndHold().moveByOffset(50,10)
                .moveByOffset(30,10).
        moveByOffset(50,40).moveByOffset(-50,-40).
                release().perform();


    }


}

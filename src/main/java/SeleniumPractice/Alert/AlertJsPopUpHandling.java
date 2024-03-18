package SeleniumPractice.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUpHandling {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");




        WebElement button1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        button1.click();


        Alert alert = driver.switchTo().alert();
        String text=alert.getText();
        System.out.println(text);
        Thread.sleep(3000);
        alert.accept();

        WebElement button2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        button2.click();
        Thread.sleep(3000);

        String text1=alert.getText();
        System.out.println(text1);
        Thread.sleep(3000);
        alert.accept();

        button2.click();
        Thread.sleep(3000);
        alert.dismiss();

        WebElement button3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        button3.click();
        Thread.sleep(3000);
        String text2=alert.getText();
        System.out.println(text2);
        alert.sendKeys("hello");
        Thread.sleep(3000);
        alert.accept();

    }


}

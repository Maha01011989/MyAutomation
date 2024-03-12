package SeleniumPractice.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        Dimension dim = new Dimension(500, 900);
        driver.manage().window().setSize(dim);

//        WebElement element= driver.findElement(By.id("input-firstname"));
//        System.out.println(element.getCssValue("font-size"));
//        int x =element.getSize().getHeight();
//        int y =element.getSize().getWidth();
//
//        System.out.println(x);
//        System.out.println(y);
//
//        int a =element.getLocation().getX();
//        int b =element.getLocation().getY();
//
//        System.out.println(a);
//        System.out.println(b);
//
//        WebElement element1=driver.findElement(By.xpath("//input[@value='Continue']"));
//        System.out.println(element1.getCssValue("background-color"));


    }
}

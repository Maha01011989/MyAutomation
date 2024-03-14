package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.switchTo().window(WindowType.TAB.toString());

        driver.switchTo().window(WindowType.WINDOW.toString());
    }
}

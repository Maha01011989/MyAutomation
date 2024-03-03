package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://classic.crmpro.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("apiautomation");
        driver.findElement(By.name("password")).sendKeys("Selenium@12345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        driver.switchTo().frame("mainpanel");

        //should use the text visible in the application rather than the one which is present in the DOM
        driver.findElement(By.linkText("CONTACTS")).click();

        selectContact("Joe Root");
        System.out.println(getCompany("Joe Root"));

        System.out.println(getPhoneNumber("Joe Root"));
    }




    public static void selectContact(String contactName)
    {
        driver.findElement(By.xpath("//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
    }

    public static String getCompany(String contactName)
    {
        return driver.findElement(By.xpath("//a[text()='"+contactName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
    }

    public static String getPhoneNumber(String contactName)
    {
        return driver.findElement(By.xpath("(//a[text()='"+contactName+"']/parent::td/following-sibling::td)[2]/span[@context='phone']")).getText();
    }
}

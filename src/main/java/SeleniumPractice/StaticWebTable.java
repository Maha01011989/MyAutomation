package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticWebTable {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();

        //row size
        System.out.println(getRowCount());

        System.out.println(getColCount());

        //fetching data from first column
//        List<WebElement> firstRowElements=driver.findElements(By.xpath("//table[@id='customers']//tr/td[1]"));
//        for(WebElement e: firstRowElements)
//        {
//            System.out.println(e.getText());
//        }

        //fetching all row data
        for(int i=1;i<=getColCount();i++)
        {
            List<WebElement> alldata=driver.findElements(By.xpath("//table[@id='customers']//tr/td["+i+"]"));
            for(WebElement e: alldata)
                System.out.println(e.getText());
        }

    }

    public static int getRowCount() {
        return driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
    }

    public static int getColCount() {
        return driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
    }
}

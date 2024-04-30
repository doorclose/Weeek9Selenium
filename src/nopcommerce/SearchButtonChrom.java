package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SearchButtonChrom {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.click();


        searchbox.sendKeys(("Books"));

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();


     }
}

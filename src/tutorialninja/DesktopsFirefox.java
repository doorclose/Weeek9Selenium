package tutorialninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DesktopsFirefox {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));


        WebElement searchbox = driver.findElement(By.name("search"));
        searchbox.sendKeys(("Desktops"));

        WebElement Searchbox = driver.findElement(By.className("fa fa-search"));
        Searchbox.click();

    }
}

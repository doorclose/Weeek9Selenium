package nopcommerce;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SearchButtonEdge {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys(("Books"));

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();
      }

    }


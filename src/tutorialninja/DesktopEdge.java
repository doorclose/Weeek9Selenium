package tutorialninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DesktopEdge {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

        WebElement textBox = driver.findElement(By.name("search"));
        textBox.sendKeys("Desktops");

        WebElement searchBox = driver.findElement(By.className("button"));
        searchBox.click();
    }
}




package practiceauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FormFieldFriefox {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://practice-automation.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

        WebElement textbox  = driver.findElement(By.className("FormFields"));
        textbox.click();
    }
}

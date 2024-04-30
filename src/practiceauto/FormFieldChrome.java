package practiceauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FormFieldChrome {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

        WebElement textbox  = driver.findElement(By.className("FormFields"));
        textbox.click();

        //WebElement textbox = driver.findElement(By.name("name"));
        //textbox.sendKeys("Kinjal");
    }

}

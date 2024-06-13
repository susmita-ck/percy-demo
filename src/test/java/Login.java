

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.percy.selenium.Percy;

public class Login {

    public static WebDriver driver;
    private static Percy percy;

    public static void main(String[] args) throws InterruptedException {
        Login.LoginToLatitude();
    }

    public static void LoginToLatitude() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/susmitagoswami/Documents/percy_demo/demo_percy/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sympleloans--latuat2.sandbox.my.site.com/latitudeUnsecured/s/login/");
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Susmita");
        percy = new Percy(driver);
        percy.snapshot("Login page");
    }
}

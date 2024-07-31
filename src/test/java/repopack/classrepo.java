package repopack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class classrepo {
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        System.out.println("Setting up the WebDriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://macroplanfrontend.estonetech.in/app/home");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("admin@macroplan-2140.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div/button")).click();
        Thread.sleep(5000);
    }

    @Test
    public void f() throws InterruptedException {
        driver.findElement(By.id("level_1_1")).click();  
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/nav/div/div[1]/div[2]/div/div/div/div[1]/a/div/div/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div/table/tbody/tr[1]/td[6]/div/button/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("primaryContactName")).sendKeys("sendKkeys1");
        driver.findElement(By.id("simple-tab-1")).click();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Closing the WebDriver");
        if (driver != null) {
            driver.quit();
        }
    }
}

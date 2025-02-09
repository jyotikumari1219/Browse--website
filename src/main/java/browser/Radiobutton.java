package browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

import java.time.Duration;

public class Radiobutton {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Testqa\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).click();
       driver.findElement(By.xpath("//input[@value='1']")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='-1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//a[@class='_9bq5']")).click();
        driver.findElement(By.xpath("//button[@value='1']")).click();
        driver.close();// //Changes done from local
    }
}


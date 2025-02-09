package browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Browser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testqa\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(5000);
        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        Thread.sleep(5000);
        driver.get("https://www.google.com/");

        driver.navigate().refresh();

        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();

       // driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
      //driver.close();
    }
}

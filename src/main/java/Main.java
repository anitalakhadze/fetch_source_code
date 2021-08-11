import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://stackoverflow.com";
        driver.get(baseUrl);

        try {
            while (true) { // This will change
                System.out.println(driver.getPageSource());
                TimeUnit.SECONDS.sleep(10);
            }
        } catch (Exception ex) {
        }
        driver.close();
    }
}

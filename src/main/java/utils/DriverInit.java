package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverInit {

    private static final LoggerFactory logger = new utils.LoggerFactory(DriverInit.class);
    public static ThreadLocal<WebDriver> driver = new ThreadLocal();

    public static synchronized RemoteWebDriver getDriver() {
        logger.info("Thread id = " + Thread.currentThread().getId());
        return (RemoteWebDriver) driver.get();
    }

    public void initiateDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            driver.set(new ChromeDriver(options));
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver.set(new InternetExplorerDriver());
        }
        driver.get().get("https://insurance.policyexpert.co.uk/home");
        driver.get().manage().window().maximize();
    }

    public void killDriver() {
        driver.get().quit();
    }

}

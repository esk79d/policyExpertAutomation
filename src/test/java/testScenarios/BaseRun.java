package testScenarios;

import org.testng.annotations.*;
import utils.DriverInit;
import utils.LoggerFactory;

public class BaseRun {

    private static final LoggerFactory logger = new LoggerFactory(BaseRun.class);
    DriverInit driverUtils = new DriverInit();
    @Parameters("browser")
    @BeforeClass
    public void launchBrowser(String browser) {
        driverUtils.initiateDriver(browser);
    }
    @AfterClass
    public void tearDown() {
        driverUtils.killDriver();
    }
}

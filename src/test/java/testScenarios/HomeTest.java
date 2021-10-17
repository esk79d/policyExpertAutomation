package testScenarios;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.HomePageActions;
import testData.TestData;
import utils.DriverInit;
import utils.LoggerFactory;

public class HomeTest extends BaseRun{

    private static final LoggerFactory logger = new LoggerFactory(HomeTest.class);
    HomePageActions homePageActions;
    @BeforeMethod
    public void setUp() {
        homePageActions = new HomePageActions(DriverInit.getDriver());
    }

    @Test
    public void fillCustomerDetailsWithDualOccupation(){
        homePageActions.fillTitleAndName();
        homePageActions.selectDOB();
        homePageActions.fillMaritalAndOccupation();
        homePageActions.fillContactDetails(TestData.emailAddress);
        homePageActions.fillAnotherOccupation("Yes");
    }
    @Test
    public void fillCustomerDetailsWithSingleOccupation(){
        homePageActions.fillTitleAndName();
        homePageActions.selectDOB();
        homePageActions.fillMaritalAndOccupation();
        homePageActions.fillAnotherOccupation("No");
        homePageActions.fillContactDetails(TestData.emailAddress);
    }

    @Test
    public void validateContactDetails(){
        homePageActions.fillTitleAndName();
        homePageActions.selectDOB();
        homePageActions.fillMaritalAndOccupation();
        homePageActions.fillAnotherOccupation("No");
        homePageActions.fillContactDetails("invalidEmailId");
    }
}

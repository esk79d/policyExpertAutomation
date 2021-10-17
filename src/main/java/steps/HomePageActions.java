package steps;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import repository.Locators;
import testData.TestData;
import utils.ElementActions;
import utils.LoggerFactory;

public class HomePageActions {

    private static final LoggerFactory logger = new LoggerFactory(Locators.class);
    public RemoteWebDriver driver;
    public ElementActions elementActions ;

    public HomePageActions(RemoteWebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        elementActions = new ElementActions(driver);
    }
    public void fillTitleAndName(){
        try {
            elementActions.selectDropdownByText(Locators.title, TestData.title);
            elementActions.enterData(Locators.firstName, TestData.fname);
            elementActions.enterData(Locators.lastName, TestData.lname);
        }catch (Exception e){
            logger.error("failed to fill the title and Name "+e.getMessage());
        }
    }

    public void selectDOB(){
        try {
            elementActions.selectDropdownByText(Locators.daySelect, TestData.dateOfBirth);
            elementActions.selectDropdownByText(Locators.monSelect, TestData.monthOfBirth);
            elementActions.selectDropdownByText(Locators.yearSelect, TestData.yearOfBirth);
        }catch (Exception e){
            logger.error("failed to select DOB "+e.getMessage());
        }
    }

    public void fillMaritalAndOccupation(){
        try{
            elementActions.selectDropdownByText(Locators.maritalSelect, TestData.maritalStatus);
            elementActions.enterData(Locators.occupation,TestData.occupation);
            elementActions.click(Locators.occupationSelect(TestData.occupation));
        }catch (Exception e){
            logger.error("failed to fill the Marital status and Occupation "+e.getMessage());
        }
    }

    public void fillContactDetails(String emailAddress){
        try{
            elementActions.enterData(Locators.phoneNumber,TestData.mailPhone);
            elementActions.enterData(Locators.emailAddress,emailAddress);
            if(!emailAddress.contains("@") ||!emailAddress.contains(".") ){
                elementActions.enterData(Locators.phoneNumber,TestData.mailPhone);
                Assert.assertTrue(driver.findElement(Locators.emailError).isDisplayed());
            }
        }catch (Exception e){
            logger.error("failed to fill the Contact Details "+e.getMessage());
        }
    }

    public void fillAnotherOccupation(String yesOrNo){
        try{
            if(yesOrNo.equalsIgnoreCase("Yes")) {
                elementActions.click(Locators.anotherOccupationYes);
                elementActions.enterData(Locators.anotherOccupationText, TestData.anotherOccupation);
                elementActions.click(Locators.occupationSelect(TestData.anotherOccupation));
            }else{
                elementActions.click(Locators.anotherOccupationNo);
            }
        }catch (Exception e){
            logger.error("failed to fill the other Occupation "+e.getMessage());
        }
    }



}

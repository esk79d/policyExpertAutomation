package repository;

import org.openqa.selenium.By;


public class Locators {
    public static By title = By.xpath("//div[contains(@class,'row question-row-title')]//select[contains(@class,'form-control')]");
    public static By firstName = By.xpath("//div[contains(@class,'row question-row-first-name')]//input[contains(@type,'text')]");
    public static By lastName = By.xpath("//div[contains(@class,'row question-row-last-name')]//input[contains(@type,'text')]");

    public static By daySelect = By.xpath("//div[contains(@class,'form-group question-date-dropdowns')]/descendant::select[contains(@class,'form-control')][1]");
    public static By  monSelect = By.xpath("//div[contains(@class,'form-group question-date-dropdowns')]/descendant::select[contains(@class,'form-control')][2]");
    public static By yearSelect = By.xpath("//div[contains(@class,'form-group question-date-dropdowns')]/descendant::select[contains(@class,'form-control')][3]");

    public static  By maritalSelect = By.xpath("//div[contains(@class,'row question-row-what-is-your-marital')]//select[contains(@class,'form-control')]");
    public static  By occupation = By.xpath("//div[contains(@class,'row question-row-what-is-your-occupat')]//input[contains(@type,'text')]");
    public static By occupationSelect(String text){
        return By.xpath("//li[contains(text(),'"+text+"')]");
    }

    public static By anotherOccupationYes = By.xpath("//div[contains(@class,'row question-row-do-you-have-another')]//button[contains(text(),'Yes')]");
    public static By anotherOccupationNo = By.xpath("//div[contains(@class,'row question-row-do-you-have-another')]//button[contains(text(),'No')]");
    public static By anotherOccupationText = By.xpath("//div[contains(@class,'row question-row-what-is-your-other-o')]//input[contains(@type,'text')]");

    public static  By phoneNumber = By.xpath("//div[contains(@class,'row question-row-main-phone-number')]//input[contains(@type,'text')]");
    public static  By emailAddress=By.xpath("//div[contains(@class,'row question-row-what-is-your-e-mail')]//input[contains(@type,'text')]");
    public static By emailError = By.xpath("//span[contains(text(),'Please enter a valid email address')]");


}

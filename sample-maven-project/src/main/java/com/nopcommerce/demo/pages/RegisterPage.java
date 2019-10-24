package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Util;
import org.openqa.selenium.By;

public class RegisterPage extends Util {

    By registerLink = By.xpath("//a[@class='ico-register']");
    By registerWelcomeText = By.xpath("//div[@class='page-title']");
    By selectGender = By.xpath("//input[@id='gender-male']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyField = By.id("Company");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerBtn = By.xpath("//input[@id='register-button']");
    By welcometext = By.xpath("//div[text()='Your registration completed']");


    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public String registerText() {
        return getTextFromElement(registerWelcomeText);
    }

    public void clickOnGender() {
        clickOnElement(selectGender);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterDayOfBirth(String dayofbirth) {
        sendTextToElement(dayOfBirth, dayofbirth);
    }

    public void enterMonthOfBirth(String monthofbirth) {
        sendTextToElement(monthOfBirth, monthofbirth);
    }

    public void enterYearOfBirth(String yearofbirth) {
        sendTextToElement(yearOfBirth, yearofbirth);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterCompanyName(String company) {
        sendTextToElement(companyField, company);
    }

    public void enterPassword(String Password) {
        sendTextToElement(password, Password);
    }

    public void enterPasswordInConfirmPassword(String confirmpassword) {
        sendTextToElement(confirmPassword, confirmpassword);
    }

    public void clickOnRegisterBtn() {
        clickOnElement(registerBtn);
    }

    public String welcomeText() {
        return getTextFromElement(welcometext);
    }

}

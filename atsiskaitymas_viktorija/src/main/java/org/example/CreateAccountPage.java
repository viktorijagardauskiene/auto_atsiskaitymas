package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{
    @FindBy(id = "firstname")
    private WebElement inputFirstName;
    @FindBy(id = "lastname")
    private WebElement inputLastName;
    @FindBy(id = "email_address")
    private WebElement inputEmail;
    @FindBy(id = "password")
    private WebElement inputPassword;
    @FindBy(id = "password-confirmation")
    private WebElement inputConfirmPassword;
    @FindBy(xpath = "//button[@title ='Create an Account']")
    private WebElement buttonCreateAnAccount;
    public WebElement getAlertAccountCreatedSuccessfully() {
        return alertAccountCreatedSuccessfully;
    }
    @FindBy(xpath = "//div[@role='alert']")
    private WebElement alertAccountCreatedSuccessfully;
    public void typeFirstName(String name) {
        inputFirstName.sendKeys(name);
    }
    public void typeLastName(String lastname) {
        inputLastName.sendKeys(lastname);
    }
    public void typeEmail(String email) {
        inputEmail.sendKeys(email);
    }
    public void typePassword(String password) {
        inputPassword.sendKeys(password);
    }
    public void confirmPassword(String password) {
        inputConfirmPassword.sendKeys(password);
    }
    public void clickSubmit() {
        buttonCreateAnAccount.click();
    }
    public String successAlertText() {
        return alertAccountCreatedSuccessfully.getText();
    }
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
}

import org.example.CreateAccountPage;
import org.example.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class CreateAccountTest extends BaseTest {
    @Test
    public void createNewAccount() {
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        MainPage mainPage = new MainPage(driver);

        mainPage.goToCreateAnAccount();
        createAccountPage.typeFirstName("name");
        createAccountPage.typeLastName("lastname");
        createAccountPage.typeEmail("username"+ randomInt +"@gmail.com");
        createAccountPage.typePassword("Password1*");
        createAccountPage.confirmPassword("Password1*");
        createAccountPage.clickSubmit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(
                ExpectedConditions.visibilityOf(createAccountPage.getAlertAccountCreatedSuccessfully()));

        Assertions.assertEquals(
                "Thank you for registering with Main Website Store.",
                createAccountPage.successAlertText());
    }
}

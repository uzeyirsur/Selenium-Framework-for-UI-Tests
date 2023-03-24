package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement firstNameBox;

    @FindBy(css = "input[name='last_name']")
    private WebElement lastNameBox;

    @FindBy(css = "input[name='email']")
    private WebElement emailBox;

    @FindBy(css = "input[name='password']")
    private WebElement passwordBox;

    @FindBy(css = "input[name='password_confirmation']")
    private WebElement password_confirmationBox;

    @FindBy(css = "button[type='submit']")
    private WebElement signUpButton;
    @FindBy(className = "control-error")
    private WebElement shortPasswordAlert;

    public void enterFirstName(String firstName) {
        BrowserUtils.waitForVisibility(firstNameBox,4);
        firstNameBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameBox.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        password_confirmationBox.sendKeys(confirmPassword);
    }
    public void clickSignUpButton(){
        signUpButton.click();
    }
public String getShortPasswordAlertText(){
        return shortPasswordAlert.getText();
}
}

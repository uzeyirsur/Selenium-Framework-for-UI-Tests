package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(className = "fs24.fw6")
    private WebElement customerLoginText;

    @FindBy(css = "input[name='email']")
    private WebElement emailBox;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy(css = "input[type='submit']")
    private WebElement signInButton;

    @FindBy(id = "alert-container")
    private WebElement confirmationMessage;

    @FindBy(xpath = "//a[@class='link google-link']")
    private WebElement continueWithGoogleButton;

    @FindBy(id = "alert-container")
    private WebElement credentialsAlert;


    public String getCustomerLoginText() {
        return customerLoginText.getText();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }

    public void enterEmail(String email) {
        emailBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public String getCredentialsAlert() {
        return credentialsAlert.getText();
    }
}

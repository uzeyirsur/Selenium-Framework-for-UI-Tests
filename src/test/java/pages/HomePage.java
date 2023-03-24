package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = "span.text-center")
    private WebElement welcomeGuestButton;

    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    private WebElement signUpButton;

    @FindBy(xpath = "//a[normalize-space()='Sign In']")
    private WebElement signInButton;

    public void clickWelcomeGuest() {
        welcomeGuestButton.click();
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}

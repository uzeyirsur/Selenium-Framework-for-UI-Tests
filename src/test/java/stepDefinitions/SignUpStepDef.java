package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SignUpStepDef extends BaseStep {
    @Given("the user is on the sign up page")
    public void the_user_is_on_the_sign_up_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        pages.homePage().clickWelcomeGuest();
        pages.homePage().clickSignUpButton();

    }

    @When("the user enters First Name {string}")
    public void the_user_enters_first_name(String firstName) {
        pages.registerPage().enterFirstName(firstName);
    }

    @When("the user enters Last Name {string}")
    public void the_user_enters_last_name(String lastName) {
        pages.registerPage().enterLastName(lastName);
    }

    @When("the user enters email {string}")
    public void the_user_enters_email(String email) {
       pages.registerPage().enterEmail(email);
    }

    @When("the user enters Password {string}")
    public void the_user_enters_password(String password) {
        pages.registerPage().enterPassword(password);
    }

    @When("the user enters Confirm Password {string}")
    public void the_user_enters_confirm_password(String confirmPassword) {
        pages.registerPage().enterConfirmPassword(confirmPassword);
    }

    @When("the user clicks on the sign up button")
    public void the_user_clicks_on_the_sign_up_button() {
       pages.registerPage().clickSignUpButton();
    }

    @Then("Verify that the form is submitted successfully and a confirmation message is displayed.")
    public void verify_that_the_form_is_submitted_successfully_and_a_confirmation_message_is_displayed() {
        String confirmationMessage = pages.loginPage().getConfirmationMessage().toLowerCase();
        Assert.assertTrue(confirmationMessage.contains("success".toLowerCase()));
    }

    @Then("the user should arrives at the login page.")
    public void the_user_should_arrives_at_the_login_page() {
        String customerLoginText = pages.loginPage().getCustomerLoginText().toLowerCase();
        Assert.assertTrue(customerLoginText.contains("customer login".toLowerCase()));
    }
    @Then("Verify that error text is displayed immediately as {string}")
    public void verify_that_error_text_is_displayed_immediately_as(String alert) {
        String shortPasswordAlert = pages.registerPage().getShortPasswordAlertText();
        Assert.assertEquals(shortPasswordAlert,alert);
    }
}

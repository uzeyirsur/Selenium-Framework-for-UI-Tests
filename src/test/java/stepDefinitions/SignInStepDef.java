package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SignInStepDef extends BaseStep{
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        pages.homePage().clickWelcomeGuest();
        pages.homePage().clickSignInButton();

    }
    //Sign In with social media
    @When("user clicks on the social media login button")
    public void user_clicks_on_the_social_media_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters their social media account credentials.")
    public void user_enters_their_social_media_account_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enters social media account's email address and password")
    public void user_enters_social_media_account_s_email_address_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks on the Login button.")
    public void user_clicks_on_the_login_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify that the user is now logged in and can access the website's features and functionality.")
    public void verify_that_the_user_is_now_logged_in_and_can_access_the_website_s_features_and_functionality() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

//Valid Sign In
    @When("user enters email {string}")
    public void user_enters_email(String email) {
        pages.loginPage().enterEmail(email);
    }
    @When("user enters password as {string}")
    public void user_enters_password_as(String password) {
        pages.loginPage().enterPassword(password);
    }
    @When("user clicks on the sign in button")
    public void user_clicks_on_the_sign_in_button() {
        pages.loginPage().clickSignInButton();
    }
    @Then("user should be signed in profile page")
    public void user_should_be_signed_in_profile_page() {
       String profileHeader = pages.profilePage().getProfileHeader().toLowerCase();
        Assert.assertEquals(profileHeader,"Profile".toLowerCase());
    }
    @Then("user should see welcome text with his username")
    public void user_should_see_welcome_text_with_his_username() {
       String welcomeUserText = pages.profilePage().getWelcomeUserText().toLowerCase();
       Assert.assertTrue(welcomeUserText.contains("welcome"));
    }

    @Then("user arrives to profile page and sees FirstName, LastName, Gender, Date of Birth, Email")
    public void user_arrives_to_profile_page_and_sees_first_name_last_name_gender_date_of_birth_email() {
        String firstNameText = pages.profilePage().getFirstNameText().toLowerCase().trim();
        String lastNameText = pages.profilePage().getLastNameText().toLowerCase().trim();
        String genderText = pages.profilePage().getGenderText().toLowerCase().trim();
        String dateOfBirthText = pages.profilePage().getDateOfBirthText().toLowerCase().trim();
        String emailText = pages.profilePage().getEmailText().toLowerCase().trim();

        Assert.assertEquals(firstNameText,"first name".trim());
        Assert.assertEquals(lastNameText,"last name".trim());
        Assert.assertEquals(genderText,"gender".trim());
        Assert.assertEquals(dateOfBirthText,"date of birth".trim());
        Assert.assertEquals(emailText,"email".trim());
    }

    @Then("user should not be able to login and see message {string}")
    public void user_should_not_be_able_to_login_and_see_message(String alert) {
        String credentialsAlert = pages.loginPage().getCredentialsAlert();
        Assert.assertEquals(credentialsAlert,alert);
    }
    @When("user clicks Delete button")
    public void user_clicks_delete_button() {
        pages.profilePage().clickDeleteButton();
    }
    @When("user enters password {string} and click Delete button")
    public void user_enters_password_and_click_button(String password) {
        pages.profilePage().enterPassword(password);
        pages.profilePage().clickSecondDeleteButton();
    }
    @Then("user should be able to get a generic message {string}")
    public void user_should_be_able_to_get_a_generic_message(String genericMessage) {
       String deleteSuccessAlert = pages.profilePage().getDeleteSuccessAlert();
       Assert.assertEquals(deleteSuccessAlert,genericMessage);

    }
}

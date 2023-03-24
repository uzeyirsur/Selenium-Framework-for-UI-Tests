package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    @FindBy(className = "text-center")
    private WebElement welcomeUserElement;
    @FindBy(xpath = "//span[@class='account-heading']")
    private WebElement profileHeader;

    @FindBy(xpath = "//tr[1]/td[1]")
    private WebElement firstNameText;

    @FindBy(xpath = "//tr[2]/td[1]")
    private WebElement lastNameText;

    @FindBy(xpath = "//tr[3]/td[1]")
    private WebElement genderText;

    @FindBy(xpath = "//tr[4]/td[1]")
    private WebElement dateOfBirthText;

    @FindBy(xpath = "//tr[5]/td[1]")
    private WebElement emailText;

    @FindBy(css = "button[type='submit']")
    private WebElement deleteButton;

    @FindBy(css = "div[class='page-action'] button[type='submit']")
    private WebElement secondDeleteButton;

    @FindBy(id = "password")
    private WebElement passwordBox;

    @FindBy (id = "alert-container")
    private WebElement deleteSuccessAlert;

    public String getWelcomeUserText() {
        return welcomeUserElement.getText();
    }

    public String getProfileHeader() {
        return profileHeader.getText();
    }

    public String getLastNameText() {
        return lastNameText.getText();
    }
    public String getGenderText() {
        return genderText.getText();
    }
    public String getDateOfBirthText() {
        return dateOfBirthText.getText();
    }
    public String getEmailText() {
        return emailText.getText();
    }
    public String getFirstNameText() {
        return firstNameText.getText();
    }
    public void clickDeleteButton(){
        deleteButton.click();
    }
    public void clickSecondDeleteButton(){
        secondDeleteButton.click();
    }
public void enterPassword(String password){
        passwordBox.sendKeys(password);
}
public String getDeleteSuccessAlert(){
        return deleteSuccessAlert.getText();
}
}
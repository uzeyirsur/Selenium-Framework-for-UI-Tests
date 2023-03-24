package utilities;

import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import pages.RegisterPage;

public class Pages {
    private LoginPage loginPage;
    private HomePage homePage;
    private RegisterPage registerPage;
    private ProfilePage profilePage;

    public Pages(){
        this.loginPage = new LoginPage();
        this.homePage = new HomePage();
        this.registerPage = new RegisterPage();
        this.profilePage = new ProfilePage();
    }

    public LoginPage loginPage(){
        return loginPage;
    }
    public HomePage homePage(){
        return homePage;
    }
    public RegisterPage registerPage(){
        return registerPage;
    }
    public ProfilePage profilePage(){
        return profilePage;
    }
}

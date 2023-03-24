package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup() {
        Driver.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(){
        Driver.getDriver().quit();
    }
}

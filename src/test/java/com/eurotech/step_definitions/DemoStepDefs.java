package com.eurotech.step_definitions;

import com.eurotech.pages.DemoPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DemoStepDefs {

    DemoPage demoPage = new DemoPage();
    WebDriver driver = Driver.get();
    @Given("The user is on the demo login page")
    public void theUserIsOnTheDemoLoginPage() {
        driver.get(ConfigurationReader.get("urldemo"));
    }
    @When("The user enters {string} and row number {string}")
    public void theUserEntersAndRowNumber(String demousername, String demopassword) {
        demoPage.login(demousername,demopassword);
    }

    @Then("The products page is shown")
    public void theProductsPageIsShown() {
        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")){
            Assert.assertEquals("PRODUCTS",demoPage.welcomePageHeader.getText());}else{
        Assert.assertTrue("Page is NOT shown", false);}
    }
}

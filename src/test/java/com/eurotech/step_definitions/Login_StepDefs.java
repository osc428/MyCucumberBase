package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import com.eurotech.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    String sheet;
    //ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTestB5_-Last.xlsx", sheet);
    ExcelUtil excelUtil = new ExcelUtil("src/test/resources/EurotechTestB5_-Last.xlsx", "Test Data");
    List <Map<String, String>> dataList = excelUtil.getDataList();
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {

        Driver.get().get(ConfigurationReader.get("url"));


    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() throws InterruptedException {

        loginPage.loginAsTeacher();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        Thread.sleep(2000);
        String actualText = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualText.contains("Welcome"));
    }

    @When("The user enters student credentials")
    public void theUserEntersStudentCredentials() {

        loginPage.loginAsStudent();
    }

    @When("The user logs in {string} and {string}")
    public void theUserLogsInAnd(String userName, String pass) {
        loginPage.login(userName,pass);
    }

    @And("The welcome message contains {string}")
    public void theWelcomeMessageContains(String user) throws InterruptedException {
        Thread.sleep(2000);
        String actualMessage = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualMessage.contains(user));

    }

    @When("The user enters {string} and row number {int}")
    public void the_user_enters_and_row_number(String sheetName, Integer rowNumber) {
        // Write code here that turns the phrase above into concrete actions
        // sheet = sheetName;
        loginPage.login(dataList.get(rowNumber).get("Username"), dataList.get(rowNumber).get("Password"));
    }

    @Then("The welcome message contains in excel {int}")
    public void the_welcome_message_contains_in_excel(Integer rowNumberForName) {
        // Write code here that turns the phrase above into concrete actions
        String actualMassage = dashboardPage.welcomeMessage.getText();
        Assert.assertTrue(actualMassage.contains(dataList.get(rowNumberForName).get("Name")));
    }
}

package com.eurotech.step_definitions;

import com.eurotech.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Navigation_StepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("Login as Teacher")
    public void login_as_teacher() {
        System.out.println("I logged in as a Teacher");
    }
    @When("Get the text of welcome")
    public void get_the_text_of_welcome() {
        System.out.println("I got the text of Welcome");
    }
    @Then("go to Developers menu and get the text of Developers")
    public void go_to_developers_menu_and_get_the_text_of_developers() {
        System.out.println("I verify the text of Developers Menu");
    }

    @Given("Login as Student")
    public void login_as_student() {
        loginPage.loginAsStudent();
    }

    @Then("go to All Posts menu and get the text of Posts")
    public void go_to_all_posts_menu_and_get_the_text_of_posts() {
        System.out.println("I verify the text of All Posts Menu");
    }


    @Then("go to My Account menu and get the text of Dashboard")
    public void go_to_my_account_menu_and_get_the_text_of_dashboard() {
        System.out.println("I verify the text of My Account Menu");
    }

    @Then("go to Admin menu and get the text of Posts")
    public void goToAdminMenuAndGetTheTextOfPosts() {
        System.out.println("I verify the text of Admin");
    }

   /* @NavigationMenu
    Feature: Navigation Menu

    @Developer
    Scenario: Navigation to Developers menu
    Given The user is on the login page
    When  The user enters teacher credentials
    Then  The user should be able to sees welcome message
    And   The user navigates to Developers menu
    Then  The user able to see developer text


    Scenario: Navigation to All Post menu
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to sees welcome message
    And The user navigates to All Post menu
    Then The user able to see Posts text

    @wip
    Scenario:Navigation to My Account menu
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to sees welcome message
    And The user navigates to My Account menu
    Then The user able to see dashboard text*/
}

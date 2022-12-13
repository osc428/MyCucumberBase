package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class Practice_StepDefs {

    @Then("The user sees header minimized")
    public void the_user_sees_header_minimized() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage();
        Thread.sleep(2000);
        dashboardPage.minimizeHeader();
        Thread.sleep(2000);
    }

}

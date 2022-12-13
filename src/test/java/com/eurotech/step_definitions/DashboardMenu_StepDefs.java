package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DashboardMenu_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> menuOptions) {
        System.out.println(menuOptions.size());
        System.out.println(menuOptions);

        List<String> actualList = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(menuOptions, actualList);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        //throw new io.cucumber.java.PendingException();
    }

    @When("The user logs in using following credentials")
    public void theUserLogsInUsingFollowingCredentials(Map<String,String> userCredentials) throws InterruptedException {
        loginPage.login(userCredentials.get("username"), userCredentials.get("password"));
        Thread.sleep(1000);
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(userCredentials.get("message")));
    }
}

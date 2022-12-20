package com.eurotech.pages;

import com.eurotech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoPage extends BasePage{
    @FindBy(name = "user-name")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(name = "login-button")
    public WebElement loginBtn;


    @FindBy(xpath = "//span[text()='Products']")
    public WebElement welcomePageHeader;

    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        BrowserUtils.waitFor(2);
    }


}

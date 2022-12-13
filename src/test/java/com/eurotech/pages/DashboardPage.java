package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {

    @FindBy(id= "dashboard-p1")
    public WebElement welcomeMessage;

    @FindBy(css = ".nav__menu-item")
    public List<WebElement> menuList;

    @FindBy(xpath = "//a[text()='All Posts']")
    public WebElement allPosts;

    @FindBy(xpath = "//a[text()='Developers']")
    public WebElement developers;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;

    @FindBy(css = "#post-form-btn")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[text()='Edit Profile']")
    public WebElement editProfile;

    @FindBy(xpath = "//*[text()='Test Automation Engineer']/../td[2]")
    public WebElement jobTitle;

    @FindBy(xpath = "//td[text()='Apple']")
    public WebElement companyName;

    public void navigateToMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();

    }

    public void navigateToSubMenu(String subMenu){
        Driver.get().findElement(By.xpath("//span[text()='"+subMenu+"']")).click();
    }


    public String getCompany(String companyName){
        return   Driver.get().findElement(By.xpath("//td[text()='"+companyName+"']")).getText();
    }

    public void minimizeHeader(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("document.getElementById('dashboard-h1').setAttribute('class', 'my-2')");
    }


}

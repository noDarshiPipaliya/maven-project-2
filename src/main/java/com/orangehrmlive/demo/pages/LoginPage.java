package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By welcomeText = By.xpath("//div[@id='logInPanelHeading']");
    By emailField = By.id("txtUsername");
    By passwordField = By.name("txtPassword");
    By loginButton = By.xpath("//input[@id='btnLogin']");
    By errorMessage = By.xpath("//span[@id='spanMessage']");


    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}

package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {



        By loginLink = By.xpath("//input[@id='btnLogin']");


        public void clickOnLoginLink(){
            clickOnElement(loginLink);
        }




    }



package com.qa.pages;

import com.qa.util.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConduitLoginObjectMap extends Baseclass {
    public ConduitLoginObjectMap()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Home")
    public static WebElement homeLink;

//    @FindBy(linkText = "Sign in")
//    public static WebElement signInLink;

    @FindBy(xpath = "//a[@href='#login']")
    public static WebElement signInLink;


    @FindBy(linkText = "Sign up")
    public static WebElement signUpLink;

    @FindBy(xpath = "//input[@type='email']")
    public static WebElement emailInputBox;

    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement signInBtn;



    public static String getPageTite()
    {
        return driver.getTitle();
    }

    public static void clickSignIn()
    {
        signInLink.click();
    }


}

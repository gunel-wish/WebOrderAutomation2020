package com.weborders.pages;

import com.weborders.utilities.BrowserUtilities;
import com.weborders.utilities.ConfigurationReader;
import org.graalvm.compiler.asm.sparc.SPARCAssembler;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;


    public void login(){
        BrowserUtilities.wait(2);
        String usernameValue= ConfigurationReader.getProperty("username");
        String passwordValue= ConfigurationReader.getProperty("password");
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }

    public void login(String usernameValue, String passwordValue){
        BrowserUtilities.wait(2);
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue , Keys.ENTER);
    }








}

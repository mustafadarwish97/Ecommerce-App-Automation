package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginLink() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement emailEle() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordELe() {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public void loginSteps(String email, String password){
        emailEle().clear();
        emailEle().sendKeys(email);
        passwordELe().clear();
        passwordELe().sendKeys(password);
    }

    public WebElement loginBtn() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] > button[type=\"submit\"]"));
    }

    public WebElement myAccountLink() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement failedMes() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}

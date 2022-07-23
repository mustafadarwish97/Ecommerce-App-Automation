package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    public WebElement registerLink() {
        return  Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
    public WebElement selectGender() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement firstNameEle() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lastNameEle() {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement dayList() {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement monthList() {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement yearList() {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public void selectBirthDateList(WebElement element, String value){
        Select dropList = new Select(element);
        dropList.selectByValue(value);
    }
    public WebElement emailEle() {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordEle() {
        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPasswordEle() {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerBtn() {
        return  Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement successMes() {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

}

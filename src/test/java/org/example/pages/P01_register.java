package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    public void enterName(String firstName, String lastName){
        firstNameEle().clear();
        firstNameEle().sendKeys(firstName);
        lastNameEle().clear();
        lastNameEle().sendKeys(lastName);
    }
    public void selectDay() {
        WebElement list1 = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select dropList = new Select(list1);
        dropList.selectByIndex(15);
    }
    public void selectMonth() {
        WebElement list2 = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select dropList = new Select(list2);
        dropList.selectByVisibleText("October");
    }
    public void selectYear() {
        WebElement list3 = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select dropList = new Select(list3);
        dropList.selectByValue("1997");
    }
    public WebElement emailEle() {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public void enterMail(String email){
        emailEle().clear();
        emailEle().sendKeys(email);
    }
    public WebElement passwordEle() {
        return  Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPasswordEle() {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public void enterPasswords(String password, String confirmPassword){
        passwordEle().clear();
        passwordEle().sendKeys(password);
        confirmPasswordEle().clear();
        confirmPasswordEle().sendKeys(confirmPassword);
    }
    public WebElement registerBtn() {
        return  Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement successMes() {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

//    public void scrollDownByPixels(){
//        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
//        js.executeScript("window.scrollBy(0,400)", "");
//    }
//    public void scrollDownIntoView(WebElement element){
//        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
//    }
}

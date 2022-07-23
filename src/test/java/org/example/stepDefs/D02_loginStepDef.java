package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login log = new P02_login();

    @Given("user go to login page")
    public void openLoginPage()
    {
        log.loginLink().click();
    }
    @When("user login with valid \"(.*)\" and \"(.*)\"$")
    public void loginWithValidData(String email, String password){
        log.loginSteps(email,password);
    }
    @When("user login with invalid \"(.*)\" and \"(.*)\"$")
    public void loginWithInvalidData(String email, String password){
        log.loginSteps(email,password);
    }
    @And("user press on login button")
    public void clickLoginBtn(){
        log.loginBtn().click();
    }
    @Then("user login to the system successfully")
    public void doAssertSuccess(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","URL Assertion");
        soft.assertTrue(log.myAccountLink().isDisplayed(), "My account Assertion");
        soft.assertAll();
    }
    @Then("user could not login to the system")
    public void doAssertFailer(){
        String actualResultColor = Color.fromString(log.failedMes().getCssValue("color")).asHex();

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(log.failedMes().getText().contains("Login was unsuccessful"), true, "Failed Message Assertion ");
        soft.assertEquals(actualResultColor.contains("#e4434b"), true,"Color Assertion 1");
        soft.assertEquals(actualResultColor, "#e4434b","Color Assertion 2");
        soft.assertAll();

    }
}

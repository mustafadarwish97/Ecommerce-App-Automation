package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register reg = new P01_register();

    @Given("user go to register page")
    public void openRegisterPage()
    {
        reg.registerLink().click();
    }
    @When("user select gender type")
    public void selectGender(){
        reg.selectGender().click();
    }
    @And("user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void enterName(String firstName, String lastName){
        reg.enterName(firstName, lastName);
    }
    @Then("user enter date of birth")
    public void enterBirthdate() throws InterruptedException {
        reg.selectDay();
        reg.selectMonth();
        reg.selectYear();
    }
    @And("user enter email field \"(.*)\"$")
    public void enterMail(String email){
        reg.enterMail(email);
    }
    @And("user fills Password fields \"(.*)\" \"(.*)\"$")
    public void enterPasswords(String password, String confirmPassword){
        reg.enterPasswords(password, confirmPassword);
    }
    @Then("user clicks on register button")
    public void clickRegisterBtn(){
        reg.registerBtn().click();
    }

    @And("success message is displayed")
    public void doAssert(){
        String actualResultColor = reg.successMes().getCssValue("color");
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(reg.successMes().getText(), "Your registration completed","Success Message Assertion ");
        soft.assertEquals(actualResultColor.contains("rgba(76, 177, 124, 1)"), true,"Color Assertion 1");
        soft.assertEquals(actualResultColor, "rgba(76, 177, 124, 1)","Color Assertion 2");
        soft.assertAll();
    }



}


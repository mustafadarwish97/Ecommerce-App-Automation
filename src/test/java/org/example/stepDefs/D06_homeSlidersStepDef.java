package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.example.pages.P03_homePage;
import org.openqa.selenium.JavascriptExecutor;

public class D06_homeSlidersStepDef {

    P03_homePage slider = new P03_homePage();
    JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;

    @When("user click on first control dot")
    public void clickFirstDot() throws InterruptedException {
        js.executeScript("arguments[0].click();", slider.controlNavSlider().get(0));
        Thread.sleep(1000);
    }
    @Then("user could click on first slider")
    public void clickFirstSlider() throws InterruptedException {
        js.executeScript("arguments[0].click();",slider.sliders().get(0));
        Thread.sleep(1000);
    }
    @When("user click on second control dot")
    public void clickSecondDot() throws InterruptedException {
        js.executeScript("arguments[0].click();",slider.controlNavSlider().get(1));
        Thread.sleep(1000);
    }
    @Then("user could click on second slider")
    public void clickSecondSlider() throws InterruptedException {
        js.executeScript("arguments[0].click();",slider.sliders().get(1));
        Thread.sleep(1000);
    }
    @And("validate \"(.*)\" is correct on \"(.*)\"$")
    public void validateSecondSlider(String expectedLink, String message) {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), expectedLink, message);
    }
}

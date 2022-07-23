package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;


public class D05_hoverCategoriesStepDef {

    P03_homePage hover = new P03_homePage();
    List<WebElement> links = hover.getSubCategory();
    String expected = null;

    @Given("user could hover on category list")
    public void getHover() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        List<WebElement> categoryList = hover.getCategory();
        action.moveToElement(categoryList.get(1)).perform();
        Thread.sleep(1000);
    }
    @Then("user click on subcategory")
    public void clickOnSelectedCategory() throws InterruptedException {
        expected = (links.get(4).getText());
        links.get(4).click();
    }
    @And("validate subcategory name on title page")
    public void validateCategory() {
        Assert.assertEquals(Hooks.driver.getTitle().contains(expected),true,"Title Assertion");
    }


}

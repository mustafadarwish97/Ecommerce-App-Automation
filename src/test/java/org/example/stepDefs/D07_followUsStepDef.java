package org.example.stepDefs;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage follow = new P03_homePage();
    ArrayList<String> tab;

    @When("user opens facebook link")
    public void openFacebook() throws InterruptedException {
        follow.followUsList().get(0).click();
        Thread.sleep(1500);
    }
    @When("user opens twitter link")
    public void openTwitter() throws InterruptedException {
        follow.followUsList().get(1).click();
        Thread.sleep(1500);
    }
    @When("user opens rss link")
    public void openRss() throws InterruptedException {
        follow.followUsList().get(2).click();
        Thread.sleep(1500);
    }
    @When("user opens youtube link")
    public void openYoutube() throws InterruptedException {
        follow.followUsList().get(3).click();
        Thread.sleep(1500);
    }
    @Then("\"(.*)\" is opened in new tab$")
    public void validateFacebook(String expectedLink){
        tab = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tab.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),expectedLink);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tab.get(0));
    }
}

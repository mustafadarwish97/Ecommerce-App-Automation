package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {

    P03_homePage search = new P03_homePage();

    @Given("^user type (.*) on search bar to search for product name$")
    public void searchName(String keyword){
        search.searchBarEle().sendKeys(keyword);
    }
    @And("click search button")
    public void clickSearchBtn(){
        search.searchBtn().click();
    }
    @Then("validate count of products appeared")
    public void validateCount() {
        SoftAssert soft = new SoftAssert();
        List<WebElement> list = search.getProducts();
        int count = search.getProducts().size();
        System.out.println(count);
        System.out.println(list.size());
        soft.assertEquals(list.size(), count, "Count Assertion");
        soft.assertAll();
    }
    @And("^validate containing searched (.*)$")
    public void validateKeyword(String keyword){
        SoftAssert soft = new SoftAssert();
        List<WebElement> list = search.getProductsName();
        for (int i = 0; i < list.size(); i++) {
            String actualKeyword = list.get(i).getText().toLowerCase().trim();
            soft.assertEquals(actualKeyword.contains(keyword),true, "Name Assertion");
        }
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="),true, "URL Assertion");
        soft.assertAll();
    }

    @Given("^user type (.*) on search bar to search for product sku$")
    public void searchSku(String keyword){
        search.searchBarEle().sendKeys(keyword);
    }

    @Then("click on product appeared in search results")
    public void clickOnProduct(){
        search.clickOnProduct().click();
    }

    @And("^validate appeared product with searched (.*)$")
    public void validateSku(String keyword){
        String actualKeyword = search.skuProduct().getText();
        Assert.assertEquals(actualKeyword.contains(keyword), true, "Sku Assertion");

    }





}

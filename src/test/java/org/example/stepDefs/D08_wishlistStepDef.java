package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_wishlistStepDef {

    P03_homePage wish = new P03_homePage();

    @When("user click on wishlist button on product")
    public void clickOnWishlistBTN(){
        wish.wishlistBtn().click();
    }
    @Then("validate success message and background color")
    public void validateSuccessMes(){
        String actualcolor = wish.notificationBar().getCssValue("background-color");
        String actual = wish.notificationBar().getText();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actual.contains("The product has been added to your wishlist"), true, "Success Message Assertion");
        soft.assertEquals(actualcolor.contains("75, 176, 122"), true, "background-color Assertion");
        soft.assertAll();
    }
    @Then("user open wishlist page")
    public void openWishlistPage(){
        wish.successMesWishlist().click();
    }
    @And("validate quantity is bigger than 0")
    public void validateQty(){
        int expected = 0;
        int actual = Integer.parseInt(wish.quantityEle().getAttribute("value"));
        Assert.assertTrue(actual > expected, "Quantity Assertion");
    }
}

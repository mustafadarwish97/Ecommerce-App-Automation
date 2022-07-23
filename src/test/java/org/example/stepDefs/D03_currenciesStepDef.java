package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;

public class D03_currenciesStepDef {

    P03_homePage home = new P03_homePage();

    @Given("user select euro currency")
    public void selectEuro(){
        WebElement currencyList = home.currencyList();
        Select dropList = new Select(currencyList);
        dropList.selectByIndex(1);
    }
    @Then("user verify Euro Symbol is shown on price")
    public void verifySymbol(){
        List<WebElement> list = home.getSymbol();
        for (int i = 0; i < list.size(); i++) {
            String actualResult = list.get(i).getText();
            System.out.println(actualResult);
            Assert.assertEquals(actualResult.contains("€"), true, "Hard Assertion on symbol");
        }
    }
}

package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {

    public void selectEuro() {
        WebElement list = Hooks.driver.findElement(By.id("customerCurrency"));
        Select dropList = new Select(list);
        dropList.selectByIndex(1);
    }
    public List<WebElement> getSymbol() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return list;
    }
    public WebElement searchBarEle() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchBtn() {
        return Hooks.driver.findElement(By.cssSelector("form[id=\"small-search-box-form\"] > button[type=\"submit\"]"));
    }
    public List<WebElement> getProducts() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"]"));
        return list;
    }
    public List<WebElement> getProductsName() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
        return list;
    }
    public WebElement clickOnProduct() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));
    }
    public WebElement skuProduct() {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"sku\"]//span[@class=\"value\"]"));
    }

    public List<WebElement> getCategory() {
        List<WebElement> list = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//li/ancestor::li"));
        return list;
    }
    public List<WebElement> getSubCategory() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("ul.top-menu.notmobile > li > ul > li > a[href*=\"/\"]"));
        return list;
    }

    public List<WebElement> controlNav() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("div[class=\"nivo-controlNav\"] > a"));
        return list;
    }
    public List<WebElement> sliders() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("div[id=\"nivo-slider\"] > a"));
        return list;
    }

    public List<WebElement> followUsList() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("ul[class=\"networks\"] > li > a"));
        return list;
    }




}

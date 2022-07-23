package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P03_homePage {

    public WebElement currencyList() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
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
    public WebElement getProductsSku() {
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
    public List<WebElement> controlNavSlider() {
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
    public WebElement wishlistBtn() {
        return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"] div[class=\"buttons\"] button[title=\"Add to wishlist\"]"));
    }
    public WebElement notificationBar() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement successMesWishlist() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"] a"));
    }
    public WebElement quantityEle() {
        return Hooks.driver.findElement(By.cssSelector("td[class=\"quantity\"] > input"));
    }
}

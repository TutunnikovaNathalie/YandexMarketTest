package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.aplana.autotests.StoriesRunner;

import javax.xml.xpath.XPath;

/**
 * Created by Samsung on 08.05.2017.
 */
public class SelectionPage extends PageObject {

    @FindBy(xpath = "//*[@id='header-search']")
    WebElement search;

    @FindBy(xpath = "//*[@class='topmenu__list']")
    WebElement menuItems;

    @FindBy(xpath = "//*[@class='catalog-menu i-bem catalog-menu_js_inited']")
    WebElementFacade productCollection;

    @FindBy(xpath = "//*[@id='glf-pricefrom-var']")
     WebElement price;

    @FindBy(xpath = "//span[text()='Применить']/..")
    WebElement applyButton;

    @FindBy(xpath = "//*[@class='search2__button']/button")
    WebElement searchButton;

    private String valueElement;

    public void selectProductGroup(String itemName){

        menuItems.findElement(By.xpath(".//a[contains(.,'"+itemName+"')]")).click();
    }

    private void scrollElement(WebElement item){

        ((JavascriptExecutor) StoriesRunner.getWebDriver()).
                executeScript("arguments[0].scrollIntoView();", item);
    }

    public void selectProduct(String productName){

        WebElement product = productCollection.findElement(By.xpath(".//*[@class='catalog-menu__list']/a[contains(.,'"+ productName +"')]"));
        if (!product.isEnabled()) {
            scrollElement(product);
        }
        product.click();
    }

    private void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
    public void inputPrice(String value)
    {
        fillField(price, value);
    }
    public void selectManufacture(String itemName) {

        WebElement product = getDriver().findElement(By.xpath("//label[contains(text(),'"+itemName+"')]/.././/input"));
        scrollElement(product);
        product.click();
    }

    public WebElement getApplyButton() {
        return applyButton;
    }

    public void checkCountElements(int count){
        String xpath = "//*[@class='n-snippet-card snippet-card clearfix i-bem n-snippet-card_js_inited']";
        int actualCount = getDriver().findElements(By.xpath(xpath)).size();
        Assert.assertTrue(String.format("Получено значение [%d]. Ожидалось [%d]", actualCount, count),
                actualCount==count);
    }

    public void rememberFirstElement() {
        String xpath = "//*[@class='n-snippet-card snippet-card clearfix i-bem n-snippet-card_js_inited']";
        valueElement = getDriver().findElements(By.xpath(xpath)).get(0).findElement(By.xpath(".//div[contains(@class,'snippet-card__subheader')]/a")).getText();

    }
    public void inputSearch() {
        search.sendKeys(valueElement);
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void checkNameProduct(){
        String xpath = "//h1";
        String actualValue = getDriver().findElement(By.xpath(xpath)).getText();
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, valueElement),
                actualValue.equals(valueElement));
    }

}

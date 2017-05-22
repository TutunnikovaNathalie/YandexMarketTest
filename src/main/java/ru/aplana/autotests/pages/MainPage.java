package ru.aplana.autotests.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Samsung on 08.05.2017.
 */
public class MainPage extends PageObject{

    @FindBy(xpath = "//*[@class='home-tabs i-bem home-tabs_js_inited']")
     WebElement menuItems;

    public void selectMenuItem(String itemName){

       menuItems.findElement(By.xpath(".//a[contains(text(),'"+itemName+"')]")).click();
    }

}

package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import ru.aplana.autotests.pages.SelectionPage;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Samsung on 08.05.2017.
 */
public class SelectionPageSteps extends ScenarioSteps {

    SelectionPage selectionPage;

    @Step("выбрана группа продуктов {0}")
    public void selectProductGroup(String itemName){

        selectionPage.selectProductGroup(itemName);
    }

    @Step("выбран продукт с наименованием {0}")
    public void selectProduct(String productName){
        selectionPage.selectProduct(productName);
    }

    @Step("Задан критерий цены от {0} руб")
    public void inputPrice(String value){

        selectionPage.inputPrice(value);

    }

    @Step("Выбирается поле {0}")
    public void selectManufacture(String field){
        selectionPage.selectManufacture(field);

    }

    @Step("Выполнено нажатие кнопки Применить")
    public void getApplyButton(){

        selectionPage.getApplyButton().click();

    }

    @Step("Выполнена проверка числа элементов на странице. Число элементов = {0}")
    public void checkCountElements(int count){

        selectionPage.checkCountElements(count);

    }

    @Step("When запомнить элемент в списке")
    public void rememberFirstElement(){

        selectionPage.rememberFirstElement();

    }

    @Step("ввести запомненное значение в поиск")
    public void inputSearch(){

        selectionPage.inputSearch();

    }

    @Step("выполнить поиск запомненного значения")
    public void getSearchButton(){

        selectionPage.getSearchButton().click();

    }
    @Step("выполнить проверку: наименование товара соответствует запомненному значению")
    public void checkNameProduct(){

        selectionPage.checkNameProduct();

    }


}

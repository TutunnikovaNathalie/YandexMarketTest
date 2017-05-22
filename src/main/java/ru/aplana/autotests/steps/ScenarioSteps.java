package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.*;

/**
 * Created by Samsung on 08.05.2017.
 */
public class ScenarioSteps {

    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    SelectionPageSteps selectionPageSteps;

    @When("выбран пункт меню \"$menuName\"")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("выбрана группа продуктов с наименованием \"$groupName\"")
    public void selectProductGroup(String itemName){

        selectionPageSteps.selectProductGroup(itemName);
    }

    @When("выбран продукт с наименованием \"$productName\"")
    public void selectProduct(String productName){
        selectionPageSteps.selectProduct(productName);
    }

    @When("задан параметр поиска - цена равна \"$price\"")
    public void inputPrice(String price){
        selectionPageSteps.inputPrice(price);
    }

    @Then("значения полей равны: $fields")
    public void selectManufacture(ExamplesTable fields){
        for (Map<String, String> row : fields.getRows()) {

            String field = row.get("field");
            selectionPageSteps.selectManufacture(field);
        }
    }

    @When("запомнить элемент в списке")
    public void rememberFirstElement(){
        selectionPageSteps.rememberFirstElement();
    }

    @When("ввести запомненное значение в поиск")
    public void inputSearch(){
        selectionPageSteps.inputSearch();
    }

    @When("выполнить поиск запомненного значения")
    public void getSearchButton(){
        selectionPageSteps.getSearchButton();
    }

    @Then("выполнить проверку: наименование товара соответствует запомненному значению")
    public void checkNameProduct(){
      selectionPageSteps.checkNameProduct();
    }


    /*@When("выбран производитель \"$manufacture1\"")
    public void inputPrice(String manufacture1){
        List<String> listManufactures = new ArrayList<String>();
        listManufactures.add(manufacture1);
        listManufactures.add(manufacture2);
        selectionPageSteps.selectManufacture(listManufactures);
    }*/
    /*@When("выбраны производители \"$manufacture1\" и \"$manufacture2\"")
    public void inputPrice(String manufacture1, String manufacture2){
        List<String> listManufactures = new ArrayList<String>();
        listManufactures.add(manufacture1);
        listManufactures.add(manufacture2);
        selectionPageSteps.selectManufacture(listManufactures);
    }*/

    @When("выполнено нажатие на кнопку Применить")
    public void getApplyButton(){
        selectionPageSteps.getApplyButton();
    }

    @Then("количество элементов на странице равно \"$count\"")
    public void checkCountElements(int count){
        selectionPageSteps.checkCountElements(count);
    }

}

package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import ru.aplana.autotests.pages.MainPage;

/**
 * Created by Samsung on 08.05.2017.
 */
public class MainPageSteps extends ScenarioSteps {

    MainPage mainPage;

    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){

        mainPage.selectMenuItem(menuItem);
    }

}

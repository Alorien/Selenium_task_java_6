package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps {



    @Step("Переход в : {0}")
    public void selectMenuItem(String menuItem){
        new MainPage().chooseMarket(menuItem);
    }


}
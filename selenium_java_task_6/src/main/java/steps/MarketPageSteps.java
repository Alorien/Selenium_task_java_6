package steps;
import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {
    @Step("Выбор элемента меню : {0}")
    public void enterElemSearch(String menuItem){
        new MarketPage().clickMenu(menuItem);
    }
    @Step("Выбор подэлемента меню : {0}")
    public void searchBtnClick(String menuItem){
        new MarketPage().clickSubMenu(menuItem);
    }
}

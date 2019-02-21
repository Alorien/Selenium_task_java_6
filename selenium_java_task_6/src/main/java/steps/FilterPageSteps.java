package steps;
import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;
public class FilterPageSteps {
    @Step("Заполнение поля цены : {0}")
    public void fillPrice(String menuItem){
        new FilterPage().fillPrice(menuItem);
    }
    @Step("Нажатие на чекбокс : {0}")
    public void clickDevModel(String menuItem){
        new FilterPage().clickDevModel(menuItem);
    }
    @Step("Кнопка применить фильтр: {0}")
    public void clickDoneFilter(String menuItem){
        new FilterPage().clickDoneFilter();
    }

}

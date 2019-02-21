package steps;
import pages.SearchPage;
import ru.yandex.qatools.allure.annotations.Step;
public class SearchPageSteps {
    @Step("Проверка количество элементов: {0}")
    public void chooseMarket(int size){
        new SearchPage().chooseMarket(size);
    }
    @Step("Сохранение первого элемента: {0}")
    public void saveElem(String menuItem){
        SearchPage.saveElem();
    }
    @Step("Ввод первого элемента в поисковую строку : {0}")
    public void enterElemSearch(String menuItem){
        new SearchPage().enterElemSearch();
    }
    @Step("Нажатие кнопки : {0}")
    public void searchBtnClick(String menuItem){
        new SearchPage().searchBtnClick();
    }

}

package steps;

import cucumber.api.java.en.When;




public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    MarketPageSteps marketPageSteps = new MarketPageSteps();
    AllProductPageSteps allProductPageSteps = new AllProductPageSteps();
    FilterPageSteps filterPageSteps = new FilterPageSteps();
    SearchPageSteps searchPageSteps = new SearchPageSteps();
    ProductPageSteps productPageSteps = new ProductPageSteps();


    @When("^переход в меню:\"(.+)\"$")
    public void selectMenuItem(String menuName){
        mainPageSteps.selectMenuItem(menuName);
    }

    @When("^выбрано меню:\"(.+)\"$")
    public void enterElemSearch(String menuName){
        marketPageSteps.enterElemSearch(menuName);
    }
    @When("^выбрано все фильтры:\"(.+)\"$")
    public void allFilters(String menuName){
        allProductPageSteps.clickFilter(menuName);
    }

    @When("^выбрано подменю:\"(.+)\"$")
    public void searchBtnClick(String menuName){
        marketPageSteps.searchBtnClick(menuName);
    }
    @When("^заполнена цена:\"(.+)\"$")
    public void selectMinIsuration(String menuName){
        filterPageSteps.fillPrice(menuName);
    }
    @When("^выбран производитель:\"(.+)\"$")
    public void clickDevModel(String menuName){
        filterPageSteps.clickDevModel(menuName);
    }
    @When("^кнопка Применить фильтр:\"(.+)\"$")
    public void clickDoneFilter(String menuName){
        filterPageSteps.clickDoneFilter(menuName);
    }
    @When("^проверка количества элементов:\"(.+)\"$")
    public void chooseMarket(int size){
        searchPageSteps.chooseMarket(size);
    }
    @When("^название элемента запомнено:\"(.+)\"$")
    public void saveElem(String menuName){
        searchPageSteps.saveElem(menuName);
    }
    @When("^ввод заполненного элемента:\"(.+)\"$")
    public void enterElemSearches(String menuName){
        searchPageSteps.enterElemSearch(menuName);
    }
    @When("^нажатие кнопки Поиск:\"(.+)\"$")
    public void searchBtnClicks(String menuName){
        searchPageSteps.searchBtnClick(menuName);
    }

    @When("^сохранный элемент проверен:\"(.+)\"$")
    public void enterElemSearche(String menuName){
        productPageSteps.enterElemSearch(menuName);
    }

}
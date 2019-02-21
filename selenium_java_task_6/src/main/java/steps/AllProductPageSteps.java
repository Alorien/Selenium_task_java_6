package steps;
import pages.AllProductPage;
import ru.yandex.qatools.allure.annotations.Step;
public class AllProductPageSteps {
    @Step("Переход в : {0}")
    public void clickFilter(String menuItem){
        new AllProductPage().clickFilter(menuItem);
    }
}

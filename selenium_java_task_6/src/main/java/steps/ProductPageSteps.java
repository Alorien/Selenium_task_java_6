package steps;
import pages.ProductPage;
import ru.yandex.qatools.allure.annotations.Step;
public class ProductPageSteps {
    @Step("Проверка названия продукта : {0}")
    public void enterElemSearch(String menuItem){
        new ProductPage().checkProduct(menuItem);
    }
}

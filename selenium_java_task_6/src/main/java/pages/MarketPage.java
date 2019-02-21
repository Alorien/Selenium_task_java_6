package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class MarketPage {



    public MarketPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);

    public void checkTextPage(String textPage){
        String xpath = "//div[@data-pid = 'SBRF-TEXT-1016295']//h3";
        String actualValue = BaseSteps.getDriver().findElement(By.xpath(xpath)).getText();
        org.junit.Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, textPage),
                actualValue.contains(textPage));
    }
    public  void clickMenu(String itemName){
        WebElement btn = BaseSteps.getDriver().findElement(By.xpath("//span[@class='n-w-tab__control-caption'] [contains(text(),'"+itemName+"')]"));
        wait.until(ExpectedConditions.visibilityOf(btn)).click();
    }
    public  void clickSubMenu(String itemName){
        BaseSteps.getDriver().findElement(By.xpath("//a[contains(text(),'"+itemName+"')]")).click();
    }
}



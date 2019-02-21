package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FilterPage{
    public FilterPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void fillPrice(String value){
        BaseSteps.getDriver().findElement(By.xpath("//input[@name='glf-pricefrom-var']")).sendKeys(value);
    }
    public void clickDevModel(String value){
        BaseSteps.getDriver().findElement(By.xpath("//label[@class='checkbox__label'][contains(text(),'"+value+"')]")).click();
    }

    public  void clickDoneFilter(){
        BaseSteps.getDriver().findElement(By.xpath("//a[@class='button button_size_l button_theme_pseudo i-bem button_action_show-filtered n-filter-panel-extend__controll-button_size_big button_js_inited']")).click();

    }

}
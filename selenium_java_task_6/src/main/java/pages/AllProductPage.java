package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class AllProductPage {
    public AllProductPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public  void clickFilter(String itemName){
        BaseSteps.getDriver().findElement(By.xpath("//span[@class='_28j8Lq95ZZ'][contains(text(),'"+itemName+"')]")).click();
    }

}


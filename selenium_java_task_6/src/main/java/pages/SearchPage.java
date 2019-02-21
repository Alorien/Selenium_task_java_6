package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class SearchPage{
    public static String firstElem;
    public SearchPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void chooseMarket(int sizeItem){
        int numElem = BaseSteps.getDriver().findElements(By.xpath("//div[@class='n-snippet-card2__part n-snippet-card2__part_type_left']")).size();
    }
    public static void saveElem(){
        firstElem = BaseSteps.getDriver().findElement(By.xpath("//div[@class='n-snippet-cell2__title']/a")).getAttribute("title");
    }


    public void enterElemSearch(){
        BaseSteps.getDriver().findElement(By.xpath("//input[@id='header-search']")).sendKeys(firstElem);
    }
    public void searchBtnClick(){
        BaseSteps.getDriver().findElement(By.xpath("//button[@role='button']")).click();
    }

}
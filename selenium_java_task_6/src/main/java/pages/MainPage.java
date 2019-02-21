package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;


public class MainPage{




    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

        public void chooseMarket(String itemName){
        BaseSteps.getDriver().findElement(By.xpath("//a[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'] [contains(text(),'"+itemName+"')]")).click();
    }


}
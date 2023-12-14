package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@role='columnheader']")
    public List<WebElement> baslikElementleriListesi;

    @FindBy(xpath = "//*[@role='gridcell']")
    public List<WebElement> tumDataElementleriListesi;

    @FindBy(xpath = "//*[@class='rt-td']")
    public List<WebElement> hucrelerListesi;

    @FindBy(xpath = "//*[@role='rowgroup']")
    public List<WebElement> tabloSatirElementleriListesi;

    @FindBy(xpath = "//*[@role='rowgroup'] // *[@role='gridcell'][3]")
    public List<WebElement> ucuncuKolonElementleriListesi;

    @FindBy(xpath = "//*[@role='rowgroup'][3] // *[@role='gridcell'][5]")
    public WebElement kierraMaasElementi;

}



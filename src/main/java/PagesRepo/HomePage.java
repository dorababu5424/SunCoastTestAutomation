package PagesRepo;

import Basa.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {


    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public WebElement getBookNow() {
        return BookNow;
    }

    public void setBookNow(WebElement bookNow) {
        BookNow = bookNow;
    }




    @FindBy(xpath = "//a[@class='btn btn-primary btn-lg   btn_cutom10-1']")
    private WebElement BookNow;

    @FindBy(xpath = "//*[@id='dt_basic']/tbody/tr[1]/td[9]/text()")
    private WebElement FieldData;

    public WebElement getFieldData() {
        return FieldData;
    }

    public void setFieldData(WebElement fieldData) {
        FieldData = fieldData;
    }
}

package PagesRepo;

import Basa.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public WebElement getUserName() {
        return userName;
    }

    public void setUserName(WebElement userName) {
        this.userName = userName;
    }

    public WebElement getPassword() {
        return Password;
    }

    public void setPassword(WebElement password) {
        Password = password;
    }

    public WebElement getLogin() {
        return Login;
    }

    public void setLogin(WebElement login) {
        Login = login;
    }

    @FindBy(xpath = "//input[@class='text-box single-line']")
    private WebElement userName;

    @FindBy(id ="password")
    private WebElement Password;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement Login;



}

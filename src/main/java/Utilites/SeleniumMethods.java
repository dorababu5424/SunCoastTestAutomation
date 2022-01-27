package Utilites;


import Basa.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SeleniumMethods extends BaseClass {

    public static void  SendData(WebElement web, String Data){
        web.sendKeys(Data);
    }

    public  static void ClickButton(WebElement Web1){
        Web1.click();
    }

    public static void ScrollDown(int i){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+i+")");
    }



    public static void SwtichNextWin(int i){

       Set<String> currentWin =  driver.getWindowHandles();
        List<String> win = new LinkedList<String>();
        win.addAll(currentWin);
        driver.switchTo().window(win.get(i));
        
    }

    public static String GetElementText(WebElement e){

      String Text =  e.getText();

        return Text ;
    }


    public void SelectByName(WebElement e1,String data){

        Select s = new Select(e1);
        s.selectByVisibleText(data);

    }

    public static void Sleep(int i){
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void TABkey(){
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        r.keyPress(KeyEvent.VK_TAB);
    }

    public static void ENTERkey(){
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        r.keyPress(KeyEvent.VK_ENTER);
    }

    public static void  DoubleClick(WebElement e1){

        Actions a = new Actions(driver);
        a.doubleClick(e1).perform();
    }
}

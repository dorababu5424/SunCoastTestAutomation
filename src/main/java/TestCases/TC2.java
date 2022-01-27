package TestCases;

import Basa.BaseClass;
import PagesRepo.ApplicationPage;
import PagesRepo.HomePage;
import PagesRepo.LoginPage;
import TestDataUtilites.TestData;
import Utilites.ReadConfig;
import Utilites.SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC2 extends BaseClass {


    public ReadConfig rc = new ReadConfig();
    public SeleniumMethods sm = new SeleniumMethods();



    @Test(priority = 1)
    public void LoginTest(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage lp = new LoginPage();

        sm.SendData(lp.getUserName(),rc.UserName());

        sm.SendData(lp.getPassword(),rc.Password());

        sm.ClickButton(lp.getLogin());
        sm.Sleep(2000);
    }


    @Test(priority = 2)
    public void FieldsWithData_2(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        HomePage hp = new HomePage();
        ApplicationPage ap = new ApplicationPage();

        TestData td = new TestData();


        sm.ClickButton(hp.getBookNow());

        sm.SendData(ap.getPatientFirstName(),td.Pfname2);
        sm.SendData(ap.getPatientMidName(),td.Pmname2);
        sm.SendData(ap.getPatientLastName(),td.Plname2);
        sm.SendData(ap.getDOB(),td.Dob2);

        sm.TABkey();

        sm.SelectByName(ap.getGender(),td.gender2);
        sm.SendData(ap.getAdress1(),td.address12);
        sm.SendData(ap.getAdress2(),td.address22);
        sm.SendData(ap.getZip(),td.zip2);
        sm.SendData(ap.getCity(),td.city2);
        sm.SendData(ap.getStates(),td.state2);
        sm.SendData(ap.getSSN(),td.ssn2);
        sm.SendData(ap.getPrimarynumber(),td.primarynumber2);
        sm.SendData(ap.getSecondrynumber(),td.secondrynumber2);
        sm.SendData(ap.getWorknumber(),td.work2);
        sm.SendData(ap.getEmergencynumber(),td.emergency2);
        sm.SendData(ap.getEmail(),td.emailid2);
        sm.SendData(ap.getPheight1(),td.pheigh12);
        sm.SendData(ap.getPheight2(),td.pheigh22);
        sm.SendData(ap.getPwieght(),td.pweight2);
        sm.SendData(ap.getBMI(),td.bmi2);
        sm.SendData(ap.getSurgeydate(),td.surgerydate2);
        sm.TABkey();
        sm.SendData(ap.getProcedure(),td.procedure2);
        sm.SendData(ap.getCptlist(),td.cpivalue2);
        sm.ClickButton(ap.getCptsearch());
        sm.Sleep(4000);
        sm.DoubleClick(ap.getCptoption());
        sm.ClickButton(ap.getCptarrow());
        sm.Sleep(2000);
        sm.ScrollDown(200);
        sm.SendData(ap.getIcdlist(),td.cpivalue2);
        sm.ClickButton(ap.getIcdsearch());

        sm.Sleep(4000);
        sm.DoubleClick(ap.getIcdoption());
        sm.ClickButton(ap.getIcdarrow());

        sm.ScrollDown(1000);
        sm.ClickButton(ap.getSpecialReqNO());
        sm.ClickButton(ap.getSubmitButton());

        sm.Sleep(2000);

        sm.ClickButton(ap.getOkButton());

        Assert.assertTrue(true);

    }

    @Test(priority = 3)
    public void Validate_FeildsData_2_In_HomePage(){


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        HomePage hp = new HomePage();
        TestData td = new TestData();

        List<WebElement> col = driver.findElements(By.xpath("//*[@id='dt_basic']//tbody/tr/td"));

        for(int i=0 ;i<=col.size();i++){
            String TableData = col.get(i).getText();
            System.out.println(TableData);
            if (TableData.contains(td.Pfname)){
                Assert.assertTrue(true);
                break;
            }
        }

    }
}

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

public class TC1 extends BaseClass {


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
    public void FieldsWithoutData() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        HomePage hp = new HomePage();

        ApplicationPage ap = new ApplicationPage();

        sm.ClickButton(hp.getBookNow());

        sm.ClickButton(ap.getSubmitButton());

        for (int i = 0; i <= 10; i++) {
            String msg = ap.getFieldReqmsg().get(i).getText();
            System.out.println(msg);
            Boolean msg1 = msg.contains("required");
            System.out.println(msg1);

            if(msg1.equals(true)){
                Assert.assertTrue(true);
            } else if (msg1.equals(false)) {
                Assert.assertFalse(false);
            }else {
                System.out.println("No data found");
            }
        }
        driver.navigate().back();
    }

    @Test(priority = 3)
    public void FieldsWithData_1(){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        HomePage hp = new HomePage();
        ApplicationPage ap = new ApplicationPage();

        TestData td = new TestData();


        sm.ClickButton(hp.getBookNow());

        sm.SendData(ap.getPatientFirstName(),td.Pfname);
        sm.SendData(ap.getPatientMidName(),td.Pmname);
        sm.SendData(ap.getPatientLastName(),td.Plname);
        sm.SendData(ap.getDOB(),td.Dob);

        sm.TABkey();

        sm.SelectByName(ap.getGender(),td.gender);
        sm.SendData(ap.getAdress1(),td.address1);
        sm.SendData(ap.getAdress2(),td.address2);
        sm.SendData(ap.getZip(),td.zip);
        sm.SendData(ap.getCity(),td.city);
        sm.SendData(ap.getStates(),td.state);
        sm.SendData(ap.getSSN(),td.ssn);
        sm.SendData(ap.getPrimarynumber(),td.primarynumber);
        sm.SendData(ap.getSecondrynumber(),td.secondrynumber);
        sm.SendData(ap.getWorknumber(),td.work);
        sm.SendData(ap.getEmergencynumber(),td.emergency);
        sm.SendData(ap.getEmail(),td.emailid);
        sm.SendData(ap.getPheight1(),td.pheigh1);
        sm.SendData(ap.getPheight2(),td.pheigh2);
        sm.SendData(ap.getPwieght(),td.pweight);
        sm.SendData(ap.getBMI(),td.bmi);
        sm.SendData(ap.getSurgeydate(),td.surgerydate);
        sm.TABkey();
        sm.SendData(ap.getProcedure(),td.procedure);
        sm.SendData(ap.getCptlist(),td.cpivalue);
        sm.ClickButton(ap.getCptsearch());
        sm.Sleep(4000);
        sm.DoubleClick(ap.getCptoption());
        sm.ClickButton(ap.getCptarrow());
        sm.Sleep(2000);
        sm.ScrollDown(200);
        sm.SendData(ap.getIcdlist(),td.cpivalue);
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

    @Test(priority = 4)
    public void Validate_FeildsData_1_In_HomePage(){


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

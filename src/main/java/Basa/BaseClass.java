package Basa;

import Utilites.DiverFactory;
import Utilites.ReadConfig;
import Utilites.TimeDate;
import org.testng.annotations.*;

public class BaseClass extends DiverFactory {



    public static ReadConfig readConfig;


    @BeforeSuite
    public void SuiteRun() {

        System.out.println("-------------------------TEST SUITE STARTED------------------------");
    }



    @BeforeTest
    public void BrowserLunch() {

        TimeDate td = new TimeDate();
        System.out.println("Test Started in  " + " " + "Time " + " " + td.currentDate());

    }
    @Parameters({"browsertype"})
    @BeforeClass
    public void BrowserSetup(String browser) {

        Initilization(browser);

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.get(ReadConfig.ApplicationURL());
    }

    @AfterClass
    public void TestTime() {

         // DriverKill();
    }

    @AfterTest
    public void KillBrowser() {

        TimeDate td = new TimeDate();
        System.out.println("Test Finised in  " + " " + "Date " + " " + td.currentDate());

    }

    @AfterSuite
    public void SuiteFinied() {
        System.out.println("------------------TEST Suite COMPLETED--------------------------------");
    }
}




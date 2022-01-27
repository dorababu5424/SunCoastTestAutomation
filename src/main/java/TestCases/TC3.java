package TestCases;

import Basa.BaseClass;
import PagesRepo.LoginPage;
import Utilites.ReadConfig;
import Utilites.SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC3  extends BaseClass {


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
    public void sam1() {

        String headerLoc = "//table[@id='dt_basic']//tr//th";
        List<WebElement> allHeadersEle = driver.findElements(By.xpath(headerLoc));
        List<String> allHeaderNames = new ArrayList<String>();

        for (WebElement header : allHeadersEle) {
            String headerName = header.getText();
            allHeaderNames.add(headerName);
        }

        List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String, String>>();
        boolean flag = true;



            String rowLoc = "//table[@id='dt_basic']//tbody/tr";

            List<WebElement> allRowsEle = driver.findElements(By.xpath(rowLoc));

            for (int i = 1; i <= allRowsEle.size(); i++) {

                String specificRowLoc = "//table[@id='dt_basic']//tbody/tr[" + i + "]";

                List<WebElement> allColumnsEle = driver.findElement(By.xpath(specificRowLoc))
                        .findElements(By.tagName("td"));
                LinkedHashMap<String, String> eachRowData = new LinkedHashMap<>();

                for (int j = 0; j < allColumnsEle.size(); j++) {
                    // Getting cell value
                    String cellValue = allColumnsEle.get(j).getText();
                    // We will put in to map with header name and value with iteration
                    // Get jth index value from allHeaderNames and jth cell value of row
                    eachRowData.put(allHeaderNames.get(j), cellValue);


                }

                allTableData.add(eachRowData);


            }


        System.out.println(allTableData.get(2));


    }



//    @Test(priority = 3)
//    public void sam() {
//
//
//        // Let's get header first
//        String headerLoc = "//table[@id='dt_basic']//tr//th";
//        List<WebElement> allHeadersEle = driver.findElements(By.xpath(headerLoc));
//        List<String> allHeaderNames = new ArrayList<String>();
//        for (WebElement header : allHeadersEle) {
//            String headerName = header.getText();
//            allHeaderNames.add(headerName);
//        }
//
//        // Each row will be a key value pair. So we will use LinkedHashMap so that order
//        // can be retained.
//        // All map will be added to a list.
//        List<LinkedHashMap<String, String>> allTableData = new ArrayList<LinkedHashMap<String, String>>();
//        boolean flag = true;
//
//        while (flag) {
//            // Get total rows count
//            String rowLoc = "//table[@id='dt_basic']//tbody/tr";
//            List<WebElement> allRowsEle = driver.findElements(By.xpath(rowLoc));
//            for (int i = 1; i <= allRowsEle.size(); i++) {
//                // Getting specific row with each iteration
//                String specificRowLoc = "//table[@id='dtBasicExample']//tbody/tr[" + i + "]";
//                // Locating only cells of specific row.
//                List<WebElement> allColumnsEle = driver.findElement(By.xpath(specificRowLoc))
//                        .findElements(By.tagName("td"));
//                // Creating a map to store key-value pair data. It will be created for each
//                // iteration of row
//                LinkedHashMap<String, String> eachRowData = new LinkedHashMap<>();
//                // Iterating each cell
//                for (int j = 0; j < allColumnsEle.size(); j++) {
//                    // Getting cell value
//                    String cellValue = allColumnsEle.get(j).getText();
//                    // We will put in to map with header name and value with iteration
//                    // Get jth index value from allHeaderNames and jth cell value of row
//                    eachRowData.put(allHeaderNames.get(j), cellValue);
//                }
//                // After iterating row completely, add in to list.
//                allTableData.add(eachRowData);
//
//            }
//            if ((driver.findElement(By.id("dtBasicExample_next")).getAttribute("class").contains("disabled"))) {
//                flag = false;
//                break;
//            } else {
//                // Before clicking Checking current page
//                int currentPage = Integer.parseInt(driver.findElement(By.xpath("//a[@class='paginate_button current']")).getText().trim());
//                System.out.println("We are at page "+currentPage+" now.");
//                driver.findElement(By.id("dtBasicExample_next")).click();
//                // Now we know for which page I need to wait
//                String customLoc = "//a[contains(@class,'paginate_button') and text()='"+(currentPage+1)+"']";
//                // Waiting till class attribute contains current
//             //   new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeContains(By.xpath(customLoc), "class", "current"));
//            }
//        }
//
//    }

}

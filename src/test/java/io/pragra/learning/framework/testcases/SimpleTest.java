package io.pragra.learning.framework.testcases;

import io.pragra.learning.framework.data.CSVDataProvider;
import io.pragra.learning.framework.data.ExcelDataProvider;
import io.pragra.learning.framework.drivermanager.DriverManager;
import io.pragra.learning.framework.pages.ContactSalePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class SimpleTest {
    WebDriver driver ;
    ContactSalePage page ;
    @BeforeSuite(enabled = false)
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get("https://zoom.us/contactsales");

    }

    @Test(enabled = false, dataProviderClass = ExcelDataProvider.class,dataProvider = "excelProvider")
    public void testName(Object [] data) throws InterruptedException {
        page = new ContactSalePage(driver);

        page.enterEmail((String)data[0])
                .company((String)data[1])
                .firstName((String)data[2])
                .lastName((String)data[3])
                .empCountByValue((String)data[4])
                .phone(data[5])
                .countryByValue((String)data[6])
                .zip(data[7])
                .addInfo((String)data[8]);

        Thread.sleep(8000);
        page.resetForm();

    }

    @Test(dataProviderClass = ExcelDataProvider.class,dataProvider = "loginProvider")
    public void testName(String loginname, String pass) {
        System.out.println(loginname);
        System.out.println(pass);
    }

    @AfterSuite(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}

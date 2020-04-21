package io.pragra.learning.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactSalePage {
    private WebDriver driver;

    @FindBy(name = "email")
    private WebElement workEmail;
    @FindBy(name = "company")
    private WebElement company;
    @FindBy(name = "first_name")
    private WebElement firstName;
    @FindBy(name = "last_name")
    private WebElement lastName;
    @FindBy(id = "employee_count")
    private WebElement empCount;
    @FindBy(name = "phone")
    private WebElement phone;
    @FindBy(name = "country")
    private WebElement country;
    @FindBy(id = "state_container")
    private WebElement state;
    @FindBy(id = "city")
    private WebElement hqZip;
    @FindBy(id = "description")
    private WebElement additionalInfo;

    @FindBy(id = "btnSubmit")
    private WebElement submitBtn;

    public ContactSalePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public ContactSalePage enterEmail(String email){
        this.workEmail.sendKeys(email.trim());
        return this;
    }

    public ContactSalePage company(String comp){
        this.company.sendKeys(comp.trim());
        return this;
    }

    public ContactSalePage firstName(String fname){
        this.firstName.sendKeys(fname.trim());
        return this;
    }

    public ContactSalePage lastName(String lname){
        this.lastName.sendKeys(lname.trim());
        return this;
    }

    public ContactSalePage empCountByValue(String val){
        Select empCnt = new Select(this.empCount);
        empCnt.selectByValue(val.trim());
        return this;
    }
    public ContactSalePage phone(Object phone){
        this.phone.sendKeys(String.valueOf(phone));
        return this;
    }

    public ContactSalePage countryByValue(String val){
        Select countrySel = new Select(this.country);
        countrySel.selectByValue(val.trim());
        return this;
    }


    public ContactSalePage zip(Object zip){
        this.hqZip.sendKeys(String.valueOf(zip));
        return this;
    }


    public ContactSalePage addInfo(String addInfo){
        this.additionalInfo.sendKeys(addInfo.trim());
        return this;
    }

    public void resetForm(){
        this.workEmail.clear();
        this.company.clear();
        this.firstName.clear();
        this.lastName.clear();
        this.country.clear();
        this.hqZip.clear();
        this.phone.clear();
        this.additionalInfo.clear();
    }




}

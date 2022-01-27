package PagesRepo;

import Basa.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ApplicationPage extends BaseClass {

    public ApplicationPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btnSubmit")
    private WebElement SubmitButton;

    public WebElement getSubmitButton() {
        return SubmitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        SubmitButton = submitButton;
    }

    public List<WebElement> getFieldReqmsg() {
        return FieldReqmsg;
    }

    public void setFieldReqmsg(List<WebElement> fieldReqmsg) {
        FieldReqmsg = fieldReqmsg;
    }

    @FindBy(xpath = "//small[@class='help-block']")
    private List<WebElement> FieldReqmsg;


    @FindBy(id="patientFirstName")
    private WebElement patientFirstName;

    @FindBy(id="patientMidName")
    private WebElement patientMidName;

    public WebElement getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(WebElement patientLastName) {
        this.patientLastName = patientLastName;
    }

    @FindBy(id="patientLastName")
    private WebElement patientLastName;

    @FindBy(id="bdate")
    private WebElement DOB;

    @FindBy(xpath = "//select[@id='gender']")
    private WebElement Gender;

    @FindBy(id="adress1")
    private WebElement adress1;

    @FindBy(id="adress2")
    private WebElement adress2;

    @FindBy(id="zip")
    private WebElement zip;

    @FindBy(id="city")
    private WebElement city;

    @FindBy(id="states")
    private WebElement states;

    @FindBy(id="socsec")
    private WebElement SSN;

    @FindBy(id="home")
    private WebElement primarynumber;

    @FindBy(id="cell")
    private WebElement secondrynumber;

    @FindBy(id="work")
    private WebElement worknumber;

    @FindBy(id="emergency")
    private WebElement emergencynumber;

    @FindBy(id="email")
    private WebElement email;

    @FindBy(xpath = "//select[@id='patfeet']")
    private WebElement pheight1;

    @FindBy(xpath = "//select[@id='patinches']")
    private WebElement pheight2;

    @FindBy(id="patweight")
    private WebElement pwieght;

    @FindBy(id="patBMI")
    private WebElement BMI;

    public WebElement getProcedure() {
        return procedure;
    }

    public void setProcedure(WebElement procedure) {
        this.procedure = procedure;
    }

    @FindBy(xpath = "//input[@name='Surdate']")
    private WebElement surgeydate;

    @FindBy(id = "procedure")
    private WebElement procedure;


    @FindBy(id="filter")
    private WebElement cptlist;

    @FindBy(xpath="//input[@onclick='SortCPT();']")
    private WebElement cptsearch;

    @FindBy(xpath = "//*[@id='cpt_helper1']/option[1]")
    private WebElement cptoption;


    @FindBy(id="btnAdd")
    private WebElement cptarrow;


    @FindBy(id="filter1")
    private WebElement icdlist;

    @FindBy(xpath="//input[@onclick='SortICD();']")
    private WebElement icdsearch;

    public WebElement getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(WebElement patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public WebElement getPatientMidName() {
        return patientMidName;
    }

    public void setPatientMidName(WebElement patientMidName) {
        this.patientMidName = patientMidName;
    }

    public WebElement getDOB() {
        return DOB;
    }

    public void setDOB(WebElement DOB) {
        this.DOB = DOB;
    }

    public WebElement getGender() {
        return Gender;
    }

    public void setGender(WebElement gender) {
        Gender = gender;
    }

    public WebElement getAdress1() {
        return adress1;
    }

    public void setAdress1(WebElement adress1) {
        this.adress1 = adress1;
    }

    public WebElement getAdress2() {
        return adress2;
    }

    public void setAdress2(WebElement adress2) {
        this.adress2 = adress2;
    }

    public WebElement getZip() {
        return zip;
    }

    public void setZip(WebElement zip) {
        this.zip = zip;
    }

    public WebElement getCity() {
        return city;
    }

    public void setCity(WebElement city) {
        this.city = city;
    }

    public WebElement getStates() {
        return states;
    }

    public void setStates(WebElement states) {
        this.states = states;
    }

    public WebElement getSSN() {
        return SSN;
    }

    public void setSSN(WebElement SSN) {
        this.SSN = SSN;
    }

    public WebElement getPrimarynumber() {
        return primarynumber;
    }

    public void setPrimarynumber(WebElement primarynumber) {
        this.primarynumber = primarynumber;
    }

    public WebElement getSecondrynumber() {
        return secondrynumber;
    }

    public void setSecondrynumber(WebElement secondrynumber) {
        this.secondrynumber = secondrynumber;
    }

    public WebElement getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(WebElement worknumber) {
        this.worknumber = worknumber;
    }

    public WebElement getEmergencynumber() {
        return emergencynumber;
    }

    public void setEmergencynumber(WebElement emergencynumber) {
        this.emergencynumber = emergencynumber;
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public WebElement getPheight1() {
        return pheight1;
    }

    public void setPheight1(WebElement pheight1) {
        this.pheight1 = pheight1;
    }

    public WebElement getPheight2() {
        return pheight2;
    }

    public void setPheight2(WebElement pheight2) {
        this.pheight2 = pheight2;
    }

    public WebElement getPwieght() {
        return pwieght;
    }

    public void setPwieght(WebElement pwieght) {
        this.pwieght = pwieght;
    }

    public WebElement getBMI() {
        return BMI;
    }

    public void setBMI(WebElement BMI) {
        this.BMI = BMI;
    }

    public WebElement getSurgeydate() {
        return surgeydate;
    }

    public void setSurgeydate(WebElement surgeydate) {
        this.surgeydate = surgeydate;
    }

    public WebElement getCptlist() {
        return cptlist;
    }

    public void setCptlist(WebElement cptlist) {
        this.cptlist = cptlist;
    }

    public WebElement getCptsearch() {
        return cptsearch;
    }

    public void setCptsearch(WebElement cptsearch) {
        this.cptsearch = cptsearch;
    }

    public WebElement getCptoption() {
        return cptoption;
    }

    public void setCptoption(WebElement cptoption) {
        this.cptoption = cptoption;
    }

    public WebElement getCptarrow() {
        return cptarrow;
    }

    public void setCptarrow(WebElement cptarrow) {
        this.cptarrow = cptarrow;
    }

    public WebElement getIcdlist() {
        return icdlist;
    }

    public void setIcdlist(WebElement icdlist) {
        this.icdlist = icdlist;
    }

    public WebElement getIcdsearch() {
        return icdsearch;
    }

    public void setIcdsearch(WebElement icdsearch) {
        this.icdsearch = icdsearch;
    }

    public WebElement getSpecialReqNO() {
        return SpecialReqNO;
    }

    public void setSpecialReqNO(WebElement specialReqNO) {
        SpecialReqNO = specialReqNO;
    }

    @FindBy(xpath = "//*[@id=\"movieForm\"]/div[1]/div[6]/div/div[1]/div/div/label[1]/span")
    private WebElement SpecialReqNO;

    @FindBy(xpath = "//input[@class='btn btn-lg  btn-primary exp-btn-margin']")
    private WebElement OkButton;

    public WebElement getOkButton() {
        return OkButton;
    }

    public void setOkButton(WebElement okButton) {
        OkButton = okButton;
    }

    @FindBy(xpath = "//*[@id='icd_helper1']/option[1]")
    private WebElement icdoption;

    @FindBy(id = "btnAdd_icd")
    private WebElement icdarrow;

    public WebElement getIcdoption() {
        return icdoption;
    }

    public void setIcdoption(WebElement icdoption) {
        this.icdoption = icdoption;
    }

    public WebElement getIcdarrow() {
        return icdarrow;
    }

    public void setIcdarrow(WebElement icdarrow) {
        this.icdarrow = icdarrow;
    }
}

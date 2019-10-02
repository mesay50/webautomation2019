package hamepage;


import base.CommonAPI;
import org.testng.Assert;

public class Search extends CommonAPI {

    public void searchFiledIsTypeAble() {
        //boolean obj=isElementDisplayed("//input[@id='twotabsearchtextbox']");
        //Assert.assertEquals(obj, true);

        Assert.assertEquals(isElementDisplayed("//input[@id='twotabsearchtextbox']"), true);
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "Java Books");
    }

    public void validateSearchButton() {
        clickOnElementByXpath("//div[@id='nav-search']/form[@role='search']//input[@value='Go']");
    }

    public void clickOnSigneInButton() {
        clickOnElementByXpath("//span[contains(text(),'Hello, Sign in')]");
    }

    public void clickOnEmailAccount() {
        clickOnElementByXpath("//input[@id='ap_email']");
    }

    public void typeAbleOnEmailAccount() {
        typeOnElementByXpath("//input[@id='ap_email']", "mesayy2017@yahoo.com");
    }
    public void clickOnContinueButton(){
        clickOnElementByXpath("//input[@id='continue']");
    }

}

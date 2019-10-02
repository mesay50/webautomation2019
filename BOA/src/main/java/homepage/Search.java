package homepage;

import base.CommonAPI;
import org.testng.Assert;

public class Search extends CommonAPI {

    public void searchCreditCards(){
        //boolean obj=isElementDisplayed("//input[@id='twotabsearchtextbox']");
        //Assert.assertEquals(obj, true);

        Assert.assertEquals(isElementDisplayed(""), true);
        clickOnElementByXpath("");
        typeOnElementByXpath("","Finance");
    }
}

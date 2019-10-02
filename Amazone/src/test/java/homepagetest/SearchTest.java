package homepagetest;

import hamepage.Search;
import org.testng.annotations.Test;

public class SearchTest extends Search {
    @Test(enabled = false)// means these test is not executed
    public void typeAblityTestForSearcgField(){
        searchFiledIsTypeAble();
    }
    @Test(enabled = false)
    public void validateSearchButtonworks(){
        searchFiledIsTypeAble();
        sleepFor(5);
        validateSearchButton();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void signeInButtonWorks(){
        clickOnSigneInButton();
        sleepFor(5);
    }
    @Test(enabled = false)
    public void clickOnEmailAccountWorks(){
        clickOnEmailAccount();
        sleepFor(2);
    }
    @Test
    public void typeOnEmailAccountWorks(){
        clickOnSigneInButton();
        sleepFor(3);
        clickOnEmailAccount();
        sleepFor(3);
        typeAbleOnEmailAccount();
        sleepFor(3);
        clickOnContinueButton();
    }

}

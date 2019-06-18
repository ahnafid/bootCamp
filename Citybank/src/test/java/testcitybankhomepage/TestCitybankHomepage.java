package testcitybankhomepage;

import base.CommonAPI;
import citybankhomepage.CItybankHomapge;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCitybankHomepage extends CommonAPI {
    String url = "https://www.citibank.com/";
    CItybankHomapge testcitybankhomepage;

    @BeforeMethod
    public void intilization(){
       testcitybankhomepage = PageFactory.initElements(driver,CItybankHomapge.class);
       driver.get(url);

    }
    @Test(priority = 1)
    public  void clickonsigon(){
       testcitybankhomepage.setSignon();
    }
    @Test(priority = 2)
    public void clickonAccount(){
        testcitybankhomepage.setAccount();
    }

}

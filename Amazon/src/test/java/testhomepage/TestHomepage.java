package testhomepage;

import base.CommonAPI;
import homepage.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomepage extends CommonAPI {

    String url ="https://www.amazon.com/";

    Homepage testhomepage;

    @BeforeMethod
    public void intilization(){
        testhomepage = PageFactory.initElements(driver,Homepage.class);
        driver.get(url);
    }
    @Test
    public void clickonSearch(){
        testhomepage.setSearch();
    }



    }







package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {

    public void setSearch(){
        typeByXpath("//*[@id='twotabsearchtextbox']","Asus laptop");
        clickByXpath("//*[@type='submit']");

    }

    }

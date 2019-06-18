package citybankhomepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CItybankHomapge extends CommonAPI {



    public void setSignon(){
        clickByXpath("//*[@id=\"usernameMasked\"]");
        typeByXpath("//*[@id=\"usernameMasked\"]","amin");
        clickByXpath("//*[@id=\"password\"]");
        typeByXpath("//*[@id=\"password\"]","1234");
        clickByXpath("//*[@id=\"signInBtn\"]");

    }
      public void setAccount(){
          clickByXpath("//*[@id=\"navUtility\"]/div/div/ul/li[2]/a");
          clickByXpath("//*[@id='state-dropdown-id']");

      }


}

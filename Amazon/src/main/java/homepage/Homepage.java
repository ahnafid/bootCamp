package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {

    public void setSearch(){
        typeByXpath("//*[@id='twotabsearchtextbox']","Asus laptop");
        clickByXpath("//*[@type='submit']");
        clickByXpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span");
        clickByXpath("//*[@id='add-to-cart-button']");
        clickByXpath("//*[@id='hlb-ptc-btn-native']");

    }

    public void setAccount(){
        clickByXpath("//*[@id=\"nav-link-accountList\"]/span[2]");
        clickByXpath("//*[@id='ap_email']");
        typeByXpath("//*[@id='ap_email']","arahman@yahoo.com");
        clickByXpath("//*[@id='ap_password']");
        typeByXpath("//*[@id='ap_password']","123456");
        clickByXpath("//*[@id='signInSubmit']");
    }
    public void setHamburger(){
        clickByXpath("//i[@class='hm-icon nav-sprite']");
        clickByXpath("//a[@data-menu-id='13']");
        clickByXpath("//*[@id=\"hmenu-content\"]/ul[12]/li[6]/a/div");
        clickByXpath("//a[text()='Unlocked Phones']");

    }

    }

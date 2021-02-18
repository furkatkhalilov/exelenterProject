package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

<<<<<<< HEAD
public class UserMenuPage extends BasePage {
    WebElement webElement;

    public UserMenuPage() {PageFactory.initElements(driver,this); }
=======
public class UserMenuPage extends BasePage implements Page {
    private HashMap<String, WebElement> map = new HashMap<>();
    public UserMenuPage() {
        PageFactory.initElements(driver,this);
    }
>>>>>>> master

    @FindBy(css = "ul.sidebar-menu > li")
    public List<WebElement> menuBar;

    @Override
    public void initMap() {
    // no need to put any values to the map, since we are working with only one list of web-element.
    }



    // ===========================All methods to be listed here ======================
    //this method can be used only to handle for list of web-elements click function;
    @Override
    public void findElementAndClickFunction(String element) {
<<<<<<< HEAD
        switch (element) {
            case "Dashboard":
                webElement = menuBar.get(0);
                break;
            case "HPU_Dashboard":
                webElement = menuBar.get(1);
                break;
            case "ManageProfiles":
                webElement = menuBar.get(2);
                break;
            case "FavoritePromotions":
                webElement = menuBar.get(3);
                break;
            case "ManageCompany":
                webElement = menuBar.get(4);
                break;
            case "ManageBrand":
                webElement = menuBar.get(5);
                break;
            case "ManageStore":
                webElement = menuBar.get(6);
                break;
            case "ManageAdds":
                webElement = menuBar.get(7);
                break;
            case "LegalAgreement":
                webElement = menuBar.get(8);
                break;
            case "ManageOrders":
                webElement = menuBar.get(9);
                break;
            case "Payments":
                webElement = menuBar.get(10);
                break;
            case "ManageEmployee":
                webElement = menuBar.get(11);
                break;
            case "Message":
                webElement = menuBar.get(12);
                break;
=======
        //Getting the webElement for the menuBar List by String element parameter
        WebElement webElement = menuBar.stream().filter(a -> a.getText().contains(element)).findFirst().orElse(null);
        if(webElement==null){
            throw new RuntimeException("Element not found " + element);
>>>>>>> master
        }
        clickFunction(webElement);
    }

    @Override
    public void findElementAndSendKeysFunction(String element, String text)
    {
        sendKeysFunction(getWebElement(map,element), text);
    }

<<<<<<< HEAD
    public void findElementAndSendKeysFunction(String element, String text) {

    }

=======
    @Override
    public void selectFromDropDownByRandomIndex(String element)
    {
        selectDropDown(getWebElement(map,element));

    }

    @Override
    public void selectFromDropDownByName(String nameToSelect, String element)
    {
        selectDropDown(nameToSelect, getWebElement(map,element));
    }
>>>>>>> master

}

package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import utils.BaseClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CommonSteps extends BaseClass {

    @When("User sends the keys in {string}")
    public void user_sends_the_keys(String page, DataTable dataTable) {
        List<List<String>> AllElementsNameAndValue= dataTable.asLists(String.class);


        for(int i =0 ; i <AllElementsNameAndValue.size() ; i++){

            System.out.println(AllElementsNameAndValue.get(i).get(0));
            System.out.println(AllElementsNameAndValue.get(i).get(1));

            getPage(page).findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));

        }

    }


    @And("User clicks on {string}")
    public void userClicksOn(String page, DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);

        for (int i = 0; i < allElements.size(); i++) {
<<<<<<< HEAD
            switch (page) {
                case "loginPage":
                    loginPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "UserMenu":
                    userMenuPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "ManageCompanyPage":
                    manageCompanyPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "ManageBrandPage":
                    manageBrandPage.findElementAndClickFunction(allElements.get(i));
                    break;


            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
=======
            getPage(page).findElementAndClickFunction(allElements.get(i));
>>>>>>> master
        }
    }


    @And("User selects {string} in the drop-down in {string}")
    public void selectInTheDropDownIn(String valueToBeSelected, String page, DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);

        for (int i = 0; i < allElements.size(); i++) {
            getPage(page).selectFromDropDownByName(valueToBeSelected, allElements.get(i));
        }
    }


    @And("User randomly selects option in the drop-down in {string}")
    public void userRandomlySelectsOptionInTheDropDownIn(String page, DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);

        for (int i = 0; i < allElements.size(); i++) {
            getPage(page).selectFromDropDownByRandomIndex(allElements.get(i));
        }
    }
}

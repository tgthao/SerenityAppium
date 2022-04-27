package screens;

import base.ScreeBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SearchScreen extends ScreeBase {
    @AndroidFindBy(id="flipboard.app:id/search_box_place_holder")
    public WebElement searchBox;

    @AndroidFindBy(id="flipboard.app:id/search_view_input")
    public WebElement searchInput;


    @AndroidFindBy(id="flipboard.app:id/search_result_general_title_text")
    public WebElement searchTitleText;


    public void searchFlipBoard(String searchText) {

        waitFor(searchBox).click();
        waitFor(searchInput).sendKeys(searchText+"\n");
        enter();

    }



    public boolean verifySearchText(String text) {

        return waitFor(searchTitleText).getText().contains(text);

    }
}

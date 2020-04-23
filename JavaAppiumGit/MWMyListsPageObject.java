package lib.ui.mobile_web;

import lib.ui.MyListsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWMyListsPageObject extends MyListsPageObject {
    static {
        ARTICLE_BY_TITLE_TPL = "xpath://ul[contains(@class,'watchlist')]//h3[contains(text(),'{TITLE}')]";
        REMOVE_FROM_SAVED_BUTTON = "xpath://ul[contains(@class,'watchlist')]//h3[contains(text(),'{TITLE}')]/../../div[contains(@class,'watched')]";
        SECOND_ARTICLE_BY_TITLE_TPL = "xpath://ul[contains(@class,'watchlist')]//h3[contains(text(),'{SECOND_TITLE}']";
        CLOSE_BUTTON_IN_WINDOW_ON_SAVED_ARTICLES = "xpath://XCUIElementTypeButton[@name='Close']";
    }
    public MWMyListsPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}

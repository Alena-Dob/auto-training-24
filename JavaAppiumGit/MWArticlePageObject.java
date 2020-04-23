package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWArticlePageObject extends ArticlePageObject {

    static {
        TITLE = "css:#content h1";
        FOOTER_ELEMENT = "css:footer";
        OPTIONS_ADD_TO_MY_LIST_BUTTON = "css:#page-actions li#page-actions-watch a#ca-watch.mw-ui-icon-wikimedia-star-base20 button";
        OPTIONS_REMOVE_FROM_MY_LIST_BUTTON = "css:#page-actions li#page-actions-watch a#ca-watch.mw-ui-icon-wikimedia-unStar-progressive watched button";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://div[contains(@class,'wikidata-description')][contains(text(),'{SUBSTRING}')]";
        SAVED_TO_BY_LIST_BUTTON = "id:Saved. Activate to unsave.";
    }

    public MWArticlePageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}

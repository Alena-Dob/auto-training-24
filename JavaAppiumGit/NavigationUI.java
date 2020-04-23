package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import org.openqa.selenium.remote.RemoteWebDriver;

abstract public class NavigationUI extends MainPageObject{

    protected static String
    MY_LISTS_LINK,
    OPEN_NAVIGATION,
    EXPLORE_LINK;

    public NavigationUI(RemoteWebDriver driver)
    {
        super(driver);
    }

    public void openNavigation()
    {
        if (Platform.getInstance().isMw()) {
            this.waitForElementAndClick(OPEN_NAVIGATION, "Cannot find and click open navigation button.", 5);
        } else {
            System.out.println("Method openNavigation() do nothing for platform " + Platform.getInstance().getPlatformVar());
        }
    }

    public void clickMyLists()
    {
        if (Platform.getInstance().isMw()) {
            this.tryClickElementWithFewAttempts(
                    MY_LISTS_LINK,
                    "Cannot click to My Lists",
                    5
            );
        } else {
            this.waitForElementAndClick(
                    MY_LISTS_LINK,
                    "Cannot find navigation button to my list",
                    5
            );
        }

        this.waitForElementPresent(
                MY_LISTS_LINK,
                "Cannot find navigation button to My Lists",
                5
        );

        this.waitForElementAndClick(
                MY_LISTS_LINK,
                "Cannot click to My Lists",
                5
        );
    }
    public void clickExplore()
    {
        this.waitForElementPresent(
                EXPLORE_LINK,
                "Cannot find navigation button to Explore",
                5
        );

        this.waitForElementAndClick(
                EXPLORE_LINK,
                "Cannot click to Explore",
                5
        );
    }
}

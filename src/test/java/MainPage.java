import MainPackage.MKKBase;
import MainPageObject.MainPageElements;
import MainPageObject.TryAccidentEntryPageObjects;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static Action.Commands.click;
import static Action.Commands.waitElementToBeClickable;

public class MainPage extends MKKBase {

    @Test
    public void tryAccidentEntry() {

        MainPageElements firtPage = PageFactory.initElements(MKKBase.driver, MainPageElements.class);

        waitElementToBeClickable(firtPage.tryAccidentAddNo);
        click(firtPage.tryAccidentAddNo);

        TryAccidentEntryPageObjects tryAccidentPage = PageFactory.initElements(MKKBase.driver, TryAccidentEntryPageObjects.class);

        waitElementToBeClickable(tryAccidentPage.goButton);
        click(tryAccidentPage.goButton);
    }

}

import Action.Commands;
import MainPackage.MKKBase;
import MainPageObject.MainPageElements;
import MainPageObject.TryAccidentEntryPageObjects;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static Action.Commands.*;
import static Action.Commands.click;
import static Action.Commands.waitElementToBeClickable;

public class MainPage extends MKKBase {

    @Test
    public void tryAccidentAddPopUp() {
        MainPageElements firstPage = PageFactory.initElements(MKKBase.driver, MainPageElements.class);

        waitElementToBeClickable(firstPage.tryAccidentAddNo);
        assertEquals("Deneme kaza girerek kaza adımlarını görebilirsiniz.", getText(firstPage.tryAccidentPopUpText));
        click(firstPage.tryAccidentAddNo);

        TryAccidentEntryPageObjects tryAccidentEntry = PageFactory.initElements(MKKBase.driver, TryAccidentEntryPageObjects.class);

        waitElementToBeClickable(tryAccidentEntry.screenHeader);
        assertEquals("Deneme Kaza Girişi", getText(tryAccidentEntry.screenHeader));
    }

    /*
    @Test
    public void tryAccidentEntry() throws InterruptedException {

        MainPageElements firstPage = PageFactory.initElements(MKKBase.driver, MainPageElements.class);

        waitElementToBeClickable(firstPage.tryAccidentAddNo);
        click(firstPage.tryAccidentAddNo);

        TryAccidentEntryPageObjects tryAccidentPage = PageFactory.initElements(MKKBase.driver, TryAccidentEntryPageObjects.class);

        waitElementToBeClickable(tryAccidentPage.goButton);
        click(tryAccidentPage.goButton);

        waitElementToBeClickable(tryAccidentPage.firstQuestionYesButton);
        click(tryAccidentPage.secondQuestionYesButton);
        Thread.sleep(2000);

        MobileElement firstQuestionYesButton = driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[2]"));
        MobileElement thirdQuestionYesButton = driver.findElement(MobileBy.xpath("(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[6]"));
        scroll(thirdQuestionYesButton, firstQuestionYesButton);

    }
    */
}

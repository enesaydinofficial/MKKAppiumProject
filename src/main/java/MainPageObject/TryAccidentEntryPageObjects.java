package MainPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryAccidentEntryPageObjects {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.TextView")
    public WebElement screenHeader;

    @FindBy(xpath = "(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[2]")
    public WebElement goButton;

    @FindBy(xpath = "(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[2]")
    public WebElement firstQuestionYesButton;

    @FindBy(xpath = "(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[4]")
    public WebElement secondQuestionYesButton;


}

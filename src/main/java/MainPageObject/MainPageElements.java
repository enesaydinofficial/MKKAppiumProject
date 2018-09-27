package MainPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageElements {


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")
    public WebElement tryAccidentPopUpText;

    @FindBy(xpath = "(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[2]")
    public WebElement tryAccidentAddNo;

}

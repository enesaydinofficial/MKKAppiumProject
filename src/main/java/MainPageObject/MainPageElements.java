package MainPageObject;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageElements {

    @FindBy(xpath = "(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[2]")
    public WebElement tryAccidentAddNo;

}

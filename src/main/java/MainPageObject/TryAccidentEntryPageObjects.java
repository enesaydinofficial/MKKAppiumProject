package MainPageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TryAccidentEntryPageObjects {

    @FindBy(xpath = "(//android.widget.Button[@content-desc='Mobil Kaza Tutanağı'])[2]")
    public WebElement goButton;
}

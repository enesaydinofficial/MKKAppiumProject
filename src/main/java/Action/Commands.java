package Action;

import MainPackage.MKKBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commands extends MKKBase {

    public static void click(WebElement element) {
        element.click();

    }

    public static String getText(WebElement element) {
        return element.getText();

    }

    public static void sendKeys(MobileElement element, String Text) {
        element.sendKeys(Text);
    }

    public static void isDisplayed(MobileElement element) {

        element.isDisplayed();
    }

    public static void waitElementToBeClickable(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public static void waitElementNotVisible(MobileElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void scroll(MobileElement pressElement, MobileElement moveElement) {
        TouchAction scroll = new TouchAction(driver);
        scroll.press(pressElement).moveTo(moveElement).release().perform();
    }

    public static void assertEquals(String expected, String actual) {
        Assert.assertEquals(expected, actual);

    }

}

package MainPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static io.appium.java_client.remote.MobileCapabilityType.*;

public class MKKBase {

    protected static AppiumDriver<MobileElement> driver;

    @Before
    public void init() throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(DEVICE_NAME, "TestDevice");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability(PLATFORM_NAME, "Android");
        cap.setCapability(PLATFORM_VERSION, "8.1.0");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("noReset", "true");
        cap.setCapability("appPackage", "org.sbm.ktt");
        cap.setCapability("appActivity", "org.sbm.ktt.MainActivity");
        cap.setCapability(NEW_COMMAND_TIMEOUT, 1000);

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.closeApp();
        }
    }

    @Test
    public void asdas() {

    }


}

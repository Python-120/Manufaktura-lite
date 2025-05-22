package io.test.manufakturalitejavatest.base;

import com.codeborne.selenide.Configuration;
import io.github.cdimascio.dotenv.Dotenv;
import io.test.manufakturalitejava.utils.Browsers;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    public static Dotenv env = Dotenv.load();

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = env.get("BASE_URL");

        String browserName = env.get("BROWSER", "CHROME").toUpperCase();
        Browsers selectedBrowser;
        try {
            selectedBrowser = Browsers.valueOf(browserName);
        } catch (IllegalArgumentException e) {
            System.err.println("Невідомий браузер: " + browserName + ". Використовується CHROME за замовчуванням.");
            selectedBrowser = Browsers.CHROME;
        }

        Configuration.browser = selectedBrowser.getBrowserName();

        boolean headless = Boolean.parseBoolean(env.get("HEADLESS", "true"));
        Configuration.headless = headless;

        DesiredCapabilities capabilities = selectedBrowser.getBrowserCapabilities(headless);
        Configuration.browserCapabilities = capabilities;


        /** Встановлюємо розмір вікна, якщо браузер не true
         */
        if (!headless) {
            Configuration.browserSize = selectedBrowser.getBrowserWidth() + "x" + selectedBrowser.getBrowserHeight();
        }

        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 20000;
        Configuration.fastSetValue = true;
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
    }
}
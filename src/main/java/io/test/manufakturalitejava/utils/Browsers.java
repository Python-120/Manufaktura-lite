package io.test.manufakturalitejava.utils;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum Browsers {

    CHROME {
        @Override
        public String getBrowserName() {
            return "chrome";
        }

        @Override
        public DesiredCapabilities getBrowserCapabilities(boolean headless) {
            ChromeOptions options = new ChromeOptions();
            if (headless) {
                options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");
            } else {
                options.addArguments("--start-maximized");
            }
            return new DesiredCapabilities(options);
        }

        @Override
        public int getBrowserWidth() {
            return 1920;
        }

        @Override
        public int getBrowserHeight() {
            return 1080;
        }
    },

    FIREFOX {
        @Override
        public String getBrowserName() {
            return "firefox";
        }

        @Override
        public DesiredCapabilities getBrowserCapabilities(boolean headless) {
            FirefoxOptions options = new FirefoxOptions();
            if (headless) {
                options.addArguments("-headless");
            } else {
                options.addArguments("-private");
            }
            return new DesiredCapabilities(options);
        }

        @Override
        public int getBrowserWidth() {
            return 1440;
        }

        @Override
        public int getBrowserHeight() {
            return 900;
        }
    };

    public abstract String getBrowserName();

    public abstract DesiredCapabilities getBrowserCapabilities(boolean headless);
    public abstract int getBrowserWidth();
    public abstract int getBrowserHeight();
}
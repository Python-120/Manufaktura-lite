package io.test.manufakturalitejava.utils;

public enum Browsers {

        CHROME {
            @Override
            public String getBrowserName() {
                return "chrome";
            }

            @Override
            public String getOptions() {
                return "--start-maximized";
            }
        },

        FIREFOX {
            @Override
            public String getBrowserName() {
                return "firefox";
            }

            @Override
            public String getOptions() {
                return "--private";
            }
        },

        WEBKIT {
            @Override
            public String getBrowserName() {
                return "webkit";
            }

            @Override
            public String getOptions() {
                return "--enable-webkit";
            }
        };

        public abstract String getBrowserName();
        public abstract String getOptions();
}
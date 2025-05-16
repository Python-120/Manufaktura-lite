package io.test.manufakturalitejavatest.base;

import com.codeborne.selenide.Configuration;
import io.github.cdimascio.dotenv.Dotenv;
import io.test.manufakturalitejava.utils.Browsers;


public class BaseTest {
    public static Dotenv env = Dotenv.load();

    static {
        Configuration.baseUrl = env.get("BASE_URL");
    }
}

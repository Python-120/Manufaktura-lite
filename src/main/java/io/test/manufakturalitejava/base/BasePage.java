package io.test.manufakturalitejava.base;

import static com.codeborne.selenide.Selenide.*;

public abstract class BasePage {

    public abstract void checkIfPageOpened();

    public void openPage(String url) {
        open(url);
    }

    public String getPageTitle() {
        return title();
    }
}

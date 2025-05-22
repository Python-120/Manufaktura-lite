package io.test.manufakturalitejava.base;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public abstract class BasePage {

    public abstract void checkIfPageOpened();

    public void openPage(String url) {
        open(url);
    }

    public String getPageTitle() {
        return title();
    }
}

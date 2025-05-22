package io.test.manufakturalitejava.pages.preLoginPage;

import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.pages.SingInPage;

import static com.codeborne.selenide.Selenide.*;

public class HeaderMenu {
    private SelenideElement loginButton = $x("//div[@id='headerMenu']//div[@id='other_menu']//li[@id='menu-item-12632']");

    public void clickLoginButton() {
        loginButton.click();
    }
}

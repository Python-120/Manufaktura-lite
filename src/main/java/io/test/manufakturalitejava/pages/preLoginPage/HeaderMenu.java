package io.test.manufakturalitejava.pages.preLoginPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HeaderMenu {
    private SelenideElement loginButton = $x("//div[@id='headerMenu']//div[@id='other_menu']//li[@id='menu-item-12632']");

    public void clickLoginButton() {
        loginButton.click();
    }
}

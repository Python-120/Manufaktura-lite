package io.test.manufakturalitejava.pages.preLoginPage;

import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.base.BasePage;
import io.test.manufakturalitejava.pages.SingInPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class StartPage extends BasePage {

    private HeaderMenu headerMenu = new HeaderMenu();
    private final SelenideElement aboutPage = $x("//div[@id='content']//h1[text()]");

    @Override
    public void checkIfPageOpened() {
        aboutPage.shouldBe(visible);
    }


    public SingInPage clickLoginButton() {
        headerMenu.clickLoginButton();
        return new SingInPage();
    }

}

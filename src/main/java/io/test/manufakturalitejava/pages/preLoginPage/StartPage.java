package io.test.manufakturalitejava.pages.preLoginPage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.cdimascio.dotenv.Dotenv;
import io.test.manufakturalitejava.base.BasePage;
import io.test.manufakturalitejava.pages.SingInPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

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

package io.test.manufakturalitejava.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.pages.homepage.ProjectsPage;

import static com.codeborne.selenide.Selenide.*;

public class SingInPage {
    private final SelenideElement userEmail = $("#content-desktop #user_email");
    private final SelenideElement userPassword = $("#content-desktop #user_password");
    private final SelenideElement rememberMe = $("#content-desktop #user_remember_me");
    private final SelenideElement loginButton = $("#content-desktop [name=commit]");

    public void open() {
        Selenide.open("/");
    }

    public ProjectsPage login(String username, String password) {
        userEmail
                .setValue(username);
        userPassword
                .setValue(password);
            rememberMe
                    .click();
        loginButton
                .click();

        return new ProjectsPage();
    }

    public ProjectsPage login(String username, String password, Boolean rememberMeMark) {
        userEmail
                .setValue(username);
        userPassword
                .setValue(password);
        if (rememberMeMark == true) {
            rememberMe
                    .click();
        }
        loginButton
                .click();

        return new ProjectsPage();
    }



}

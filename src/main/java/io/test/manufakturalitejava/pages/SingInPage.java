package io.test.manufakturalitejava.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;

public class SingInPage {

    public void open() {
        Selenide.open("/users/sign_in");
    }

    public void login(String username, String password) {
        $("#content-desktop #user_email").setValue(username);
        $("#content-desktop #user_password").setValue(password);
        $("#content-desktop #user_remember_me").click();
        $("#content-desktop [name=commit]").click();
    }

}

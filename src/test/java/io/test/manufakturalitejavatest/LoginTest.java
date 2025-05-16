package io.test.manufakturalitejavatest;

import io.test.manufakturalitejava.pages.SingInPage;
import io.test.manufakturalitejavatest.base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {

    private SingInPage singInPage = new SingInPage();

    @BeforeEach
    public void setUp() {

        singInPage.open();
        //openUrl();
        singInPage.login(env.get("USER_EMAIL"), env.get("PASSWORD"));
    }

    @AfterEach
    public void close() {
        closeWebDriver();
    }

    @DisplayName("Authorization Test")
    @Test
    public void authorizationTest() {
        //loginInSystem(env.get("USER_EMAIL"), env.get("PASSWORD"));

        checkResult();
    }

    @DisplayName("searchProject")
    @Test
    public void search() {
//        loginInSystem(env.get("USER_EMAIL"), env.get("PASSWORD"));
        searchProject("Home");

        checkSearchElement("Home", "Home");
    }

    @DisplayName("Project Page Test")
    @Test
    public void openProjectPage() {
       // loginInSystem(env.get("USER_EMAIL"), env.get("PASSWORD"));
        searchProject("Home");
        clickToProject();

        checkTitle();
    }

    @DisplayName("Select option on drop-down")
    @Test
    public void selectOptionOnDropDown() {
      //  loginInSystem(env.get("USER_EMAIL"), env.get("PASSWORD"));
        selectOption("Free Projects");

        checkNoProject();
    }

    private static void checkNoProject() {
        $x("//p[contains(@class, 'mb-6')]")
                .shouldBe(visible);
    }

    private void selectOption(String option) {
        $("#content-desktop #company_id").selectOption(option);
    }

    private static void checkTitle() {
        $(By.xpath("//div[@class='sticky-header']//h2"))
                .shouldHave(text("Home"));
    }

    private static void clickToProject() {
        $(byText("Home")).click();
    }

    private static void checkSearchElement(String element, String text) {
        $(byText(element))
                .shouldHave(text(text));
    }

    private void searchProject(String projectName) {
        $(By.xpath("//input[@id='search']"))
                .setValue(projectName);
    }

    private static void checkResult() {
        $x("//div[@id='container']//div[@class='common-flash-success-right']//p")
                .shouldBe(visible);

    }

    private void openUrl() {
        open(env.get("BASE_URL"));
    }

    public void loginInSystem(String email, String password) {
        $("#content-desktop #user_email")
                .setValue(email);
        $("#content-desktop #user_password")
                .setValue(password);
        //$("#content-desktop #user_remember_me").click();
        $x("//div[@id='content-desktop']//input[@value='Sign In']")
                .click();
    }
}

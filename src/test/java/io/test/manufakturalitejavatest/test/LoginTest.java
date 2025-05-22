package io.test.manufakturalitejavatest.test;

import io.test.manufakturalitejava.pages.SingInPage;
import io.test.manufakturalitejava.pages.homepage.ProjectsPage;
import io.test.manufakturalitejava.pages.preLoginPage.StartPage;
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

    private final SingInPage singInPage = new SingInPage();
    private final ProjectsPage projectsPage = new ProjectsPage();

    @BeforeEach
    public void setUp() {
        singInPage.open();
        singInPage.login(env.get("USER_EMAIL"), env.get("PASSWORD"));
    }

    @AfterEach
    public void close() {
        closeWebDriver();
    }

    @DisplayName("Check authorization")
    @Test
    public void authorizationTest() {
        checkResult();
    }

    @DisplayName("Search project") //
    @Test
    public void search() {
        projectsPage
                .searchProject("Home");

        checkSearchElement("Home", "Home");
    }

    @DisplayName("Open project page")
    @Test
    public void openProjectPage() {
        projectsPage
                .searchProject("Home");
        clickToProject();

        checkTitle();
    }

    @DisplayName("Select Option")
    @Test
    public void selectOptionOnDropDown() {
        projectsPage
                .selectCompanyByVisibleText("Free Projects");


        checkNoProject();
    }

    private static void checkNoProject() {
        $(byText("You have not created any projects yet"))
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
                .shouldBe(visible)
                .shouldHave(text(text));
    }



    private static void checkResult() {
        $x("//div[@id='container']//div[@class='common-flash-success-right']//p")
                .shouldBe(visible);
    }
}
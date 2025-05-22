package io.test.manufakturalitejavatest.test;

import io.test.manufakturalitejava.pages.SingInPage;
import io.test.manufakturalitejava.pages.homepage.ProjectsPage;
import io.test.manufakturalitejavatest.base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class ProjectPageTest extends BaseTest {

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
        projectsPage
                .checkResult();
    }

    @DisplayName("Search project") //
    @Test
    public void search() {
        projectsPage
                .searchProject("Home");

        projectsPage
                .checkSearchElement("Home", "Home");
    }

    @DisplayName("Open project page")
    @Test
    public void openProjectPage() {
        projectsPage
                .searchProject("Home")
                .clickOnProjectCard("Home");

        projectsPage
                .checkTitle();
    }

    @DisplayName("Select Option")
    @Test
    public void selectOptionOnDropDown() {
        projectsPage
                .selectProjectByVisibleText("Free Projects");


        projectsPage
                .checkNoProject();
    }
    @Test
    void tests() {
        projectsPage
                .searchProject("Home")
                .clickOnProjectCard("Home");

    }


}
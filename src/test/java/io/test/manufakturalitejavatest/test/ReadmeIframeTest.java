package io.test.manufakturalitejavatest.test;


import com.codeborne.selenide.junit5.TextReportExtension;
import io.test.manufakturalitejava.pages.projectpage.ProjectPage;
import io.test.manufakturalitejava.pages.projectspage.ProjectsPage;
import io.test.manufakturalitejava.pages.redmi.ReadmiPage;
import io.test.manufakturalitejava.pages.singIn.SingInPage;
import io.test.manufakturalitejavatest.base.BaseTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TextReportExtension.class)
public class ReadmeIframeTest extends BaseTest {
    private final SingInPage singInPage = new SingInPage();
    private final ProjectsPage projectsPage = new ProjectsPage();
    private final ProjectPage projectPage = new ProjectPage();
    private final ReadmiPage readmiPage = new ReadmiPage();

    @BeforeEach
    public void setUp() {
        singInPage
                .open()
                .login(username, password);

    }

    @AfterEach
    public void close() {
        closeWebDriver();
    }

    @Test
    @DisplayName("Readme test")
    void readmeTest() {
    }

    @Test
    @DisplayName("Update readme text in iframe")
    void updateReadmeTextInIframe() {

        String text = "Sey hello";

        projectsPage
                .searchProject("Home")
                .clickOnProjectCard("Home")
                .clickToReadme()
                .clickToEditButton();

        readmiPage
                .isLoaded()
                .clickEditRedmi()
                .clickOnTheFirstLineInTextInEditor()
                .editLineInEditor(text)
                .clickOnUpdateButton();

        readmiPage
                .clickToReadme();


        assertEquals("Welcome to Testomat.io" + text , projectPage.getText(), "Text in Readme is not updated");

    }
} 
package io.test.manufakturalitejavatest.test;


import com.codeborne.selenide.junit5.TextReportExtension;
import io.test.manufakturalitejava.pages.projectpage.ProjectPage;
import io.test.manufakturalitejava.pages.projectspage.ProjectsPage;
import io.test.manufakturalitejava.pages.redmi.ReadmiPage;
import io.test.manufakturalitejava.pages.singIn.SingInPage;
import io.test.manufakturalitejavatest.base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.closeWebDriver;

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

        projectsPage
                .searchProject("Home")
                .clickOnProjectCard("Home")
                .clickToReadme()
                .clickToEditButton();

        readmiPage
                .isLoaded()
                .clickEditRedmi()
                .clickOnTheFirstLineInTextInEditor();
//                .clickOnUpdateButton();
        
    }
} 
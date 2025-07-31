package io.test.manufakturalitejavatest.test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.pages.projectspage.ProjectsPage;
import io.test.manufakturalitejava.pages.singIn.SingInPage;
import io.test.manufakturalitejavatest.base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static com.codeborne.selenide.Selenide.*;

public class CollectionOfElementsTests extends BaseTest {
    private final SingInPage singInPage = new SingInPage();
    private final ProjectsPage projectsPage = new ProjectsPage();
    private final ElementsCollection allProjects = $$("ul li");

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
    @DisplayName("find all projects where not tests")
    void testName() {
        ArrayList<SelenideElement> projects = new ArrayList<>();

    }
}

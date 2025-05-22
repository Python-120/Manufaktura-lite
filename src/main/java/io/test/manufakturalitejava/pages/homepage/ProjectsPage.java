package io.test.manufakturalitejava.pages.homepage;

import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.base.BasePage;
import io.test.manufakturalitejava.pages.CreateProjectPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.test.manufakturalitejava.utils.StringParsers.parseIntegerFromString;

public class ProjectsPage extends BasePage {
    public final HeaderMenu headerMenu = new HeaderMenu();

    private SelenideElement prodjectsDropdown = $("#company_id");
    private SelenideElement searchInput = $x(("//input[@id='search']"));
    private SelenideElement createButtonNearSearch = $(byText("Create"));

    @Override
    public void checkIfPageOpened() {

    }

    public ProjectsPage selectProjectByVisibleText(String optionText) {
        prodjectsDropdown
                .shouldBe(visible)
                .selectOption(optionText);
        return this;
    }

    public ProjectsPage searchProject(String projectName) {
       searchInput
               .shouldBe(visible)
               .setValue(projectName);
       return this;
    }

    public void clickOnProjectCard(String projectName) {
        $(byText(projectName))
                .click();
    }

    public CreateProjectPage clickCreateButtonNearSearch() {
        createButtonNearSearch
                .shouldBe(enabled)
                .click();
        return page(CreateProjectPage.class);
    }

    public Integer getNumberOfProjectUsers(SelenideElement targetProject) {
        String countOfUsers = targetProject.$(" img + div").getText();
        return parseIntegerFromString(countOfUsers);
    }

    public Integer getCountOfTestCases(SelenideElement targetProject) {
        String countOfTests = targetProject.$(" p").getText();
        return parseIntegerFromString(countOfTests);
    }

    public void checkNoProject() {
        $(byText("You have not created any projects yet"))
                .shouldBe(visible);
    }

    public void checkTitle() {
        $x(("//div[@class='sticky-header']//h2"))
                .shouldHave(text("Home"));
    }

    public void clickToProject() {
        $(byText("Home"))
                .click();
    }

    public void checkSearchElement(String element, String text) {
        $(byText(element))
                .shouldBe(visible)
                .shouldHave(text(text));
    }

    public void checkResult() {
        $x("//div[@id='container']//div[@class='common-flash-success-right']//p")
                .shouldBe(visible);
    }

}

package io.test.manufakturalitejava.pages.homepage;

import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.base.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ProjectsPage extends BasePage {
    public final HeaderMenu headerMenu = new HeaderMenu();

    private SelenideElement prodjectsDropdown = $("#company_id");
    private SelenideElement searchInput = $(By.xpath("//input[@id='search']"));


    @Override
    public void checkIfPageOpened() {

    }

    public ProjectsPage selectCompanyByVisibleText(String optionText) {
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


}

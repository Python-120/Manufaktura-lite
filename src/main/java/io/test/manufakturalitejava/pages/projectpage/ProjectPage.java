package io.test.manufakturalitejava.pages.projectpage;


import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.pages.redmi.ReadmiPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectPage {
    private SelenideElement readme = $x("//div[@id='ember3']//a[@id='ember40']");
    private SelenideElement editButton = $(byLinkText("Edit"));
    private SelenideElement checkText = $("#welcometotestomatio");

    public ProjectPage clickToReadme() {
        readme.shouldBe(visible).click();
        return this;
    }

    public ReadmiPage clickToEditButton() {
        editButton.shouldBe(visible).click();
        return new ReadmiPage();
    }

    public String getText() {
        return checkText.getText();
    }

}
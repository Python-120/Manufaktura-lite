package io.test.manufakturalitejava.pages.redmi;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.test.manufakturalitejava.pages.projectpage.ProjectPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ReadmiPage {
    private SelenideElement readme = $x("//div[@id='ember3']//a[@id='ember40']");
    private SelenideElement readmiButton = $(byText("Edit Readme"));
    private SelenideElement iframe = $("#modal-overlays iframe[src*='/ember-monaco/frame.html']");
    private SelenideElement updateButton = $(byText("Update"));
    private SelenideElement cancelButton = $(byText("Cancel"));
    private SelenideElement text = $(".view-lines div");

    public ReadmiPage isLoaded() {
        readmiButton.shouldHave(visible);
        return this;
    }

    public ProjectPage clickToReadme() {
        readme.shouldBe(visible).click();
        return new ProjectPage();
    }

    public ReadmiPage clickEditRedmi() {
        readmiButton.click();
        Selenide.switchTo().frame(iframe);
        return this;
    }

    public ReadmiPage clickOnTheFirstLineInTextInEditor() {
        text.click();
        return this;
    }

    public ReadmiPage editLineInEditor(String setText) {
        this.text.click();
        $("textarea").sendKeys(setText);
        return this;
    }

    public ReadmiPage clickOnUpdateButton() {
        Selenide.switchTo().defaultContent();
        updateButton.shouldBe(visible).click();
        return this;
    }

    public ReadmiPage clickOnCancelButton() {
        Selenide.switchTo().defaultContent();
        cancelButton.shouldBe(visible).click();
        return this;
    }

}

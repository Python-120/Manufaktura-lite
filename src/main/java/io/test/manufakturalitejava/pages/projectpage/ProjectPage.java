package io.test.manufakturalitejava.pages.projectpage;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ProjectPage {
// private SelenideElement readme = $("#ember40");
    private SelenideElement readme = $x("//div[@id='ember3']//a[@id='ember40']");
    private SelenideElement iframe = $("iframe[src*='/ember-monaco/frame.html']");
    private SelenideElement editButton = $("ember73");

    public ProjectPage clickToReadme() {
        readme.shouldBe(visible).click();
        return this;

    }

    public ProjectPage switchToReadmeIframe() {
        iframe.shouldBe(visible); // можно добавить wait, если грузится долго
        switchTo().frame(iframe);
        return this;
    }


    public ProjectPage clickToEditButton() {
        editButton.shouldBe(visible).click();
        return this;
    }


    public ProjectPage exitIframe() {
        switchTo().defaultContent();
        return this;
    }
}
package io.test.manufakturalitejava.pages.homepage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HeaderMenu {

    private SelenideElement dashboardLink = $x("//div[@class='auth-header-nav-left-items']/a[text()='Dashboard']");
    private SelenideElement companiesLink = $x("//div[@class='auth-header-nav-left-items']/a[text()='Companies']");
    private SelenideElement analyticsLink = $x("//div[@class='auth-header-nav-left-items']/a[text()='Analytics']");
    private SelenideElement docsLink = $x("//div[@class='auth-header-nav-left-items']/a[text()='Docs']");
    private SelenideElement changelogLink = $x("//div[@class='auth-header-nav-left-items']/a[text()='Changelog']");
    private SelenideElement publicApiLink = $x("//div[@class='auth-header-nav-left-items']/a[text()='Public Api']");
    private SelenideElement createNewProjectButton = $("a[href='https://app.testomat.io/projects/new']");
    private SelenideElement globalTestSearch = $x("//button[@id='showGlobalSearchBtn']");
    private SelenideElement userMenu =  $x("//button[@id='user-menu-button']");
    private SelenideElement dopDownMenu = $x("//div[@id='profile-menu']");


    public void clickDashboard() {
        dashboardLink
                .shouldBe(visible)
                .click();
    }

    public void clickCompanies() {
        companiesLink
                .shouldBe(visible)
                .click();
    }

    public void clickAnalytics() {
        analyticsLink
                .shouldBe(visible)
                .click();
    }

    public void clickDocsLink() {
        docsLink
        .shouldBe(visible)
        .click();

    }

    public void clickChangelogLink() {
        changelogLink
                .shouldBe(visible)
                .click();
    }

    public void clickPublicApiLink() {
        publicApiLink
                .shouldBe(visible)
                .click();
    }
}
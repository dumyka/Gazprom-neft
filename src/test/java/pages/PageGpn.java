package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class PageGpn {
  private final String TEXT = "«Газпром нефть» — технологический лидер нефтегазового рынка России";
  private final String TEXT2 = "Карьера в «Газпром нефти»";
  private final String TEXT3 = "Профориентационные мероприятия";
  private final String TEXT4 = "Мобильные приложения «Газпром нефти»";
  private final String TEXT5 = "Вакансии";
  private final String TEXT6 = "Инженер метролог";
  private final String TEXT7 = "Контакты";
  private final String TEXT8 = "Газпром нефть";
  private final String TEXT9 = "О компании";


  public PageGpn openPageGpn() {

    open("https://www.gazprom-neft.ru/");
    $("h1.about-section__title").shouldHave(text(TEXT));
    return this;
  }

  public PageGpn openCareerPage() {
    $(".recommended-section__list").$("a[href='https://career.gazprom-neft.ru/']").click();
    $("h1.mb-3").shouldHave(text(TEXT2));
    return this;
  }

  public PageGpn openGraduatesPage() {
    $("a[href='/graduates/']").click();
    return this;
  }

  public PageGpn verifyResult() {
    $(".career-main .career-events").shouldHave(text(TEXT3));
    return this;
  }

  public PageGpn openAppPage() {
    $(".recommended-section-item--4").click();
    return this;
  }

  public PageGpn verifyMobileApps() {
    $(".content .container").shouldHave(text(TEXT4));
    return this;
  }

  public PageGpn openVacancies(){
    $("footer a[href='https://career.gazprom-neft.ru/vacancies/']").click();
    $("h1").shouldHave(text(TEXT5));
    return this;
  }

  public PageGpn searchVacancy(){
    $("[placeholder='Поиск по ключевым словам']").setValue(TEXT6);
    $("button[type=submit]").click();
    return this;
  }

  public PageGpn verifyVacancy(){
    $(".vacancy h3").shouldHave(text(TEXT6));
    return this;
  }

  public PageGpn openContacts(){
    $("footer a[href='/company/contacts/']").click();
    return this;
  }

  public PageGpn verifyContacts(){
    $(".page__title").shouldHave(text(TEXT7));
    return this;
  }

  public PageGpn openGpnChannelInRutube(){
    $("footer a[href='https://rutube.ru/channel/24804454/']").click();
    switchTo().window(1);
    return this;
  }

  public PageGpn verifyGpnChannelInRutube(){
    $("h1").shouldHave(text(TEXT8));
    return this;
  }

  public PageGpn openCompany(){
    $(".header__main a[href='/company/']").doubleClick();
    return this;
  }

  public PageGpn verifyAboutCompany() {
    $(".tile__body").shouldHave(text(TEXT9));
    return this;
  }
}

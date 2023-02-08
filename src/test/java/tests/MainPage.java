package tests;

import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPage extends TestBase {

  @DisplayName("Страница стажировки содержит профориентационные мероприятия")
  @Test
  void openPageInternship() {
    step("Открытие страницы Газпром-нефть", () -> {
      pageGPN.openPageGpn();
    });
    step("Переход в раздел карьера", () -> {
      pageGPN.openCareerPage();
    });
    step("Переход в раздел стажировки", () -> {
      pageGPN.openGraduatesPage();
    });
    step("Проверка, что страница содержит профориентационные мероприятия", () -> {
      pageGPN.verifyResult();
    });
  }

  @DisplayName("Страница с приложениями содержит только приложения ГПН")
  @Test
  void onPageOnlyGpnApp() {
    step("Открытие страницы Газпром-нефть", () -> {
      pageGPN.openPageGpn();
    });
    step("Открытие раздела с мобильными приложениями", () -> {
      pageGPN.openAppPage();
    });
    step("Проверка,что на странице мобильные приложения ГПН", () -> {
      pageGPN.verifyMobileApps();
    });
  }

  @DisplayName("При поиске вакансий отображается правильный результат")
  @Test
  void searchJob() {
    step("Открытие страницы Газпром-нефть", () -> {
      pageGPN.openPageGpn();
    });
    step("Переход  в раздел с вакансиями", () -> {
      pageGPN.openVacancies();
    });
    step("Ввод вакансии Инженер метролог", () -> {
      pageGPN.searchVacancy();
    });
    step("Проверка, что вакансия появилась в результатах поиска", () -> {
      pageGPN.verifyVacancy();
    });
  }

  @DisplayName("Переход в канал ГПН в RuTube при нажатии на ссылку")
  @Test
  void goToRuTube() {
    step("Открытие страницы Газпром-нефть", () -> {
      pageGPN.openPageGpn();
    });
    step("Переход в RuTube на канал ГПН", () -> {
      pageGPN.openGpnChannelInRutube();
    });
    step("Проверка, что название канала Газпром нефть", () -> {
      pageGPN.verifyGpnChannelInRutube();
    });
  }

  @DisplayName("Страница с контактами содержит контакты ГПН")
  @Test
  void contactsGpn() {

    step("Открытие страницы Газпром-нефть", () -> {
      pageGPN.openPageGpn();
    });
    step("Переход на страницу с контактами ГПН", () -> {
      pageGPN.openContacts();
    });
    step("Проверка, что контакты относятся к ГПН", () -> {
      pageGPN.verifyContacts();
    });
  }

  @DisplayName("В разделе Компания есть статья о компании")
  @Test
  void aboutCompany() {

    step("Открытие страницы Газпром-нефть", () -> {
      pageGPN.openPageGpn();
    });
    step("Открыть раздел Компания", () -> {
      pageGPN.openCompany();
    });
    step("Проверка, что статья про компанию есть", () -> {
      pageGPN.verifyAboutCompany();
    });
  }

}


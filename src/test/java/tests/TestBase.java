package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.PageGpn;

public class TestBase {

  PageGpn pageGPN = new PageGpn();


  @BeforeAll
  static void beforeAll() {
    Configuration.browserSize = "1920x1080";
    Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    //Configuration.holdBrowserOpen = true;
  }
}

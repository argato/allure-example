package io.qameta.allure;

import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Epic 3")
@Owner("arina_ng")
public class ManualTest {

  @Test
  @AllureId("3304")
  @DisplayName("Manual test-case")
  @Story("Close existing issue")
  @Feature("Issues")
  @Microservice("Billing")

  public void manualTestFromAllureTestCase() {
    step("My scenario step 1");
    step("My scenario step 2");
    step("My scenario step 3");
    step("My scenario step 4");
  }

  @Test
  @AllureId("3309")
  @DisplayName("Manual test-case Manual second test-case")
  @Story("Close existing issue")
  @Feature("Issues")
  @Microservice("Billing")
  public void manualTestFromAllureSecondImport() {
    step("My scenario step 1");
    step("My scenario step 2");
    step("My scenario step 3");
    step("My scenario step 4");
  }
}

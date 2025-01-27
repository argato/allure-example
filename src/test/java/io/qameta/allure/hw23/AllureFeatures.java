package io.qameta.allure.hw23;

import io.qameta.allure.Feature;
import io.qameta.allure.Layer;
import io.qameta.allure.Microservice;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface AllureFeatures {

  @Documented
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Feature("Issues")
  @Component("Веб-интерфейс")
  @AutoMember("anovikova")
  @ManualMember("ipetrov")
  @interface Issues {

  }

  @Documented
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Feature("PullRequests")
  @Component("Веб-интерфейс")
  @AutoMember("ivanov")
  @ManualMember("ipetrov")
  @interface PullRequests {

  }

  @Documented
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Feature("Milestones")
  @Component("Веб-интерфейс")
  @AutoMember("sidorov")
  @ManualMember("sidorov")
  @interface Milestones {

  }

  @Documented
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.METHOD, ElementType.TYPE})
  @Feature("Incidents")
  @Layer("web")
  @Microservice("playbook")
  @AutoMember("kirov")
  @ManualMember("sidorov")
  @interface WithLayerAndMicroservice {

  }
}

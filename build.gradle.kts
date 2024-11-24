plugins {
  id("org.sonarqube") version "5.1.0.4882"
}
    
sonar {
  properties {
    property("sonar.projectKey", "StaticCode")
    property("sonar.projectName", "StaticCode")
  }
}

val root = (project in file("."))
  .settings(
    organization := "com.google.code.play2-maven-plugin.test-projects.play23.java.ebean-single-module.play-layout",
    name := "ebean-example",
    version := "1.0.0-rc3-SNAPSHOT",
    scalaVersion := "2.11.12",
    libraryDependencies ++= Seq(
      javaEbean,
      "com.h2database" % "h2" % "1.4.196" % Runtime,
      "org.assertj" % "assertj-core" % "3.6.2" % Test,
      "org.awaitility" % "awaitility" % "2.0.0" % Test
    ),
    testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v")),
    TwirlKeys.templateImports += "models2._"
  )
  .enablePlugins(
    PlayJava
  )

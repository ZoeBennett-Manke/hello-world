val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Password Checker",
    version := "0.0.1",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
  )

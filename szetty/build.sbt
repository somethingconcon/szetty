import Dependencies._
import Settings._

lazy val szetty = (project in file("szetty")).
  settings(Settings.settings: _*).
  settings(Settings.szettySettings: _*).
  configs(Test)


name := "boner-di"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies += "com.google.inject" % "guice" % "4.1.0"

initialCommands := "import example._"

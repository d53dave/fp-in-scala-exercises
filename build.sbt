name := "fp-in-scala-exercises"

organization := "net.d53dev"

version := "0.0.1"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.8.8" % "test" withSources() withJavadoc(),
  "org.specs2" %% "specs2-scalacheck" % "3.8.8" % "test" withSources() withJavadoc()
)

initialCommands := "import net.d53dev.fpinscalaexercises._"


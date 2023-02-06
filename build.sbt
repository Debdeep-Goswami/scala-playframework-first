name := """first-scala-project"""
organization := "com.techsophy"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.10"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

//assemblyMergeStrategy in assembly := {
//  case PathList("META-INF", _*) => MergeStrategy.discard
//  case _                        => MergeStrategy.first
//}

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.techsophy.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.techsophy.binders._"

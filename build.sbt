name := """TwitterFeed"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "4.0.2",
  "org.twitter4j" % "twitter4j-stream" % "4.0.2",
  "com.typesafe.akka" %% "akka-actor" % "2.4.1",
  "com.typesafe.akka" %% "akka-http-core-experimental" % "2.0-M2",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.0-M2",
  "com.typesafe.akka" %% "akka-stream-experimental" % "2.0-M2",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.1" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test")

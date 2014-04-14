name := "scalate-template"

version := "1.0"

scalaVersion := "2.10.4"

unmanagedSourceDirectories in Compile <<= (scalaSource in Compile)(Seq(_))

unmanagedSourceDirectories in Test <<= (scalaSource in Test)(Seq(_))

org.scalatra.sbt.ScalatraPlugin.scalatraSettings

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.2.2" exclude("org.slf4j", "slf4j-log4j12"),
  "org.scalatra" %% "scalatra-scalatest" % "2.2.2" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.13" % "runtime",
  "org.scalatest" % "scalatest_2.10"  % "2.0" % "test",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.8.v20121106" % "container;test",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test" artifacts Artifact("javax.servlet", "jar", "jar"),
  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)


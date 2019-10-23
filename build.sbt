resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases") )

lazy val commonSettings = Seq(
  scalaVersion := "2.12.8",
  scalaVersion in ThisBuild := "2.12.8",
  scalacOptions ++= Seq("-Xsource:2.11"),
  scalacOptions ++= Seq("-unchecked", "-deprecation"),
  libraryDependencies += "edu.berkeley.cs" % "chisel3_2.12"          %  "3.2.0",
  libraryDependencies += "edu.berkeley.cs" % "chisel-iotesters_2.12" %  "1.3.0",
  libraryDependencies += "edu.berkeley.cs" % "chisel-testers2" % "0.1-SNAPSHOT",
  updateOptions := updateOptions.value.withLatestSnapshots(false),
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
  //libraryDependencies += "edu.berkeley.cs" % "rocketchip"       %  "latest.integration"
)

lazy val example = (project in file("."))
  .settings(commonSettings)

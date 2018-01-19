name := "toy"
 
version := "1.0" 
      
lazy val `toy` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

javacOptions ++= Seq(
  "-source", "1.8",
  "-target", "1.8",
"-Xlint")

scalacOptions in Compile := Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:_",
  "-unchecked",
  "-Xlint:_",
  "-Xfuture",
  "-Ywarn-dead-code",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused",
  "-Ywarn-unused-import",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "javax.xml.bind" % "jaxb-api" % "2.3.0",
  jdbc,
  ehcache,
  ws,
  specs2 % Test,
  guice
)


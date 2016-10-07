
name := "ureact"
version := "0.1.0"
scalaVersion := "2.11.8"
organization := "com.jspha"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))


bintrayOrganization := Some("jspha")
bintrayRepository := "maven"
bintrayPackageLabels := Seq("react", "scalajs", "facade")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

enablePlugins(ScalaJSPlugin)

val scalajsDomVersion = "0.9.1"
val reactVersion = "15.3.1"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % scalajsDomVersion
)

jsDependencies ++= Seq(

  "org.webjars.bower" % "react" % reactVersion
    /        "react.js"
    minified "react.min.js"
    commonJSName "React",

  "org.webjars.bower" % "react" % reactVersion
    /         "react-dom.js"
    minified  "react-dom.min.js"
    dependsOn "react-with-addons.js"
    commonJSName "ReactDOM",

  "org.webjars.bower" % "react" % reactVersion
    /         "react-dom-server.js"
    minified  "react-dom-server.min.js"
    dependsOn "react-dom.js"
    commonJSName "ReactDOMServer"

)


resolvers +=
  Resolver.jcenterRepo
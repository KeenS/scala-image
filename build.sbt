lazy val root = (project in file(".")).
  settings(
    name := "image",
    version := "1.0",
    scalaVersion := "2.11.6"
  )

libraryDependencies += "com.sksamuel.scrimage" %% "scrimage-core" % "2.0.2"

libraryDependencies += "com.sksamuel.scrimage" %% "scrimage-io" % "2.0.2"

libraryDependencies += "com.sksamuel.scrimage" %% "scrimage-filters" % "2.0.2"

libraryDependencies += "org.apache.xmlgraphics" % "batik-codec" % "1.7"

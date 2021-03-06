organization := "scalastic"

name := "scalastic"
 
version := "0.90.0"

crossScalaVersions := Seq("2.9.1", "2.9.2", "2.10.0", "2.10.1")
 
scalaVersion := "2.10.1" 

scalacOptions ++= Seq("-unchecked", "-feature", "-deprecation")

libraryDependencies += "org.elasticsearch" % "elasticsearch" % "0.90.0"
	
libraryDependencies += "com.spatial4j" % "spatial4j" % "0.3"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "6.0.4"

libraryDependencies += "org.clapper" %% "grizzled-slf4j" % "1.0.1"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.2"



libraryDependencies += "junit" % "junit" % "4.10" % "test"
	
libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"



publishArtifact in Test := true

publishArtifact in Compile := true

parallelExecution in Test := false

resolvers += "sonatype releases" at "http://oss.sonatype.org/content/repositories/releases"

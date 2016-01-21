name := "lambda poc"
version := "1.0"
scalaVersion := "2.11.7"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % "1.6.0",
  "org.apache.spark" %% "spark-streaming-kafka" % "1.6.0",
  "org.apache.spark" %% "spark-core" % "1.6.0" % "provided" excludeAll(
                                                                    ExclusionRule(organization = "org.scala-lang"),
                                                                    ExclusionRule("jline", "jline"),
                                                                    ExclusionRule("org.slf4j", "slf4j-api"),
                                                                    ExclusionRule("org.apache.commons", "commons-lang3")
                                                                    ),
  "com.datastax.spark" %% "spark-cassandra-connector" % "1.5.0-RC1"
)
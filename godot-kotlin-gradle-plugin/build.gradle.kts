import org.apache.tools.ant.filters.ReplaceTokens
import java.io.FileInputStream
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

plugins {
  `kotlin-dsl`
  `maven-publish`
  id("com.gradle.plugin-publish") version "0.10.1"
}

gradlePlugin {
  plugins {
    create("godotPlugin") {
      id = "com.github.raniejade.godot-kotlin"
      displayName = "Gradle plugin for godot-kotlin"
      implementationClass = "godot.gradle.GodotPlugin"
    }

    create("godotToolPlugin") {
      id = "com.github.raniejade.godot-kotlin.plugin"
      displayName = "Gradle plugin for authoring Godot plugins in godot-kotlin."
      implementationClass = "godot.gradle.GodotToolPlugin"
    }
  }
  isAutomatedPublishing = false
}

pluginBundle {
  website = "https://github.com/raniejade/godot-kotlin"
  vcsUrl = "https://github.com/raniejade/godot-kotlin.git"
  tags = listOf("kotlin", "godot", "gamedev")

  mavenCoordinates {
    groupId = "com.github.raniejade"
    artifactId = "godot-kotlin-gradle-plugin"
    version = "${project.version}"
  }
}

repositories {
  jcenter()
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation(kotlin("gradle-plugin"))
  implementation(kotlin("gradle-plugin-api"))
  implementation("com.squareup:kotlinpoet:1.5.0")
}

tasks {
  val processResources by getting(Copy::class) {
    outputs.upToDateWhen { false }
    val tokens = mapOf("version" to version.toString())
    from("src/main/resources") {
      include("*.properties")
      filter<ReplaceTokens>("tokens" to tokens)
    }
  }

  val sourceJar by creating(Jar::class) {
    archiveBaseName.set("godot-kotlin-gradle-plugin")
    archiveVersion.set(project.version.toString())
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
  }
}

if (Files.exists(Paths.get("$rootDir/../local.properties"))) {
  val localProperties = Properties()
  localProperties.load(FileInputStream("$rootDir/../local.properties"))
  localProperties.forEach { prop -> project.extra.set(prop.key as String, prop.value) }
}

var releaseMode = false
if ("$version".matches(Regex("^\\d+\\.\\d+\\.\\d+(-rc\\.\\d+)?"))) {
  releaseMode = true
}
project.extra["releaseMode"] = releaseMode
project.extra["artifacts"] = arrayOf("godotPlugin")

publishing {
  publications {
    val godotPlugin by creating(MavenPublication::class) {
      from(components.getByName("java"))
      artifact(tasks.getByName("sourceJar"))
    }
  }
}

apply {
  plugin(BintrayPublish::class.java)
}
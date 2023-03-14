pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    plugins {
        kotlin("multiplatform").version(extra["kotlinVersion"] as String)
        id("org.jetbrains.compose").version(extra["compose.version"] as String)

        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
    }
}

include("general-stuff")
include("sandbox")
include("exchanges-ui")


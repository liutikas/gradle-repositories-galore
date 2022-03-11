buildscript {
    // Specifies repositories to use for build.gradle..kts build script classpath,
    // used to resolve dependencies specified in `dependencies {}` block below.
    // This loads these dependencies to be available for the settings.gradle.kts script
    // outside of `buildscript {}` block. It is helpful to load binary plugins that
    // might not publish to pom that supports Gradle `plugins {}` DSL
    //
    // In general, you should avoid using this, unless you have to. Loading plugins with
    // `plugins {}` DSL is preferred.
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.google.guava:guava:31.1-jre")
    }
}

// Example of the modern way of loading Gradle plugins. This uses plugin
// repositories defined in settings.gradle.kts `pluginManagement {}` block.
plugins {
    id("com.android.application") version "7.3.0-alpha05" apply false
    id("java")
}

// Specifies build repositories to use for resolving `dependencies {}` below for this root `:`
// project only. This list of repositories overrides the list of repositories specified in
// settings.gradle.kts `dependencyResolutionManagement {}` block.
//
// Avoid using this, as it only applies to the root project, and it also overrides the centralized
// settings.gradle.kts `dependencyResolutionManagement {}` location that is better.
repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
}

subprojects {
    // Specifies build repositories to use for resolving `dependencies {}` below for all subprojects
    // under root `:` project, like `:lib`. This list of repositories overrides the list of
    // repositories specified in settings.gradle.kts `dependencyResolutionManagement {}` block.
    //
    // Avoid using this, as it overrides the centralized settings.gradle.kts
    // `dependencyResolutionManagement {}` location that is better.
    repositories {
        mavenCentral()
        google()
    }
}

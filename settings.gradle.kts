rootProject.name = "Repositories"
include("lib")

pluginManagement {
    // Specifies plugin repositories to use for plugins {} DSL. This allows Gradle to resolve
    // entries in build.gradle.kts like:
    // plugins {
    //     id("com.android.application") version "7.3.0-alpha05"
    // }
    //
    // If plugin repositories are not specified here, Gradle defaults to gradlePluginPortal()
    //
    // Note, there repositories do not affect `dependencies {}` block resolution in your
    // build.gradle.kts
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
}

buildscript {
    // Specifies repositories to use for settings.gradle.kts build script classpath,
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

dependencyResolutionManagement {
    // Specifies build repositories to use that are for resolving `dependencies {}` entries
    // in various build.gradle.kts throughout your builds. These repository entries will be
    // used if the project build.gradle.kts does not declare its own build repositories.
    // If you want to lock the control, you can also add
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) to this block.
    //
    // This repositories location is the preferred way to centralize your build repositories as
    // it gives you one place to easy control the whole build behavior.
    repositories {
        mavenCentral()
        google()
    }
}

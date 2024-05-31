plugins {
    `java-library`
}

repositories {
    maven {
        url = uri("https://repo.grdev.net/artifactory/libs-snapshots-local")
    }
    mavenCentral()
}

val apiVersion = "8.9-branch-lptr_plugin_development_publish_gradle_apis-20240531151351+0000"

dependencies {
    implementation("org.gradle.experimental:gradle-public-api:${apiVersion}")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

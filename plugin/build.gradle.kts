plugins {
    `java-library`
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.gradle.experimental:gradle-api:8.9-SNAPSHOT")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

plugins {
    `java-library`
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    // We need at least one dependency to make sure Java does not
    // See https://github.com/gradle/gradle/pull/29343
    implementation("com.google.guava:guava:33.2.0-jre")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

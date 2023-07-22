plugins {
    id("java")
    id("application")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "me.amberichu.headextractor"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("me.amberichu.headextractor.HeadExtractor")
}


repositories {
    maven {
        url = uri("https://repo.opencollab.dev/main")
    }
    mavenCentral()
}

dependencies {
    implementation("com.github.steveice10", "opennbt", "1.5-SNAPSHOT")

    implementation("com.fasterxml.jackson.core", "jackson-core", "2.14.1")
    implementation("com.fasterxml.jackson.core", "jackson-databind", "2.14.1")
    implementation("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml", "2.14.1")
}
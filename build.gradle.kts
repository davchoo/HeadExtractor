plugins {
    id("java")
    id("application")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "me.davchoo.headextractor"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("me.davchoo.headextractor.HeadExtractor")
}


repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.opencollab.dev/maven-snapshots")
    }
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    implementation("com.github.steveice10", "opennbt", "1.5-SNAPSHOT")
}
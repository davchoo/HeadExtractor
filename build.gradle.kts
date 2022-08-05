plugins {
    id("java")
}

group = "me.davchoo.headextractor"
version = "1.0-SNAPSHOT"

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
plugins {
    kotlin("multiplatform") version "2.2.20"
}

group = "com.portalsoup.kotom"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        binaries {
            executable()
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {

            }
        }
        val nativeMain by getting
    }
}

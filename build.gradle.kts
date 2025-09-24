import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    kotlin("multiplatform") version "2.2.20"
}

group = "com.portalsoup.mox"
version = "0.0.1"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21)
        }
    }

    linuxX64("native") {

        val main by compilations.getting
        val interop by main.cinterops.creating

        binaries {
            executable()
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                implementation("com.github.ajalt.clikt:clikt-core:5.0.3")
            }
        }

        jvmMain {
        }

        nativeMain {
        }
    }
}

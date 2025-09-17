package com.kotom

import Kotom
import com.kotom.io.File

fun main(args: Array<String>) {
    Kotom(File("build.gradle.kts")).run()
}
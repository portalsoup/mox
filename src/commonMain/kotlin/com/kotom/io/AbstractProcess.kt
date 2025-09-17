package com.kotom.io

abstract class AbstractProcess(val name: String, val args: List<String>) {

    abstract fun replace()
}
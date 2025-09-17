package com.kotom.io

abstract class AbstractFile(val name: String) {
    abstract fun read(): String
    abstract fun write(data: ByteArray)
    abstract fun create()
    abstract fun delete()
    abstract fun exists(): Boolean
}